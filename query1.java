    import java.sql.*;
    import java.lang.*;

    public class query1{
        public static void main(String args[])
        {Connection con;
            Statement stmt;
            ResultSet rs;
                {
                try
                {
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    con=DriverManager.getConnection("Jdbc:Oracle:thin:@localhost:ORCL","sudip","sudip2311");
                    stmt=con.createStatement();
                    rs=stmt.executeQuery("Select ename, sal from emp");
                    while(rs.next())
                    System.out.println(rs.getString(1)+" "+rs.getInt(2));
                    con.close();
                }
                catch(SQLException e) { System.out.println(e);}
                catch(ClassNotFoundException e) {System.out.println(e);}
            }
        }
    }