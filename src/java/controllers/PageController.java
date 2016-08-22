package controllers;

import Bridge.Bridge;
import java.util.Dictionary;
import models.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Page Controller: Handles Static Pages.
 */
@Controller
@RequestMapping(value = "/pages")
public class PageController {
    
    /**
     * Controller Key for the data bridge.
     */
    String ControllerKey = "pages";
    
    /**
     * Collection of Data Bridges.
     */
    Dictionary<String, Bridge> Databridge;
    
    /**
     * Default DataBridge for this controller.
     */
    Bridge<Page> CtrlBridge;

    /**
     * Default Constructor.
     */
    public PageController() {
        // Populate the CtrlBridge for this controller.
        CtrlBridge = Databridge.get(ControllerKey);
    }
    
    /**
     * Returns the page by its id.
     * @param pageId - Page ID.
     * @return Page.
     */
    @RequestMapping(value = "{pageId}/json", method = RequestMethod.GET)
    public Page getPage (@RequestParam int pageId) {
        return CtrlBridge.getObject(pageId);
    }
    
    /**
     * Updates a page by its id.
     * @param pageId - Page ID.
     * @return Page.
     */
    @RequestMapping( value = "{pageId}", method = RequestMethod.PATCH )
    public Object updateBridgeValue (@RequestParam int pageId, Object value) {
        return CtrlBridge.updateObject(value);
    }
    
    /**
     * Returns the bridged data values.
     * @param pageId - Page ID.
     */
    @RequestMapping( value = "{pageId}", method = RequestMethod.DELETE )
    public String deleteBridgeValue (@RequestParam int pageId, Object value) {
        CtrlBridge.destroyObject(value);
        
        // Redirect back to the home view.
        return "/";
    }
}
