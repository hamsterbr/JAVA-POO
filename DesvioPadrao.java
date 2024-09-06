import java.util.List;

public class DesvioPadrao {

    //calcular a média
    private static double calcularMedia(List<Double> numeros) {
        double soma = 0.0;
        for (double num : numeros) {
            soma += num;
        }
        return soma / numeros.size();
    }

    //calcular o desvio padrão
    public static double calcularDesvioPadrao(List<Double> numeros) {
        double media = calcularMedia(numeros);
        double somaDosQuadrados = 0.0;

        for (double num : numeros) {
            somaDosQuadrados += Math.pow(num - media, 2);
        }

        //desvio padrão da população
        return Math.sqrt(somaDosQuadrados / numeros.size());
    }

    public static void main(String[] args) {
        //Exemplo
        List<Double> numeros = List.of(10.0, 12.0, 23.0, 23.0, 16.0, 23.0, 21.0);
        double desvioPadrao = calcularDesvioPadrao(numeros);

        System.out.printf("O desvio padrão é: %.2f%n", desvioPadrao);
    }
}
