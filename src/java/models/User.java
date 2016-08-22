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

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public List<Role> getRoles() {
        return Roles;
    }

    public void setRoles(List<Role> Roles) {
        this.Roles = Roles;
    }

    public List<Post> getPosts() {
        return Posts;
    }

    public void setPosts(List<Post> Posts) {
        this.Posts = Posts;
    }

    public List<Comment> getComments() {
        return Comments;
    }

    public void setComments(List<Comment> Comments) {
        this.Comments = Comments;
    }

    public List<User> getFollowing() {
        return Following;
    }

    public void setFollowing(List<User> Following) {
        this.Following = Following;
    }

    public List<User> getFollowers() {
        return Followers;
    }

    public void setFollowers(List<User> Followers) {
        this.Followers = Followers;
    }
    
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
