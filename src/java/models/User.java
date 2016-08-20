package models;

import java.util.List;

/**
 * User Object Model.
 */
public class User extends Person {
    /**
     * Unique Identifier.
     */
    Integer Id;
    
    /**
     * Username.
     */
    String Username;
    
    /**
     * Email Address.
     */
    String Email;    
    
    /**
     * User's assigned Roles.
     */
    List<Role> Roles;
    
    /**
     * Users Posts.
     */
    List<Post> Posts;
    
    /**
     * Users Comments.
     */
    List<Comment> Comments;
    
    /**
     * Other users whom this user is following.
     */
    List<User> Following;
    
    /**
     * Users who Follow this user.
     */
    List<User> Followers;
}
