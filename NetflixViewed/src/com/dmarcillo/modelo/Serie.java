/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dmarcillo.modelo;

/**
 *
 * @author LAB5-PC8-USUARIO
 */
public class Serie {
    private int id;
    private int duration;
    private int sessionQuantity;
    private String title;
    private String genre;
    private String creator;
    private short year;
    private boolean viewed;
    private Chapter chapter;

    public Serie() {
    }

    public Serie(int id, int duration, int sessionQuantity, String title, String genre, String creator, short year, boolean viewed, Chapter chapter) {
        this.id = id;
        this.duration = duration;
        this.sessionQuantity = sessionQuantity;
        this.title = title;
        this.genre = genre;
        this.creator = creator;
        this.year = year;
        this.viewed = viewed;
        this.chapter = chapter;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * @return the sessionQuantity
     */
    public int getSessionQuantity() {
        return sessionQuantity;
    }

    /**
     * @param sessionQuantity the sessionQuantity to set
     */
    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator the creator to set
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return the year
     */
    public short getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(short year) {
        this.year = year;
    }

    /**
     * @return the viewed
     */
    public boolean isViewed() {
        return viewed;
    }

    /**
     * @param viewed the viewed to set
     */
    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    /**
     * @return the chapter
     */
    public Chapter getChapter() {
        return chapter;
    }

    /**
     * @param chapter the chapter to set
     */
    public void setChapter(Chapter chapter) {
        this.chapter = chapter;
    }
    
}
