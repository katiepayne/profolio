package controllers;

import Bridge.Bridge;
import java.util.Dictionary;
import models.Comment;
import models.Comments;
import models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Comments Controller: Handles comment logic.
 */
@Controller
@RequestMapping("/posts/{postId}/comments")
public class CommentController {

    /**
     * Controller Key for the data bridge.
     */
    String ControllerKey = "posts";
    
    /**
     * Collection of Data Bridges.
     */
    Dictionary<String, Bridge> Databridge;
            
    /**
     * Default DataBridge for this controller.
     */
    Bridge<Post> CtrlBridge;

    /**
     * Default Constructor.
     */
    public CommentController() {
        // Populate the CtrlBridge for this controller.
        CtrlBridge = Databridge.get(ControllerKey);
    }

    /**
     * Returns the comments for a single post.
     * @param postId - Post ID.
     * @return Comments Collection.
     */
    @RequestMapping(value = "{postId}/comments/json", method = RequestMethod.GET)
    public Comments getPostComments (@RequestParam int postId) {
        return CtrlBridge.getObject(postId).getComments();
    }

    /**
     * Returns the comments for a single post.
     * @param postId - Post ID.
     * @return Comments Collection.
     */
    @RequestMapping(value = "{postId}/comments/{commentId}/json", method = RequestMethod.GET)
    public Comments getCommentReplies (@RequestParam int postId, @RequestParam int commentId ) {
        Comments comments = CtrlBridge.getObject(postId).getComments();
        
        // return the replies for the comment with the passed id.
        for(Comment c : comments)
            if( c.getId() == commentId )
                return c.getReplies();
        
        // Default return value.
        return null;
    }
    
    /**
     * Returns the bridged data values.
     * @param bridgeKey - Bridge Key
     * @return List of bridged data values.
     */
    @RequestMapping( value = "{postId}/comments/{commentId}", method = RequestMethod.PATCH )
    public Object updateBridgeValue (@RequestParam int commentId, Object value) {
        Bridge<Comment> commentBridge = Databridge.get("comments");
        return commentBridge.updateObject(value);
    }
    
    /**
     * Returns the bridged data values.
     * @param bridgeKey - Bridge Key
     * @return List of bridged data values.
     */
    @RequestMapping( value = "{postId}/comments/{commentId}", method = RequestMethod.DELETE )
    public String deleteBridgeValue (@RequestParam int postId, @RequestParam int commentId, Object value) {
        Bridge<Comment> commentBridge = Databridge.get("comments");
        commentBridge.destroyObject(value);
        
        // Redirect back to the post's view.
        return String.valueOf(postId);
    }
    
}
