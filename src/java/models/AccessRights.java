/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 * Individual Element Access Rights.
 */
public abstract class AccessRights<IAccessable> {
    
    /**
     * Unique Identifier.
     */
    Integer Id;
    
    /**
     * Target Element for which the rights apply.
     */
    IAccessable Target;
    
    /**
     * Read Access Flag.
     */
    Boolean CanRead;
    
    /**
     * Edit Access Flag.
     */
    Boolean CanEdit;
    
    /**
     * Destroy Access Flag.
     */
    Boolean CanDestroy;
    
    /**
     * Creation Access Flag.
     */
    Boolean CanCreate;    
}