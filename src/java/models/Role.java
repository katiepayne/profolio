/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 * Access Role for Type, T.
 */
public class Role<T> {
        
    /**
     * Unique Identifier.
     */
    Integer Id;
    
    /**
     * Role Name.
     */
    String Name;
    
    /**
     * Role Description.
     */
    String Description;
    
    /**
     * Enabled / Disabled Flag.
     */
    Boolean IsActive;
    
    /**
     * Access Rights Collection.
     */
    List<AccessRights<T>> Access;    
}
