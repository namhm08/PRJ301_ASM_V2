/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

import java.sql.Date;
/**
 *
 * @author hoang
 */
public class Lecturer {
    private int lid;
    private String lname;
    private boolean gender;
    private Date date;
    private String email;
    private String phone;

    public Lecturer() {
    }

    public Lecturer(int id, String lname, boolean gender, Date date, String email, String phone) {
        this.lid = id;
        this.lname = lname;
        this.gender = gender;
        this.date = date;
        this.email = email;
        this.phone = phone;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
