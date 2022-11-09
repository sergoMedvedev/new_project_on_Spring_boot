package com.SpringBoot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id = 1;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer){
        this.musicPlayer = musicPlayer;

    }

    @Override
    public String toString() {
        return "Computer" + id + " " + musicPlayer.playMusic();
    }
}