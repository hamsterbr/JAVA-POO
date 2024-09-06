public class JurosCompostos {

    private double capitalInicial; // Capital inicial
    private double taxaJuros;       // Taxa de juros
    private int numeroPeriodos;     // Número de períodos

    public JurosCompostos(double capitalInicial, double taxaJuros, int numeroPeriodos) {
        this.capitalInicial = capitalInicial;
        this.taxaJuros = taxaJuros;
        this.numeroPeriodos = numeroPeriodos;
    }

    //calcular o montante final com juros compostos
    public double calcularMontante() {
        return capitalInicial * Math.pow((1 + taxaJuros), numeroPeriodos);
    }

    public static void main(String[] args) {
        //Exemplo
        double capital = 30000.0; // Capital inicial
        double taxa = 0.10;      // Taxa de juros (5%)
        int periodos = 20;       // Número de períodos (anos)

        JurosCompostos investimento = new JurosCompostos(capital, taxa, periodos);
        double montanteFinal = investimento.calcularMontante();

        System.out.printf("Montante final após %d anos com um capital de %.2f a uma taxa de %.2f é: %.2f%n",
                periodos, capital, taxa * 100, montanteFinal);
    }
}
