package models;

import java.util.Iterator;
import java.util.List;

/**
 * Iterable Comments Collection Manager.
 */
public class Comments implements Iterable<Comment> {
    
    /**
     * Comment Collection.
     */
    List<Comment> comments;
    
    /**
     * Gets the comment count.
     * @return Comment Count.
     */
    public int count() {
        return comments.size();
    }
    
    /**
     * Gets a Comment by Index.
     * @param index - Collection index.
     * @return Comment at the given index.
     */
    public Comment get(int index) {
        
        // Get the value, at the given index.
        return comments.get(index);
    }

    /**
     * Return self to support method chaining.
     * 
     * @param index - Index to set.
     * @param value - Value to set at the given index.
     * @return {Comments} - Self.
     */
    public Comments set(int index, Comment value ) {
        
        // Set the value.
        comments.set(index, value);
        
        // Return 'this' so it can be chained.
        return this;
    }

    /**
     *  Returns the current index within the Comments Collection.
     * 
     * @return Current index within the Comments Collection.
     */
    @Override
    public Iterator<Comment> iterator() {
        return comments.iterator();
    }    
}
