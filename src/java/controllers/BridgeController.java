package controllers;

import Bridge.Bridge;
import Bridge.BridgeData;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

/**
 * Bridge Controller: Handles Interfaces with external data sources.
 * For Example: LinkedIn, GitHub, OAuth, Etc..
 */
@RequestMapping("/bridge")
@Controller
public class BridgeController {

    /**
     * Collection of data bridged items.
     */
    Dictionary<String, Bridge> Databridge;

    /**
     * Returns the bridged data values.
     * @param bridgeKey - Bridge Key
     * @return List of bridged data values.
     */
    @RequestMapping(value = "{bridgeKey}/view", method = RequestMethod.GET)
    public ModelAndView getBridgeView (@RequestParam String bridgeKey) {
        Map model = new HashMap();
        model.put("data", new BridgeData( Databridge.get(bridgeKey).getObjects() ) );
        
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
