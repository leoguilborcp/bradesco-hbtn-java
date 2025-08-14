package provedores;
public enum TipoProvedorFrete {
    SEDEX("SEDEX",1000,0.1,0.05),
    JADLOG("JADLOG",2000,0.07,0.045),
    LOGGI("LOGGI",5000,0.12,0.04);

    private String tipo;
    private int pesoMaximo;
    private double descontoMaximo;
    private double desconto;

    TipoProvedorFrete(String tipo, int pesoMaximo, double descontoMaximo, double desconto) {
        this.tipo = tipo;
        this.pesoMaximo = pesoMaximo;
        this.descontoMaximo = descontoMaximo;
        this.desconto = desconto;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public double getDescontoMaximo() {
        return descontoMaximo;
    }

    public double getDesconto() {
        return desconto;
    }
}