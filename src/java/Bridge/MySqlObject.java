package Bridge;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 *
 */
public class MySqlObject extends Bridge {
    
    /**
     * Database connection.
     */
    Connection conn;
    
    /**
     * Database Connection String.
     */
    String ConnectionString;
    
    /**
     * Password Salt: Random character sequence.
     */
    final byte[] salt = "SD@!#@!#re-t4q23tUYD*(V)YPHDSIN#KQWe9-8wefy_087ewgho aw78efgdsgyBH".getBytes();

    /**
     * Generates a password hash using a salt.
     * @param password - Password to salt and hash.
     * @return Password hash.
     */
    public byte[] generateHash( String password ) {

         try {
             SecretKeyFactory skf = SecretKeyFactory.getInstance( "PBKDF2WithHmacSHA512" );
             PBEKeySpec spec = new PBEKeySpec( password.toCharArray(), salt, 512, 4096 );
             SecretKey key = skf.generateSecret( spec );
             byte[] res = key.getEncoded( );
             return res;

         } catch( NoSuchAlgorithmException | InvalidKeySpecException e ) {
             throw new RuntimeException( e );
         }
     }

    private String generatePassword(String hash) {

    }

    private ResultSet executeQuery() {
            Statement stmt = conn.createStatement();
            String query = "select columnname from tablename ;" ;
            ResultSet rs = stmt.executeQuery(query) ;

    }
    
    /**
     * Self populating constructor.
     * @param connectionStr
     * @param tableName 
     */
    public MySqlObject(String connectionStr, String username, String passwordHash, String tableName) throws ClassNotFoundException {
        // Populate the bridge key.
        super("mysql_" + tableName);
        
        try {
            Class.forName("com.mysql.jdbc.Driver") ;
            conn = DriverManager.getConnection( connectionStr, username, generatePassword(passwordHash) ) ;
        } catch (SQLException ex) {
            Logger.getLogger(MySqlObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List getObjects() {
    }

    @Override
    public Object getObject(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object createObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object updateObject(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void destroyObject(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
