package Assignment6;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Fourth {
    public static void main(String[] args) {
        String sampleSqlQuery="select * from student";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:sqlserver://maanlad; trustServerCertificate=true;databaseName = students","sa","test123");
            if(conn!=null){
                System.out.println("Database is connected");
                Statement st=conn.createStatement();
                ResultSet rs=st.executeQuery(sampleSqlQuery);
                while(rs.next()){
                    System.out.print(rs.getInt(1)+"\t");
                    System.out.print(rs.getString(2)+"\t");
                }
            }

        }
        catch(Exception e){
            System.out.println(e.toString());
            System.out.println("Not connected");
        }
    }
}
