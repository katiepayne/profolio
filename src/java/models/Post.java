package models;

import java.util.Date;

/**
 * Blog Post Object Model.
 */
public class Post {
    
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
