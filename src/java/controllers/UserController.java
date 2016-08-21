package controllers;

import Bridge.Bridge;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * User Controller: Handler logic for Users.
 */
@Controller
@RequestMapping("/users")
public class UserController extends Bridge {

    /**
     * Default Constructor.
     */
    public UserController() {
        // Set the Base Keyname, via the constructor.
        super("users");
    }
    
    /**
    /**
     * Returns the bridged data values.
     * @param bridgeKey - Bridge Key
     * @return List of bridged data values.
     */
    @RequestMapping(value = "{id}/view", method = RequestMethod.GET)
    public ModelAndView getUserView (@RequestParam int id) {
        Map model = new HashMap();
        model.put("data", new BridgeData( );
        
        return new ModelAndView( "bridge", model );
    }
    
    /**
     * Returns the bridged data values.
     * @param bridgeKey - Bridge Key
     * @return List of bridged data values.
     */
    @RequestMapping(value = "{bridgeKey}/json", method = RequestMethod.GET)
    public List getBridgeValues (@RequestParam String bridgeKey) {
        return Databridge.get(bridgeKey).getObjects();
    }

    /**
     * Returns the bridged data values.
     * @param bridgeKey - Bridge Key
     * @return List of bridged data values.
     */
    @RequestMapping( value = "{bridgeKey}/{id}/json", method = RequestMethod.GET )
    public Object getBridgeValue (@RequestParam String bridgeKey, @RequestParam int id) {
        return Databridge.get(bridgeKey).getObject(id);
    }
    
    /**
     * Returns the bridged data values.
     * @param bridgeKey - Bridge Key
     * @return List of bridged data values.
     */
    @RequestMapping( value = "{bridgeKey}", method = RequestMethod.PATCH )
    public Object updateBridgeValue (@RequestParam String bridgeKey, Object value) {
        return Databridge.get(bridgeKey).updateObject(value);
    }
    
        /**
     * Returns the bridged data values.
     * @param bridgeKey - Bridge Key
     * @return List of bridged data values.
     */
    @RequestMapping( value = "{bridgeKey}", method = RequestMethod.DELETE )
    public String deleteBridgeValue (@RequestParam String bridgeKey, Object value) {
        Databridge.get(bridgeKey).destroyObject(value);
        return bridgeKey;
    }
}
