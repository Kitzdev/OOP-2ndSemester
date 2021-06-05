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
}
