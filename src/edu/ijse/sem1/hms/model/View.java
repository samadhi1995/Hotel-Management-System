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
public class View {
    private String viewname;
    private double price;

    public View() {
    }
    
    public View(String viewname) {
        this.viewname = viewname;
    }

    public View(String viewname, double price) {
        this.viewname = viewname;
        this.price = price;
    }

    /**
     * @return the viewname
     */
    public String getViewname() {
        return viewname;
    }

    /**
     * @param viewname the viewname to set
     */
    public void setViewname(String viewname) {
        this.viewname = viewname;
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
