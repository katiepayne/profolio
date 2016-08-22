package controllers;

import Bridge.Bridge;
import java.util.Dictionary;
import models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * User Controller: Handler logic for Users.
 */
@Controller
@RequestMapping("/users")
public class UserController {

    /**
     * Controller Key for the data bridge.
     */
    String ControllerKey = "users";
    
    /**
     * Collection of Data Bridges.
     */
    Dictionary<String, Bridge> Databridge;
    
    /**
     * Default DataBridge for this controller.
     */
    Bridge<User> CtrlBridge;

    /**
     * Default Constructor.
     */
    public UserController() {
        // Populate the CtrlBridge for this controller.
        CtrlBridge = Databridge.get(ControllerKey);
    }
    
    /**
     * Returns the user by its id.
     * @param userId - User ID.
     * @return Post.
     */
    @RequestMapping(value = "{userId}/json", method = RequestMethod.GET)
    public User getUser (@RequestParam int userId) {
        return CtrlBridge.getObject(userId);
    }
    
    /**
     * Updates a user by its id.
     * @param userId - User ID.
     * @return Post.
     */
    @RequestMapping( value = "{userId}", method = RequestMethod.PATCH )
    public Object updateBridgeValue (@RequestParam int userId, Object value) {
        return CtrlBridge.updateObject(value);
    }
    
    /**
     * Returns the bridged data values.
     * @param userId - User ID.
     */
    @RequestMapping( value = "{userId}", method = RequestMethod.DELETE )
    public String deleteBridgeValue (@RequestParam int userId, Object value) {
        CtrlBridge.destroyObject(value);
        
        // Redirect back to the home view.
        return "/";
    }
}
