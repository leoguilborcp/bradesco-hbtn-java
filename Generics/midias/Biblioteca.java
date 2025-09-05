import java.util.ArrayList;
import java.util.List;
public class Biblioteca<T extends Midia> {

    private List<T> ts;

    public Biblioteca() {
        ts = new ArrayList<>();
    }

    public void adicionarMidia(T midia) {
        ts.add(midia);
    }

    public String obterListaMidias() {
        StringBuilder lista = new StringBuilder("[");
        for (T t : ts) {
            lista.append(t.toString());
            if (t != ts.get(ts.size() - 1)) {
                lista.append(", ");
            }
        }
        lista.append("]");
        return lista.toString();
    }
}
