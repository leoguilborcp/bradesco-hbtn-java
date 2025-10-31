package domain;


public class Cliente {


    private final String id;
    private final String nome;


    public Cliente(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}