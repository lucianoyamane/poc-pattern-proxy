package proxy.service;

public interface VideoService<T> {
    T popularVideos();
    Video getVideo(String videoId);
} 