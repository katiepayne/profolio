package controllers;

import Bridge.Bridge;
import java.util.Dictionary;
import models.Project;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Project Controller: Handles logic for Projects.
 */
@Controller
@RequestMapping(value = "/projects")
public class ProjectController {
    
    /**
     * Controller Key for the data bridge.
     */
    String ControllerKey = "projects";
    
    /**
     * Collection of Data Bridges.
     */
    Dictionary<String, Bridge> Databridge;
    
    /**
     * Default DataBridge for this controller.
     */
    Bridge<Project> CtrlBridge;

    /**
     * Default Constructor.
     */
    public ProjectController() {
        // Populate the CtrlBridge for this controller.
        CtrlBridge = Databridge.get(ControllerKey);
    }
    
    /**
     * Returns the post by its id.
     * @param projectId - Project ID.
     * @return Post.
     */
    @RequestMapping(value = "{projectId}/json", method = RequestMethod.GET)
    public Project getProject (@RequestParam int projectId) {
        return CtrlBridge.getObject(projectId);
    }
    
    /**
     * Updates a post by its id.
     * @param projectId - Project ID.
     * @return Post.
     */
    @RequestMapping( value = "{projectId}", method = RequestMethod.PATCH )
    public Object updateBridgeValue (@RequestParam int projectId, Object value) {
        return CtrlBridge.updateObject(value);
    }
    
    /**
     * Returns the bridged data values.
     * @param projectId - Project ID.
     */
    @RequestMapping( value = "{projectId}", method = RequestMethod.DELETE )
    public String deleteBridgeValue (@RequestParam int projectId, Object value) {
        CtrlBridge.destroyObject(value);
        
        // Redirect back to the home view.
        return "/";
    }
}
