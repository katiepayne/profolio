package interfaces;

import models.Comment;
import models.User;

/**
 * Public Commentable Interface
 */
public interface ICommentable {

    /**
     * Adds a comment to an ICommentable Entity.
     * 
     * @param user - User Adding the comment.
     * @param entity - ICommentable Entity being commented.
     * @param comment - Comment to add.
     * @return Comment.
     */
    Comment AddComment(User user, Object entity, Comment comment);

    /**
     * Adds a comment to an ICommentable Entity.
     * 
     * @param user - User Adding the comment.
     * @param entity - ICommentable Entity being commented.
     * @param title - Title of the comment.
     * @param content - Comment content.
     * @return Comment.
     */
    Comment AddComment(User user, ICommentable entity, String title, String content);

    /**
     * Updates a comment.
     * 
     * @param user - User requesting the update.
     * @param comment - Comment to be updated.
     */
    Comment UpdateComment(User user, Comment comment);
    
    /**
     * Removes a Comment from the Target Entity.
     * 
     * @param user - User who requested the removal.
     * @param comment - Comment to be removed.
     */
    void RemoveComment(User user, Comment comment );
    
    /**
     * Returns the Target Entity as ICommentable.
     * 
     * @return 
     */
    ICommentable Commentable();
}
