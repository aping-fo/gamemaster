package generator.utils;

public class ConfigItem {

    public String pkg;
    public String domain;
    public String primaryKeyField;
    public String uriPath;

    public String getPkg() {
        return pkg;
    }

    public void setPkg(String pkg) {
        this.pkg = pkg;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPrimaryKeyField() {
        return primaryKeyField;
    }

    public void setPrimaryKeyField(String primaryKeyField) {
        this.primaryKeyField = primaryKeyField;
    }

    public String getUriPath() {
        return uriPath;
    }

    public void setUriPath(String uriPath) {
        this.uriPath = uriPath;
    }

    @Override
    public String toString() {
        return "ConfigItem [pkg=" + pkg + ", domain=" + domain + ", primaryKeyField=" + primaryKeyField + ", uriPath="
                + uriPath + "]";
    }
}
