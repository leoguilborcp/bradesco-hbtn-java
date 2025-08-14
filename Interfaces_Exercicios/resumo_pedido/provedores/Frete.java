package provedores;

public class Frete {
    private TipoProvedorFrete tipoProvedorFrete ;
    private double valor;

    public Frete(String tipoProvedorFrete, double valor) {
        this.tipoProvedorFrete = TipoProvedorFrete.valueOf(tipoProvedorFrete.toUpperCase());
        this.valor = valor;
    }

    public TipoProvedorFrete getTipoProvedorFrete() {
        return tipoProvedorFrete;
    }

    public double getValor() {
        return valor;
    }
}