/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.sem1.hms.model;

/**
 *
 * @author Achini & Samadhi
 */
public class Customer {
    private String CID;
    private String FName;
    private String LName;
    private int age;
    private String address;
    private int contactNum;
    private String email;
    private String citizenship;
    private String passportNum;

    public Customer() {
    }

    public Customer(String CID, String FName, String LName, int age, String address, int contactNum, String email, String citizenship, String passportNum) {
        this.CID = CID;
        this.FName = FName;
        this.LName = LName;
        this.age = age;
        this.address = address;
        this.contactNum = contactNum;
        this.email = email;
        this.citizenship = citizenship;
        this.passportNum = passportNum;
    }

    
    /**
     * @return the CID
     */
    public String getCID() {
        return CID;
    }

    /**
     * @param CID the CID to set
     */
    public void setCID(String CID) {
        this.CID = CID;
    }

    /**
     * @return the FName
     */
    public String getFName() {
        return FName;
    }

    /**
     * @param FName the FName to set
     */
    public void setFName(String FName) {
        this.FName = FName;
    }

    /**
     * @return the LName
     */
    public String getLName() {
        return LName;
    }

    /**
     * @param LName the LName to set
     */
    public void setLName(String LName) {
        this.LName = LName;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the contactNum
     */
    public int getContactNum() {
        return contactNum;
    }

    /**
     * @param contactNum the contactNum to set
     */
    public void setContactNum(int contactNum) {
        this.contactNum = contactNum;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the citizenship
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * @param citizenship the citizenship to set
     */
    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    /**
     * @return the passportNum
     */
    public String getPassportNum() {
        return passportNum;
    }

    /**
     * @param passportNum the passportNum to set
     */
    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum;
    }
    
    
}
