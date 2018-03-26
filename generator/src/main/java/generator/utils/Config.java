package generator.utils;

import java.util.List;

public class Config {
    private String target;
    private List<ConfigItem> items;
    private List<ConfigItem> unused;

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public List<ConfigItem> getItems() {
        return items;
    }

    public void setItems(List<ConfigItem> items) {
        this.items = items;
    }

    public List<ConfigItem> getUnused() {
        return unused;
    }

    public void setUnused(List<ConfigItem> unused) {
        this.unused = unused;
    }
}
