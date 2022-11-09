package com.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private  String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public int getVolume() {
        return volume;
    }

    public String getName() {
        return name;
    }

    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


    public String playMusic() {
        return "Plaing:" + music1.getSong()+ " and " + music2.getSong();
    }
}