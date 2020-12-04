import java.sql.*;
 public class CallableStatementDemo1{
   public static void main(String... ar)throws SQLException{
     DriverManager.registerDriver(
        new oracle.jdbc.driver.OracleDriver());
     Connection Con = DriverManager.getConnection
   ("jdbc:Oracle:thin:@localhost:1158/em","hr","hr");
     CallableStatement cst = Con.prepareCall("{call addition(?,?,?)}");

      cst.registeroOutParameter(3,Types,NUMERIC);
      cst.setInt(2,11);
      cst.setInt(3,22);
      cst.execute();
      int res = cst.getInt(3);
      System.out.println("Result: "+res);
      con.close();
    }
  }