package org.example.observer;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    // Method to be called when a new video is uploaded
    public void update(Video video) {
        System.out.println(STR."User \{name} received a notification: New video uploaded - \{video.getTitle()}");
    }
}
