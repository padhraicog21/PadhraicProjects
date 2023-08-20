package com.java.videopage;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class VideoBean {
    private VideoRepository videoRepository = new VideoRepository();

    public List<Video> getAllVideos() {
        return videoRepository.getAllVideos();
    }
}
