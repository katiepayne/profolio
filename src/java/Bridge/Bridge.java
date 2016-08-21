package Bridge;

import interfaces.IBridgeable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Bridge(T): Allows data flow from this application to a data store.
 */
public abstract class Bridge<T> implements IBridgeable {
    
    /**
     * Generic SQL SELECT statement.
     * @param tableName
     */
    protected String Select( String tableName ) {
        return String.format( "SELECT * FROM %s", tableName );
    }

    /**
     * Generic SQL WHERE statement.
     * @param tableName
     * @param column - Column to filter on.
     * @param value - Value to filter on.
     */
    protected String Where( String tableName, String column, String value ) {
        return String.format( "SELECT * FROM %s WHERE %s LIKE %s", tableName, column, value );
    }

    /**
     * Generic SQL INSERT statement.
     * @param tableName - Table to inject into.
     * @param injectVals - Properties to inject.
     */
    protected String Insert( String tableName, Map injectVals ) {
        String sql = "INSERT INTO " + tableName + " (";
        Set keys = injectVals.keySet();
        int count = 0;

        // String used to fill each value.
        String vals = "";
        
        // Loop over the values to inject, building their insertion string.
        for( Object col : keys )
        {
            // Increment the count.
            count++;
            
            // Append to the sql statement string... avoid un-needed commas.
            sql += col + (count != keys.size() ? ", " : "");

            // Append to the sql statement string... avoid un-needed commas.
            vals += injectVals.get(col) + (count != keys.size() ? ", " : "");
        }

        // piece the parts together.
        sql += ")\n\tVALUES (" + vals + ");";
        
        // return the built string.
        return sql;
    }

    
    /**
     * Bridge Key name.
     */
    String Keyname;

    /**
     * Protected Constructor, to be used only from the extending class.
     * @param keyName 
     */
    protected Bridge( String keyName ) {
        Keyname = keyName;
    }
    
    /**
     * Returns all objects from the data source.
     * @return 
     */
    @Override
    public abstract List getObjects();
    /**
     * Returns a single object by id, from the data source.
     * @param id - Identifier.
     * @return T.
     */
    @Override
    public abstract T getObject(int id);

    /**
     * Creates a new object in the data source.
     * @return newly created T.
     */
    @Override
    public abstract T createObject();

    /**
     * Updates an object in the data source.
     * @param obj - Object to update.
     * @return Updated object ( for chaining ).
     */
    @Override
    public abstract T updateObject(Object obj);

    /**
     * Destroys the object in the data source.
     * @param obj - Object to destroy.
     */
    @Override
    public abstract void destroyObject(Object obj);

    /**
     * Returns the public key name for this data object bridge.
     */
    @Override
    public String getKeyname() {
        return Keyname;
    }    
}
