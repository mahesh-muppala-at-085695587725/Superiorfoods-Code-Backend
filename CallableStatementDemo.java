import java.sql.*;
 public class CallableStatementDemo{
   public static void main(String... ar)throws SQLException{
     DriverManager.registerDriver(
        new oracle.jdbc.driver.OracleDriver());
     Connection Con = DriverManager.getConnection
   ("jdbc:Oracle:thin:@localhost:1158/em","hr","hr");
     CallableStatement cst = Con.prepareCall("{call myproc}");
         
   
        cst.executeUpdate();
         con.close();
        System.out.println("procedure is executed");
   }
 }
			 