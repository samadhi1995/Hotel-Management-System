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
public class Room {
    private String roomID;
    private String roomType;
    private String view;
    private int floorNumber;
    private double sizeSQFeet;
    private double price;

    public Room() {
    }

    public Room(String roomID, String roomType, String view, int floorNumber, double sizeSQFeet, double price) {
        this.roomID = roomID;
        this.roomType = roomType;
        this.view = view;
        this.floorNumber = floorNumber;
        this.sizeSQFeet = sizeSQFeet;
        this.price = price;
    }

    /**
     * @return the roomID
     */
    public String getRoomID() {
        return roomID;
    }

    /**
     * @param roomID the roomID to set
     */
    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    /**
     * @return the roomType
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * @param roomType the roomType to set
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    /**
     * @return the view
     */
    public String getView() {
        return view;
    }

    /**
     * @param view the view to set
     */
    public void setView(String view) {
        this.view = view;
    }

    /**
     * @return the floorNumber
     */
    public int getFloorNumber() {
        return floorNumber;
    }

    /**
     * @param floorNumber the floorNumber to set
     */
    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    /**
     * @return the sizeSQFeet
     */
    public double getSizeSQFeet() {
        return sizeSQFeet;
    }

    /**
     * @param sizeSQFeet the sizeSQFeet to set
     */
    public void setSizeSQFeet(double sizeSQFeet) {
        this.sizeSQFeet = sizeSQFeet;
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
