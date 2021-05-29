import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DBConnection {
    
    public Connection connection;
    public Statement statement;
    public String sql;
    
    public void AccessDatabase() throws ClassNotFoundException
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://"
                         + "localhost:3306/datakaryawan","root","");
            statement = connection.createStatement();
                    
        } catch(SQLException exception)
        {
           String exceptionSentence = exception.getMessage();
           JOptionPane.showMessageDialog(null, "Gagal terkoneksi ke databse");
           System.out.println(exceptionSentence + "\n");
        }
    }
}
