/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Bridged Data Collection Container.
 * @param <T> - Type of data.
 */
public class BridgeData<T> implements Iterable<T> {
    
    /**
     * Data item collection.
     */
    List<T> Items = new ArrayList();
    
    /**
     * Empty constructor.
     */
    public BridgeData() {
        Items = new ArrayList();
    }
    
    /**
     * Self populating constructor.
     */    
    public BridgeData(List<T> collection) {
        Items = new ArrayList(collection);
    }
    
    /**
     * Returns the current index.
     * @return current index.
     */
    @Override
    public Iterator<T> iterator() {
        return Items.iterator();
    }

    /**
     * Clears the in memory collection.
     * @return self for chaining.
     */
    public BridgeData clear() {
        Items.clear();
        
        // Return self for chaining.
        return this;
    }

    /**
     * Removes item from in memory collection.
     * @param item - item to remove.
     * @return self for chaining.
     */
    public BridgeData remove(T item) {
        Items.remove(item);
        
        // Return self for chaining.
        return this;
    }
    
    /**
     * Adds item to in memory collection.
     * @param item -  item to add.
     * @return self for chaining.
     */
    public BridgeData add( T item ) {
        Items.add(item);        
        
        // Return self for chaining.
        return this;
    }
}
