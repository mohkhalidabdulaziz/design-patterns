package org.example.observer;

public class TestRunner {
    public static void main(String[] args) {

        Channel channel1 = new Channel("TechTutorials");

        // Create users
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Khalid");


        // Users subscribe to the channel
        channel1.subscribe(user1);
        channel1.subscribe(user2);
        channel1.subscribe(user3);





        // Create a video manager (Singleton)
        VideoManager videoManager = VideoManager.getInstance();

        // Create videos
        Video video1 = new Video("Intro to Java", "Learn the basics of Java programming.");
        Video video2 = new Video("Advanced Java Concepts", "Deep dive into advanced Java topics.");

        // Add videos to the VideoManager (this step is optional for this example)
        videoManager.addVideo(video1);
        videoManager.addVideo(video2);

        // Channel uploads a new video
        System.out.println("\nUploading video 1...");
        channel1.uploadVideo(video1);  // Notify all subscribers

        System.out.println("\nUploading video 2...");
        channel1.uploadVideo(video2);  // Notify all subscribers
    }

}
