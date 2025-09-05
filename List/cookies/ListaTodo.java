import java.util.*;
public class ListaTodo {
    List<Tarefa> tarefas;

    public ListaTodo() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        if (buscarTarefaPorId(tarefa.getIdentificador()) != null) {
            throw new IllegalArgumentException("Tarefa com identificador " + tarefa.getIdentificador() + " ja existente na lista");
        }
        tarefas.add(tarefa);
    }

    public boolean marcarTarefaFeita(int id) {
        Tarefa tarefa = buscarTarefaPorId(id);
        if (tarefa != null) {
            tarefa.setEstahFeita(true);
            return true;
        }
        return false;
    }

    public boolean desfazerTarefa(int id) {
        Tarefa tarefa = buscarTarefaPorId(id);
        if (tarefa != null) {
            tarefa.setEstahFeita(false);
            return true;
        }
        return false;
    }

    public void listarTarefas() {
        for (Tarefa tarefa : tarefas) {
            System.out.println("[" + (tarefa.isEstahFeita() ? "X" : " ") + "]  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
        }
    }

    private Tarefa buscarTarefaPorId(int id) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == id) {
                return tarefa;
            }
        }
        return null;
    }

    public void desfazerTodas() {
        for (Tarefa tarefa : tarefas) {
            desfazerTarefa(tarefa.getIdentificador());
        }
    }

    public void fazerTodas() {
        for (Tarefa tarefa : tarefas) {
            marcarTarefaFeita(tarefa.getIdentificador());
        }
    }

}