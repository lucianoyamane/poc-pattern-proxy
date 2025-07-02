package proxy.app;

import java.util.Map;

import proxy.proxy.VideoServiceProxy;
import proxy.service.RealVideoService;
import proxy.service.Video;
import proxy.service.VideoService;

public class App {
    public static void main(String[] args) {
        System.out.println("--- Acesso direto ao serviço real ---");
        VideoService<Map<String, Video>> realService = new RealVideoService();
        executar(realService);

        System.out.println("\n--- Acesso via Proxy (com cache) ---");
        VideoService<Map<String, Video>> proxy = new VideoServiceProxy();
        executar(proxy);
    }

    private static void executar(VideoService<Map<String, Video>> service) {
        long inicio = System.currentTimeMillis();

        // Primeira chamada: busca popular e vídeo específico
        Map<String, Video> populares = service.popularVideos();
        for (Video v : populares.values()) {
            System.out.println("ID: " + v.id + " | Título: " + v.title);
        }
        Video video1 = service.getVideo("1");
        System.out.println("Assistindo vídeo: " + video1.title);

        // Segunda chamada: deve ser mais rápida no proxy
        populares = service.popularVideos();
        Video video2 = service.getVideo("1");
        System.out.println("Assistindo novamente: " + video2.title);

        long fim = System.currentTimeMillis();
        System.out.println("Tempo decorrido: " + (fim - inicio) + "ms");
    }
} 