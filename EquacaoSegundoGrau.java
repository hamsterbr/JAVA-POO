public class EquacaoSegundoGrau {
    private double a;
    private double b;
    private double c;

    public EquacaoSegundoGrau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void resolver() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Equação inválida.");
            } else {
                double x = -c / b;
                System.out.println("A equação é linear. A solução é: x = " + x);
            }
            return;
        }

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Existem duas raízes iguais: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("As raízes da equação são: x1 = " + x1 + " e x2 = " + x2);
        }
    }

    public static void main(String[] args) {
        EquacaoSegundoGrau equacao = new EquacaoSegundoGrau(1, -5, 3);
        equacao.resolver();
    }
}
