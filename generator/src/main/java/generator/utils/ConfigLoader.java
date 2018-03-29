package generator.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.core.util.Loader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public abstract class ConfigLoader {
    private final static Logger logger = LoggerFactory.getLogger(ConfigLoader.class);
    private static final Yaml yaml = new Yaml();

    /**
     * 通过指定路径名加载配置，支持通过环境变量（-D{pathname}={/path/to/file}）加载外部配置来覆盖全部或部分默认配置项。
     *
     * @param pathname
     * @param clazz
     * @return
     * @throws IOException
     */
    public static <T> T loadYamlAs(String pathname, Class<T> clazz) throws IOException {
        T obj = yaml.loadAs(ConfigLoader.load(pathname), clazz);

        String extFile = System.getProperty(pathname);
        if (!StringUtils.isBlank(extFile)) {
            logger.info("System property found: {}={}", pathname, extFile);
            T obj1 = yaml.loadAs(ConfigLoader.load(extFile), clazz);
            BeanUtils.copyProperties(obj1, obj, true);
        }

        return obj;
    }

    private static InputStream load(String path) throws IOException {
        logger.debug("Loading config: {}", path);

        // try to load absolute file
        File file = new File(path);
        if (file.isFile()) {
            logger.info("Loaded config: {}", file.getAbsolutePath());
            return new FileInputStream(file);
        }

        // load from class path
        URL url = Loader.getResource(path, ConfigLoader.class.getClassLoader());
        logger.info("Loaded config: {}", url.getPath());

        return url.openStream();
    }
}
