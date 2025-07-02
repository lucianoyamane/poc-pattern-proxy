package proxy.service;

import java.util.HashMap;
import java.util.Map;

public class RealVideoService implements VideoService<Map<String, Video>> {
    @Override
    public Map<String, Video> popularVideos() {
        connectToServer("http://videos.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://videos.com/" + videoId);
        return getSomeVideo(videoId);
    }

    private void connectToServer(String server) {
        System.out.print("Conectando a " + server + "... ");
        experienceNetworkLatency();
        System.out.println("Conectado!");
    }

    private void experienceNetworkLatency() {
        try {
            Thread.sleep(700); // Simula latência
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private Map<String, Video> getRandomVideos() {
        System.out.println("Baixando vídeos populares...");
        experienceNetworkLatency();
        Map<String, Video> videos = new HashMap<>();
        videos.put("1", new Video("1", "Gatos engraçados"));
        videos.put("2", new Video("2", "Cachorros brincando"));
        videos.put("3", new Video("3", "Aula de Java Proxy"));
        return videos;
    }

    private Video getSomeVideo(String videoId) {
        System.out.println("Baixando vídeo...");
        experienceNetworkLatency();
        return new Video(videoId, "Título do vídeo " + videoId);
    }
} 