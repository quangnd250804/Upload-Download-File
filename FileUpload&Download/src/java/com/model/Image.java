/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author ADM
 */
public class Image {
    private int id;
    private String name;
    private String remark;

    public Image(String name, String remark) {
        this.name = name;
        this.remark = remark;
    }

    public Image(int id, String name, String remark) {
        this.id = id;
        this.name = name;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Image{" + "name=" + name + ", remark=" + remark + '}';
    }
    
    
}
