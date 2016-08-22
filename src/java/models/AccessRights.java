package models;

/**
 * Individual Element Access Rights.
 */
public abstract class AccessRights<IAccessable> {

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public IAccessable getTarget() {
        return Target;
    }

    public void setTarget(IAccessable Target) {
        this.Target = Target;
    }

    public Boolean getCanRead() {
        return CanRead;
    }

    public void setCanRead(Boolean CanRead) {
        this.CanRead = CanRead;
    }

    public Boolean getCanEdit() {
        return CanEdit;
    }

    public void setCanEdit(Boolean CanEdit) {
        this.CanEdit = CanEdit;
    }

    public Boolean getCanDestroy() {
        return CanDestroy;
    }

    public void setCanDestroy(Boolean CanDestroy) {
        this.CanDestroy = CanDestroy;
    }

    public Boolean getCanCreate() {
        return CanCreate;
    }

    public void setCanCreate(Boolean CanCreate) {
        this.CanCreate = CanCreate;
    }
    
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