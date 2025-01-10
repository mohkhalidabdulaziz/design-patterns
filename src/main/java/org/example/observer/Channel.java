package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String name;
    private List<User> subscribers = new ArrayList<>();

    public Channel(String name) {
        this.name = name;
    }

    // Subscribe a user to the channel
    public void subscribe(User user) {
        subscribers.add(user);
    }

    // Unsubscribe a user from the channel
    public void unsubscribe(User user) {
        subscribers.remove(user);
    }

    // Notify all subscribers when a new video is uploaded
    public void uploadVideo(Video video) {
        System.out.println("Channel " + name + " uploaded a new video: " + video.getTitle());
        notifySubscribers(video);
    }

    // Notify subscribers about the new video
    private void notifySubscribers(Video video) {
        subscribers.stream().forEach( user -> {
            user.update(video);
        });
    }

    public String getName() {
        return name;
    }
}
