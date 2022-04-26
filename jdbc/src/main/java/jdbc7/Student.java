package jdbc7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student {

        public static void main(String[] args) throws Exception {
            String url = "jdbc:mysql://localhost:3306/assignmentfive";
            String uname = "root";
            String pass = "Mysql@121213";
            String query = "select rollno  from studnet where course='reactjs'";


            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, uname, pass);
            Statement st = con.createStatement();

            st.executeQuery(query);
            ResultSet rs = st.executeQuery(query);

            rs.next();
            //String n = rs.getString("title");

            String k=rs.getString("rollno");




            System.out.println(k);

            st.close();
            con.close();
        }
    }

