
import java.sql.*;
public class Myjdbc  {
    public static void main(String[] args) throws java.lang.Exception {
        try{
        String url="jdbc:mysql://localhost:3306/anvitha";
        String uname="root";
        String pass="Mysql@121213";
        String query="select * from Student";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

        st.executeQuery(query);
        ResultSet rs=st.executeQuery(query);

     rs.next();
    // rs.setFetchDirection(ResultSet.TYPE_SCROLL_INSENSITIVE);


    String name=rs.getString("StudentName");
     System.out.println(name);
     rs.previous();
    rs.next();
        String n=rs.getString("StudentName");
        System.out.println(n);
            String k=rs.getString("StudentName");
            String l=rs.getString("StudentID");
            String m=rs.getString("StudentAge");
            String o=rs.getString("StudentDept");




            System.out.println(k);
            System.out.println(l);
            System.out.println(m);
            System.out.println(o);


            st.close();
     con.close();



           // Class.forName(driver);
          //  Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("Connection success");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
