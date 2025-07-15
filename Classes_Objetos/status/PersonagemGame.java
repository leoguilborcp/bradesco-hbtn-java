public class PersonagemGame{
    private int saudeAtual;
    private String nome;
    private String status;

    public int getSaudeAtual(){
        return saudeAtual;
    };
    public void setSaudeAtual(int saudeAtual){
        this.saudeAtual = saudeAtual;
        if (saudeAtual > 0) {
            this.status = "Vivo";
        } else {
            this.status = "Morto";
        }
    };
    public String getNome(){
        return nome;
    };
    public void setNome(String nome){
        this.nome = nome;
    };
    public String getStatus() {
        return status;
    }

    public void tomarDano(int quantidadeDeDano) {
        if (this.saudeAtual > 0 && this.saudeAtual > quantidadeDeDano) {
            this.setSaudeAtual(this.saudeAtual -= quantidadeDeDano);
        } else {
            this.setSaudeAtual(0);
        }
    }

    public void receberCura(int quantidadeDeCura) {
        if (this.saudeAtual < 100 && this.saudeAtual + quantidadeDeCura < 100) {
            this.setSaudeAtual(this.saudeAtual += quantidadeDeCura);
        } else {
            this.setSaudeAtual(100);
        }
    }
}