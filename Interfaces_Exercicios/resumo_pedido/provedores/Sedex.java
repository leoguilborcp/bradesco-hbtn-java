package provedores;
public class Sedex implements ProvedorFrete {
    public Frete calcularFrete(double peso, double valor) {
        double valorFrete;
        if (peso > TipoProvedorFrete.SEDEX.getPesoMaximo()) {
            valorFrete = valor * TipoProvedorFrete.SEDEX.getDescontoMaximo();
        }else{
            valorFrete = valor * TipoProvedorFrete.SEDEX.getDesconto();
        }
        
        return new Frete("Sedex", valorFrete);
    }
    
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}