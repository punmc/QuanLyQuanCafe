
package dataprovider;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;



/**
 *
 * @author PC
 */
public class DataProvider {
    private Connection connection;
    
    public void open(){
        String strServer = "COSMOS\\SQLEXPRESS";
        String strDataBase = "QL_QCAFE";
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL = "jdbc:sqlserver://"+strServer
                    +":1433;databaseName="+strDataBase
                    +";user = sa; password = 123";
            connection = DriverManager.getConnection(connectionURL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void close(){
        try {
            this.connection.close();
        } catch (Exception e) {
        }
    }
    
    public ResultSet executeQuery(String sql){
        ResultSet resultset = null;
        try {
            Statement statement = connection.createStatement();
            resultset = statement.executeQuery(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultset;
    }
    
    public int executeUpdate(String sql){
        int n = -1;
        try {
            Statement statement = connection.createStatement();
            n = statement.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return n;
    }
    
}
