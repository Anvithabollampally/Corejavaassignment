package jdbc6;

import java.sql.*;

public class jdbc6 {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/advancedjassignment";
        String uname = "root";
        String pass = "Mysql@121213";
        String query = "select * from course where coursename='Machine Learning'";





        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();

        st.executeQuery(query);
        ResultSet rs = st.executeQuery(query);

        rs.next();

        String k=rs.getString("courseid");
        String a=rs.getString("coursename");
        String b=rs.getString("courseduration");
        String c=rs.getString("courseid");
        String d=rs.getString("courseduration");

        System.out.println(k);
        System.out.println(a);

        System.out.println(b);
        System.out.println(c);


        System.out.println(d);



        st.close();
        con.close();
    }
}