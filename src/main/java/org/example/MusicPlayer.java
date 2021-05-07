package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("musicPlayer")
public class MusicPlayer {
    private Music music1;
    private Music music2;
    private String name;
    private int volume;

//    public MusicPlayer() {
//    }
    @Autowired
    public MusicPlayer(@Qualifier("classicMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String playMusic() {
         return " is playing " + music1.getSong() + " and " + music2.getSong();
    }
}
