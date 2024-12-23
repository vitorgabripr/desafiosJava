import java.util.Scanner;

public class FuncaoQuadratica {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        System.out.println("Escreva o Coeficiente Quadrático (a):");
        double coeQuadra = scaner.nextDouble();

        System.out.println("Escreva o Coeficiente Linear (b):");
        double coeLinear = scaner.nextDouble();

        System.out.println("Escreva o Termo Constante (c):");
        double termCons = scaner.nextDouble();

        double discriminante = Math.pow(coeLinear, 2) - 4 * coeQuadra * termCons;

        if (discriminante >= 0) {
            double raizDiscriminante = Math.sqrt(discriminante);

            double x1 = (-coeLinear + raizDiscriminante) / (2 * coeQuadra);
            double x2 = (-coeLinear - raizDiscriminante) / (2 * coeQuadra);

            System.out.println("As raízes da equação são:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else {
            System.out.println("A equação não possui raízes reais.");
        }

        scaner.close();
    }
}
//programa terminado