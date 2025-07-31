import java.util.List; // Imports the List interface
import java.util.ArrayList;

public class ProcessadorVideo {
    private List<CanalNotificacao> canais = new ArrayList<>();
    public void registrarCanal(CanalNotificacao canal) {
        canais.add(canal);
    }
    public void processar(Video video) {
        StringBuilder sb = new StringBuilder();
        sb.append(video.getArquivo())
        .append(" - ")
        .append(video.getFormato());
        canais.forEach(canal -> canal.notificar(new Mensagem(sb.toString(), TipoMensagem.LOG)));
    }
}