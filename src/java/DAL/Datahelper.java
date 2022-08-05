
package DAL;

import java.sql.*;

public class Datahelper {
    
    static Connection con;
    static Statement st;
    public static void openConn() throws ClassNotFoundException,SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hdbstaff","root","");
        st = con.createStatement();
    }
    
     public static int insert_update_delete(String sqlstr) throws SQLException
    {
        int x=st.executeUpdate(sqlstr);
        return x;
    }
    public static ResultSet getData(String str) throws SQLException
    {
        ResultSet res= st.executeQuery(str);
        return res;
    }
    public static PreparedStatement insert_update_deleteData(String sqlstr) throws SQLException
    {
        PreparedStatement ps = con.prepareStatement(sqlstr);
        return ps;
    }
    public static void closeConn() throws SQLException
    {
        con.close();
    }
}
