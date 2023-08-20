package com.java.videopage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VideoTest {

    @Test
    public void testVideoConstructorAndGetters() {
        String title = "Test Video";
        String url = "https://www.example.com/video";
        String imageUrl = "video.jpg";
        String description = "This is a test video";

        Video video = new Video(title, url, imageUrl, description);

        Assertions.assertEquals(title, video.getTitle());
        Assertions.assertEquals(url, video.getUrl());
        Assertions.assertEquals(imageUrl, video.getImageUrl());
        Assertions.assertEquals(description, video.getDescription());

        Assertions.assertEquals(title, video.getTitle());
        Assertions.assertEquals(url, video.getUrl());
        Assertions.assertEquals(imageUrl, video.getImageUrl());
        Assertions.assertEquals(description, video.getDescription());
    }

    @Test
    public void testVideoSetters() {
        Video video = new Video("Title", "URL", "ImageURL", "Description");

        String newTitle = "New Title";
        String newUrl = "https://www.example.com/new";
        String newImageUrl = "image.jpg";
        String newDescription = "new video description";

        video.setTitle(newTitle);
        video.setUrl(newUrl);
        video.setImageUrl(newImageUrl);
        video.setDescription(newDescription);

        Assertions.assertEquals(newTitle, video.getTitle());
        Assertions.assertEquals(newUrl, video.getUrl());
        Assertions.assertEquals(newImageUrl, video.getImageUrl());
        Assertions.assertEquals(newDescription, video.getDescription());
    }
}

