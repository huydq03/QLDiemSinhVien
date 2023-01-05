/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.model;



/**
 *
 * @author Admin
 */

public class Grade {
    private int id;
    
    private float tiengAnh;
    
    private float tinHoc;
    
    private float gDTC;
    
    private String maSV;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public Grade() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTiengAnh() {
        return tiengAnh;
    }

    public void setTiengAnh(float tiengAnh) {
        this.tiengAnh = tiengAnh;
    }

    public float getTinHoc() {
        return tinHoc;
    }

    public void setTinHoc(float tinHoc) {
        this.tinHoc = tinHoc;
    }

    public float getgDTC() {
        return gDTC;
    }

    public void setgDTC(float gDTC) {
        this.gDTC = gDTC;
    }

    public double getMarks(){
        return (tiengAnh + tinHoc + gDTC)*1.0/3;
    }
    
}
