package models;

/**
 * Like Object Model.
 */
public class Like extends Interaction<Like> {
    /**
     * Required Overridden Interaction Name.
     * @return 
     */
    @Override
    public String getName() {
        return "Like";
    }
}
