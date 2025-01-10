package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public class VideoManager {

    private List<Video> videos = new ArrayList<>();

    private VideoManager() {
    }

    private static class VideoManagerHolder {
        private static VideoManager INSTANCE = new VideoManager();
    }

    public static VideoManager getInstance() {
        return VideoManagerHolder.INSTANCE;
    }

    public void addVideo(Video video) {
        videos.add(video);
    }

    public List<Video> getAllVideos() {
        return videos;
    }

}
