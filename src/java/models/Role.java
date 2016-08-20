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
