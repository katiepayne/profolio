package models;

import java.util.Iterator;
import java.util.List;

/**
 * Iterable Likes Collection Manager.
 */
public class Likes implements Iterable<Like> {
    List<Like> likes;
    
    /**
     * Gets a like by Index.
     * @param index
     * @return 
     */
    public Like get(int index) {
        return likes.get(index);
    }

    /**
     * Return self to support method chaining.
     * @param index
     * @param value
     * @return {Likes} - Self.
     */
    public Likes set(int index, Like value ) {
        likes.set(index, value);
        
        return this;
    }
    
    @Override
    public Iterator<Like> iterator() {
        return likes.iterator();
    }
    
}
