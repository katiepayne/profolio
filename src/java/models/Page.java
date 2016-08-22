package models;

import java.util.Date;
import java.util.List;

/**
 *
 */
public class Page {

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public User getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(User CreatedBy) {
        this.CreatedBy = CreatedBy;
    }

    public User getLastModifiedBy() {
        return LastModifiedBy;
    }

    public void setLastModifiedBy(User LastModifiedBy) {
        this.LastModifiedBy = LastModifiedBy;
    }

    public List<String> getTags() {
        return Tags;
    }

    public void setTags(List<String> Tags) {
        this.Tags = Tags;
    }
    
    /**
     * Page Title.
     */
    String Title;
    
    /**
     * Page Content.
     */
    String Content;
    
    /**
     * User who created this page.
     */
    User CreatedBy;
    
    /**
     * Date page was created.
     */
    Date CreatedOn;

    /**
     * User who last modified this page.
     */    
    User LastModifiedBy;

    /**
     * Date last modified.
     */    
    Date LastModified;

    /**
     * Tags collection.
     */
    List<String> Tags;
}
