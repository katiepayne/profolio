package interfaces;

import models.AccessRights;
import models.Role;
import models.User;

/**
 * Entities for which AccessRights should be applied implement this interface.
 */
public interface IAccessable {
    
    /**
     * Checks the AccessRights against the IAccessable Entity.
     * 
     * @param role - Role for which AccessRights will be checked.
     * @param rights - AccessRights.
     * @return Boolean - True if the role has access, otherwise false.
     */
    Boolean HasAccess( Role role, AccessRights rights );

    /**
     * Checks the AccessRights against the IAccessable Entity.
     * 
     * @param user - User for which AccessRights will be checked.
     * @param rights - AccessRights.
     * @return Boolean - True if the role has access, otherwise false.
     */
    Boolean HasAccess( User user, AccessRights rights );
}
