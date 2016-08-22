package controllers;

import Bridge.Bridge;
import java.util.Dictionary;
import java.util.List;
import models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Home controller: Handles logic for the front page.
 */
@Controller
@RequestMapping("/blog")
public class BlogController {

    /**
     * Controller Key for the data bridge.
     */
    String ControllerKey = "blog";
    
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
    public BlogController() {
        // Populate the CtrlBridge for this controller.
        CtrlBridge = Databridge.get(ControllerKey);
    }
    
    /**
     * TODO - Add additional endpoint so we don't have to get all posts.
     * @return 
     */
    @RequestMapping( value = "recent", method = RequestMethod.GET )
    public List<Post> getPosts() {
        
        // Get all posts.
        List<Post> posts = CtrlBridge.getObjects();
        
        // Sort by post date.
        posts.sort( (a, b) -> b.getDate().compareTo(a.getDate()) );
        
        // Return the first 10.
        return posts.subList(0, 10);
    }
}
