package org.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component("classicalMusic")
public class ClassicalMusic implements Music {
    private List<String> songs = new ArrayList<>();

    public ClassicalMusic() {
        songs.add("Moonlight sonata");
        songs.add("Fugue re-minor");
        songs.add("Turkey march");
    }

    @PostConstruct
    public void doInit() {
        System.out.println("Initilize bean");
    }

    @PreDestroy
    public void doDestroy() {
        System.out.println("Destroy bean");
    }

    @Override
    public String getSong() {
        return songs.get(new Random().nextInt(3));
    }


}
