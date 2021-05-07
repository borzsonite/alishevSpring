package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("rockMusic")
public class RockMusic implements Music {
    List<String> songs = new ArrayList<>();

    public RockMusic() {
        songs.add("Queen of New Orleans");
        songs.add("Thunder");
        songs.add("Under the bridge");
    }

    @Override
    public String getSong() {
        return songs.get(new Random().nextInt(3));
    }
}
