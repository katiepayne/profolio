package controllers;

import Bridge.Bridge;
import java.util.Dictionary;
import models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Post Controller: Handles logic for Posts.
 */
@Controller
@RequestMapping(value = "/posts")
public class PostController {
        
    /**
     * Controller Key for the data bridge.
     */
    String ControllerKey = "post";
    
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
    public PostController() {
        // Populate the CtrlBridge for this controller.
        CtrlBridge = Databridge.get(ControllerKey);
    }
    
    /**
     * Returns the post by its id.
     * @param postId - Post ID.
     * @return Post.
     */
    @RequestMapping(value = "{postId}/json", method = RequestMethod.GET)
    public Post getPost (@RequestParam int postId) {
        return CtrlBridge.getObject(postId);
    }
    
    /**
     * Updates a post by its id.
     * @param postId - Post ID.
     * @return Post.
     */
    @RequestMapping( value = "{postId}", method = RequestMethod.PATCH )
    public Object updateBridgeValue (@RequestParam int postId, Object value) {
        return CtrlBridge.updateObject(value);
    }
    
    /**
     * Returns the bridged data values.
     * @param postId - Post ID.
     */
    @RequestMapping( value = "{postId}", method = RequestMethod.DELETE )
    public String deleteBridgeValue (@RequestParam int pageId, Object value) {
        CtrlBridge.destroyObject(value);
        
        // Redirect back to the home view.
        return "/";
    }
}
