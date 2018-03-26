package generator.utils;

import org.mybatis.generator.api.JavaFormatter;
import org.mybatis.generator.api.dom.DefaultJavaFormatter;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.config.Context;

public class MyFormatter extends DefaultJavaFormatter implements JavaFormatter {

    @Override
    public String getFormattedContent(CompilationUnit unit) {
        FullyQualifiedJavaType type = unit.getType();
        String name = type.getFullyQualifiedName();

        System.out.println(String.format(">\t%s", name));
        return unit.getFormattedContent();
    }

    @Override
    public void setContext(Context arg0) {

    }

}
