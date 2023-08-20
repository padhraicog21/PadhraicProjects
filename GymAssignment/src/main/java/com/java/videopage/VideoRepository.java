package com.java.videopage;

import java.util.ArrayList;
import java.util.List;

public class VideoRepository {
    private List<Video> videos;

    public VideoRepository() {
        videos = new ArrayList<>();

        videos.add(new Video("Push Ups ", "https://www.youtube.com/watch?v=38iDpl4Hf20&ab_channel=fab70smusic", "1.jpg", ""));
        videos.add(new Video("Squats ", "https://www.youtube.com/watch?v=38iDpl4Hf20&ab_channel=fab70smusic", "16.jpg", ""));

        videos.add(new Video("Pull Ups ", "https://www.youtube.com/watch?v=38iDpl4Hf20&ab_channel=fab70smusic", "11.jpg", ""));
        videos.add(new Video("Deadlifts ", "https://www.youtube.com/watch?v=38iDpl4Hf20&ab_channel=fab70smusic", "12.jpg",""));
        
        videos.add(new Video("Bench Press ", "https://www.youtube.com/watch?v=38iDpl4Hf20&ab_channel=fab70smusic", "2.jpeg",""));
        videos.add(new Video("Shoulder Press ", "https://www.youtube.com/watch?v=38iDpl4Hf20&ab_channel=fab70smusic", "3.jpeg",""));

        videos.add(new Video("Chest Press ", "https://www.youtube.com/watch?v=38iDpl4Hf20&ab_channel=fab70smusic", "14.jpg",""));
        videos.add(new Video("Burpees ", "https://www.youtube.com/watch?v=38iDpl4Hf20&ab_channel=fab70smusic", "5.jpg",""));
         
        videos.add(new Video("Bicep Curl ", "https://www.youtube.com/watch?v=38iDpl4Hf20&ab_channel=fab70smusic", "6.jpg",""));
        videos.add(new Video("Leg Press ", "https://www.youtube.com/watch?v=38iDpl4Hf20&ab_channel=fab70smusic", "7.jpg",""));
        
        videos.add(new Video("Front Squat ", "https://www.youtube.com/watch?v=38iDpl4Hf20&ab_channel=fab70smusic", "15.jpg",""));
        videos.add(new Video("Dumbbell Press ", "https://www.youtube.com/watch?v=38iDpl4Hf20&ab_channel=fab70smusic", "9.jpg",""));
        
    }
    public List<Video> getAllVideos() {
        return videos;
    }

    public void addVideo(Video video) {
        videos.add(video);
    }

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

}


