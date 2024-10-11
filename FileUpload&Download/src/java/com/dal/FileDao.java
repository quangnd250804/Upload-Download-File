/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dal;

import com.model.Image;
import com.utils.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author ADM
 */
public class FileDao {
    private final DBConnection dbConnection;

    public FileDao() {
        this.dbConnection = DBConnection.getInstance();
    }
    
    public void insertImage(Image img){
        String sql = "INSERT INTO img_details(img_name, remark) values(?,?)";
        try {
            Connection con = dbConnection.openConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, img.getName());
            ps.setString(2, img.getRemark());
            ps.execute();
            ps.close();
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(FileDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Image> getAll(){
        ArrayList<Image> imgList = new ArrayList<>();
        
        String sql = "SELECT * FROM img_details";
        
        try {
            Connection con = dbConnection.openConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String remark = rs.getString(3);
                Image i = new Image(id, name, remark);
                imgList.add(i);
            }
        } catch (Exception ex) {
            Logger.getLogger(FileDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return imgList;
    }
    
    public static void main(String[] args) {
        FileDao f = new FileDao();
        
        for(Image i : f.getAll()){
            System.out.println(i);
        }
    }
}
