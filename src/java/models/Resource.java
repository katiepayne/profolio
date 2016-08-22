package models;

import java.util.Dictionary;
import java.util.List;

/**
 * Generic Site resource.
 */
public class Resource {
    String Path;
    String Name;
    String Description;
    List<String> Tags;
    Dictionary<String, Object> Metadata;

    public String getPath() {
        return Path;
    }

    public void setPath(String Path) {
        this.Path = Path;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public List<String> getTags() {
        return Tags;
    }

    public void setTags(List<String> Tags) {
        this.Tags = Tags;
    }

    public Dictionary<String, Object> getMetadata() {
        return Metadata;
    }

    public void setMetadata(Dictionary<String, Object> Metadata) {
        this.Metadata = Metadata;
    }
}
