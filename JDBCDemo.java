import java.sql.*;

//Complie : javac JDBCDemo.java
//Run : java -cp .:mysql-connector-j-8.2.0.jar JDBCDemo
//mysql-connector-j-8.2.0.jar file should be present in your current working directory

public class JDBCDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javatest", "root", "password");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from Students");
            while (rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            
            //INSERT QUERY
            //String sql = "insert into Students(id,name,email) values(1,'a','mail1')";
            //stmt.executeUpdate(sql);

            //UPDATE QUERY
            //String sqlUpdate = "UPDATE Students SET name = 'a' WHERE id=1";
            //stmt.executeUpdate(sqlUpdate);

            //DELETE QUERY
            //String sqlDelete = "DELETE FROM Students where id=1";
            //stmt.executeUpdate(sqlDelete);
            
            
            conn.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println("Exception caught"+e);
        }
    }
}
