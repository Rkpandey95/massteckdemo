/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staff;

import DAL.Datahelper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rk
 */
public class PostJobDAO {
    
    
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hdbstaff","root","");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }
 
     public static int save(PostJobBean pb) {
        int status = 0;
        try {
             Datahelper.openConn();
             int pid =0;
            PreparedStatement ps = Datahelper.insert_update_deleteData("insert into Employees(pid,emailid,mobileno,location,category,description,status) values(?,?,?,?,?,?,?)");
            ps.setInt(1, pid);
            ps.setString(2, pb.getEmailid());
            ps.setString(3, pb.getMobileno());
            ps.setString(4, pb.getLocation());
            ps.setString(5, pb.getCategory());
            ps.setString(6, pb.getDescription());
            ps.setInt(7, 1);
            status = ps.executeUpdate();
            pid++;
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    public static List<PostJobBean> getAllRecords() {
        List<PostJobBean> list = new ArrayList<PostJobBean>();
 
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("select * from s_job");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PostJobBean pb = new PostJobBean();
                pb.setEmailid(rs.getString("emailid"));
                pb.setMobileno(rs.getString("mobileno"));
                pb.setLocation(rs.getString("location"));
                pb.setCategory(rs.getString("category"));
                pb.setDescription(rs.getString("description"));
                list.add(pb);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
     public static List<PostJobBean> getRecords(int start, int total) {
        List<PostJobBean> list = new ArrayList<PostJobBean>();
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement(
                    "select * from s_job limit " + (start - 1) + "," + total);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PostJobBean pb = new PostJobBean();
                pb.setEmailid(rs.getString(2));
                pb.setMobileno(rs.getString(3));
                pb.setLocation(rs.getString(4));
                pb.setCategory(rs.getString(5));
                pb.setDescription(rs.getString(6));
                list.add(pb);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
}
