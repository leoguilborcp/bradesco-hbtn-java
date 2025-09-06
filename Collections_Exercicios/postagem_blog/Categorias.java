public enum Categorias {
    DEVOPS("DevOps"), DESENVOLVIMENTO("Desenvolvimento"), DATA_SCIENCE("Data_Science");

    private String descricao;

    Categorias(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}