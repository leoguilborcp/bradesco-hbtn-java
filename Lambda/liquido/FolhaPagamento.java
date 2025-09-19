public class FolhaPagamento {
    private CalculadorDeSalario calculador;

    public FolhaPagamento(CalculadorDeSalario calculador) {
        this.calculador = calculador;
    }

    public static double calcularLiquido (Funcionario funcionario, CalculadorDeSalario calculador) {
        return calculador.calcularSalario(funcionario.getSalario());
    }
}