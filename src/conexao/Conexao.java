package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao {
    public static String url="jdbc:mysql://localhost:3306/db_user_login";
    public static String usuario="root";
    public static String senha="root";
    public static Connection conectar(){
        try{
            Connection conn=DriverManager.getConnection(url,usuario,senha);
            System.out.println("connect: COMPLET");
            return conn;
        }catch(SQLException error){
            System.out.println("connect: ERROR");
            error.printStackTrace();
            return null;
        }
    }
}
