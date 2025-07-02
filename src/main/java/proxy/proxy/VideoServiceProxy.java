package proxy.proxy;

import java.util.HashMap;
import java.util.Map;

import proxy.service.RealVideoService;
import proxy.service.Video;
import proxy.service.VideoService;

public class VideoServiceProxy implements VideoService<Map<String, Video>> {
    private RealVideoService realService;
    private Map<String, Video> cachePopular = new HashMap<>();
    private Map<String, Video> cacheVideos = new HashMap<>();

    public VideoServiceProxy() {
        this.realService = new RealVideoService();
    }

    @Override
    public Map<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = realService.popularVideos();
        } else {
            System.out.println("Lista de vídeos populares recuperada do cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheVideos.get(videoId);
        if (video == null) {
            video = realService.getVideo(videoId);
            cacheVideos.put(videoId, video);
        } else {
            System.out.println("Vídeo '" + videoId + "' recuperado do cache.");
        }
        return video;
    }

    public void resetCache() {
        cachePopular.clear();
        cacheVideos.clear();
    }
} 