public class Autor implements Comparable<Autor> {
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Autor outro) {
        int nomeComparacao = this.nome.compareTo(outro.nome);
        if (nomeComparacao != 0) {
            return nomeComparacao;
        }
        return this.sobrenome.compareTo(outro.sobrenome);
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }
}

