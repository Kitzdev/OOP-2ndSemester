import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DBConnection 
{
    public static Connection connection;
    public static Statement statement;
    public static ResultSet resultSet;
    public static String sql;
    
    public static void AccessDatabase() throws ClassNotFoundException
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://"
                         + "localhost:3306/UASLibrary","root","");
                    
        } catch(SQLException exception)
        {
           String exceptionSentence = exception.getMessage();
           JOptionPane.showMessageDialog(null, "Failed to connect to database");
           System.out.println(exceptionSentence);
        }
    }
    
    public static Connection AccessDatabaseWithReturn() 
    {
        Connection connection = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/UASLibrary";
        String user = "root";
        String password = "";
        if (connection == null) 
        {
            try 
            {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
                
            } catch (ClassNotFoundException | SQLException error) 
            {
               System.exit(0);
            }
        }
        return connection;
    }
}
