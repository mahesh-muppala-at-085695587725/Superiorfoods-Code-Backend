import java.sql.*;
 public class BatchExecutionDemo{
   public static void main(String... ar)throws SQLException{
     DriverManager.registerDriver(
        new oracle.jdbc.driver.OracleDriver());
     Connection Con = DriverManager.getConnection
   ("jdbc:Oracle:thin:@localhost:1158/em","hr","hr");
      Statement st = con.creatStatement();
      st.addBatch("insert into student values(53,'mnvp',67.8)");
      st.addBatch("insert into student values(54,'pvnm',77.8)");