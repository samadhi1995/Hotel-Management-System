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
public class RoomType {
    private String roomtype;
    private int numberofbeds;
    private String facilities;
    private double price;

    public RoomType() {
    }

    public RoomType(String roomtype) {
        this.roomtype = roomtype;
    }
    
    public RoomType(String roomtype, int numberofbeds, String facilities, double price) {
        this.roomtype = roomtype;
        this.numberofbeds = numberofbeds;
        this.facilities = facilities;
        this.price = price;
    }

    /**
     * @return the roomtype
     */
    public String getRoomtype() {
        return roomtype;
    }

    /**
     * @param roomtype the roomtype to set
     */
    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    /**
     * @return the numberofbeds
     */
    public int getNumberofbeds() {
        return numberofbeds;
    }

    /**
     * @param numberofbeds the numberofbeds to set
     */
    public void setNumberofbeds(int numberofbeds) {
        this.numberofbeds = numberofbeds;
    }

    /**
     * @return the facilities
     */
    public String getFacilities() {
        return facilities;
    }

    /**
     * @param facilities the facilities to set
     */
    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
 }
