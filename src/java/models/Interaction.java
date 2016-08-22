package models;

import java.util.Date;

/**
 * Interaction Abstract Base Class.
 */
public abstract class Interaction<T> {
    /**
     * Unique Identifier.
     */
    Integer Id;
    
    /**
     * Target Object.
     */
    T Target;
    
    /**
     * User who is interacting.
     */
    User User;
    
    /**
     * Date of Interaction.
     */
    Date Date;
    
    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public T getTarget() {
        return Target;
    }

    public void setTarget(T Target) {
        this.Target = Target;
    }

    public models.User getUser() {
        return User;
    }

    public void setUser(models.User User) {
        this.User = User;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date Date) {
        this.Date = Date;
    }

    
    /**
     * Abstract method to be defined by implementing class, as this will be
     * specific the the implementing class, but is still required.
     * @return 
     */
    public abstract String getName();
}
