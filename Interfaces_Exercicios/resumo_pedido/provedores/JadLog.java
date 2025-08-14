package provedores;
public class JadLog implements ProvedorFrete {
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete;
        if (peso > TipoProvedorFrete.JADLOG.getPesoMaximo()) {
            valorFrete = valor * TipoProvedorFrete.JADLOG.getDescontoMaximo();
        }else{
            valorFrete = valor * TipoProvedorFrete.JADLOG.getDesconto();
        }
        return new Frete("JadLog", valorFrete);
    }
    
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}