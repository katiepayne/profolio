package models;

/**
 * Comment Object Model.
 */
public class Comment extends Interaction<Comment> {    

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public Comments getReplies() {
        return Replies;
    }

    public void setReplies(Comments Replies) {
        this.Replies = Replies;
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

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Comment getTarget() {
        return Target;
    }

    public void setTarget(Comment Target) {
        this.Target = Target;
    }

    public models.User getUser() {
        return User;
    }

    public void setUser(models.User User) {
        this.User = User;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date Date) {
        this.Date = Date;
    }
    
    /**
     * Unique Identifier.
     */
    Integer Id;
    
    /**
     * Comment Content.
     */
    String Content;
    
    /**
     * Comment Replies.
     */
    Comments Replies;
    
    /**
     * Comment Likes;
     */
    Likes Likes;
    
    /**
     * Comment Visibility Status.
     */
    Visibility Status;
    
    /**
     * Required Overridden Interaction Name.
     * @return 
     */
    @Override
    public String getName() {
        return "Comment";
    }       
}
