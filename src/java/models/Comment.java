package models;

/**
 * Comment Object Model.
 */
public class Comment extends Interaction<Comment> {    
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
