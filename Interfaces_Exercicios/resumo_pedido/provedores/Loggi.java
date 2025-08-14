package provedores;
public class Loggi implements ProvedorFrete {
    public Frete calcularFrete(int peso, double valor) {
        double valorFrete;
        if (peso > TipoProvedorFrete.LOGGI.getPesoMaximo()) {
            valorFrete = valor * TipoProvedorFrete.LOGGI.getDescontoMaximo();
        }else{
            valorFrete = valor * TipoProvedorFrete.LOGGI.getDesconto();
        }
        return new Frete("Loggi", valorFrete);
    }
}