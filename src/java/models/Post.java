package models;

import java.util.Date;

/**
 * Blog Post Object Model.
 */
public class Post {

    /**
     * Self Populating Constructor.
     * @param Title
     * @param Content
     * @param LastModifiedBy 
     */
    public Post(String Title, String Content, User LastModifiedBy) {
        this.Title = Title;
        this.Content = Content;
        this.LastModifiedBy = LastModifiedBy;
    }

    /**
     * Default Empty Constructor.
     */
    public Post() {}

    
    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

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

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public Date getLastModified() {
        return LastModified;
    }

    public void setLastModified(Date LastModified) {
        this.LastModified = LastModified;
    }

    public User getLastModifiedBy() {
        return LastModifiedBy;
    }

    public void setLastModifiedBy(User LastModifiedBy) {
        this.LastModifiedBy = LastModifiedBy;
    }

    public Comments getComments() {
        return Comments;
    }

    public void setComments(Comments Comments) {
        this.Comments = Comments;
    }

    public Likes getLikes() {
        return Likes;
    }

    public void setLikes(Likes Likes) {
        this.Likes = Likes;
    }

    public Visibility getStatus() {
        return Status;
    }

    public void setStatus(Visibility Status) {
        this.Status = Status;
    }
    
    /**
     * Unique Identifier.
     */
    Integer Id;
    
    /**
     * Blog Title.
     */
    String Title;
    
    /**
     * Blog Content.
     */
    String Content;
    
    /**
     * Blog Post creation date
     */
    Date Date;
    
    /**
     * Date Post last Modified.
     */
    Date LastModified;
        
    /**
     * User who last modified the post.
     */
    User LastModifiedBy;

    /**
     * Comments Collection.
     */
    Comments Comments;
    
    /**
     * Likes Collection.
     */
    Likes Likes;
    
    /**
     * Blog Post Status.
     */
    Visibility Status;
}
