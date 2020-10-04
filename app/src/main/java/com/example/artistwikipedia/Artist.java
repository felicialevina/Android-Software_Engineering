package com.example.artistwikipedia;

public class Artist {
    private String name, description, song;
    private int img;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public int getImg(){
        return img;
    }
    public void setImg(int img){
        this.img = img;
    }
    public String getSong(){
        return song;
    }
    public void setSong(String song){
        this.song = song;
    }
}
