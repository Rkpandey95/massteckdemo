/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import staff.*;
import DAL.Datahelper;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rk
 */
public class AddStaffJobDAO {
    
    
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
 
     public static int save(AddStaff as) {
        int status = 0;
        try {
             Datahelper.openConn();
            PreparedStatement ps = Datahelper.insert_update_deleteData("insert into s_register(staff_name,staff_id,password,cat_item,date_post,date_closing) values(?,?,?,?,?,?)");
            ps.setString(1, as.getStaffname());
            ps.setString(2, as.getStaffid());
            ps.setString(3, as.getStaffpass());
            ps.setString(4, as.getCitem());
            ps.setString(5, as.getDateofpost());
            ps.setString(6, as.getDateofclosing());
            status = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
    public static List<AddStaff> getAllRecords() {
        List<AddStaff> list = new ArrayList<AddStaff>();
 
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("select * from s_register");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                AddStaff as = new AddStaff();
                as.setStaffname(rs.getString("staff_name"));
                as.setStaffid(rs.getString("staff_id"));
                as.setStaffpass(rs.getString("password"));
                as.setCitem(rs.getString("cat_item"));
                as.setDateofpost(rs.getString("date_post"));
                as.setDateofclosing(rs.getString("date_closing"));
                
                list.add(as);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
    
     public static List<AddStaff> getRecords(int start, int total) {
        List<AddStaff> list = new ArrayList<>();
        try {
            try (Connection con = getConnection()) {
                PreparedStatement ps = con.prepareStatement(
                        "select * from s_register limit " + (start - 1) + "," + total);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    AddStaff as = new AddStaff();
                    as.setStaffname(rs.getString(1));
                    as.setStaffid(rs.getString(2));
                    as.setStaffpass(rs.getString(3));
                    as.setCitem(rs.getString(4));
                    as.setDateofpost(rs.getString(5));
                    as.setDateofclosing(rs.getString(6));
                    
                    list.add(as);
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
}
