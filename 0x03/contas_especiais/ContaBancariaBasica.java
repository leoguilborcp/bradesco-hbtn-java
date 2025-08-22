import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    private String numeracao;
    protected double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.saldo = 0;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        this.saldo += valor;
    }


    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0) {
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        }
        if (valor > this.saldo) {
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }
        this.saldo -= valor;
    }

    public double calcularTarifaMensal() {
        double tarifa = this.saldo * 0.1;
        if (tarifa < 10) {
            return tarifa; 
        }
        return 10;
    }

    public double calcularJurosMensal() {
        if (this.saldo < 0) {
        return 0; // No interest if balance is zero or negative
        }
        double jurosMensal = this.taxaJurosAnual / 12;
        return  (jurosMensal / 100)*this.saldo;
    }
    public void aplicarAtualizacaoMensal() {

        double tarifa = calcularTarifaMensal();      
        double juros = calcularJurosMensal();
        
        this.saldo += juros;
        this.saldo -= tarifa;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
}