package interfaces;

import java.util.List;

/**
 * IBridgeable Interface: Handles Data Transfers to and from this application.
 */
public interface IBridgeable<T> {
    /**
     * Returns the bridge key name.
     */
    String getKeyname();

    /**
     * Returns all bridged data objects.
     */
    List<T> getObjects();

    /**
     * Returns a single bridged data object.
     */
    T getObject(int id);

    /**
     * Creates and then returns a single bridged data object.
     */
    T createObject();       

    /**
     * Updates and then returns a single bridged data object.
     */
    T updateObject(T obj);

    /**
     * Destroys a single bridged data object.
     */
    void destroyObject(T obj);
}

