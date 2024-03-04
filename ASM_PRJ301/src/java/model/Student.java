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
public class Student {
    private int sid;
    private String sname;
    private boolean gender;
    private Date date;
    private String email;
    private String phone;

    public Student() {
    }

    public Student(int sid, String sname, boolean gender, Date date, String email, String phone) {
        this.sid = sid;
        this.sname = sname;
        this.gender = gender;
        this.date = date;
        this.email = email;
        this.phone = phone;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
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
