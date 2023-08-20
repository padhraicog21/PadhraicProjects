package com.java.videopage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class VideoRepositoryTest {
    private VideoRepository videoRepository;

    @BeforeEach
    public void setUp() {
        videoRepository = new VideoRepository();
    }

    @Test
    public void testGetAllVideos() {
        List<Video> videos = videoRepository.getAllVideos();
        assertEquals(12, videos.size(), "VideoRepository should have 12 videos");
    }

    @Test
    public void testAddVideo() {
        Video newVideo = new Video("Test Video", "https://www.youtube.com/watch?v=test123", "test.jpg", "Test description");
        videoRepository.addVideo(newVideo);

        List<Video> videos = videoRepository.getAllVideos();
        assertEquals(13, videos.size(), "VideoRepository should have 13 videos after adding one");
        assertTrue(videos.contains(newVideo), "VideoRepository should contain the added video");
    }

    @Test
    public void testGetVideos() {
        List<Video> videos = videoRepository.getVideos();
        assertNotNull(videos, "VideoRepository should not return null for getVideos method");
        assertEquals(12, videos.size(), "VideoRepository should have 12 videos");
    }

    @Test
    public void testSetVideos() {
        Video newVideo = new Video("Test Video", "https://www.youtube.com/watch?v=test123", "test.jpg", "Test description");
        List<Video> newVideosList = List.of(newVideo);
        videoRepository.setVideos(newVideosList);

        List<Video> videos = videoRepository.getAllVideos();
        assertEquals(1, videos.size(), "VideoRepository should have 1 video after setting a new video list");
        assertTrue(videos.contains(newVideo), "VideoRepository should contain the new video after setting the video list");
    }

}

