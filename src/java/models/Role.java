package models;

import java.util.List;

/**
 * Access Role for Type, T.
 */
public class Role<T> {

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Boolean getIsActive() {
        return IsActive;
    }

    public void setIsActive(Boolean IsActive) {
        this.IsActive = IsActive;
    }

    public List<AccessRights<T>> getAccess() {
        return Access;
    }

    public void setAccess(List<AccessRights<T>> Access) {
        this.Access = Access;
    }
        
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
