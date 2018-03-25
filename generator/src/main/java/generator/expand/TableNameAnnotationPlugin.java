package generator.expand;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.TopLevelClass;

import java.util.List;

public class TableNameAnnotationPlugin extends PluginAdapter {
    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        super.modelBaseRecordClassGenerated(topLevelClass, introspectedTable);

        topLevelClass.addAnnotation("@Table(name=\"" + introspectedTable.getTableConfiguration().getTableName() + "\")");
        topLevelClass.addImportedType("javax.persistence.Table");
        return true;
    }
}
