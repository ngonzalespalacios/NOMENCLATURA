package Actividades;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingreso de coordenadas para el primer rectángulo
        System.out.println("Prueba 1:");
        System.out.print("Ingrese una esquina del 1er rectángulo: ");
        double x1A = scanner.nextDouble();
        double y1A = scanner.nextDouble();
        System.out.print("Ingrese la esquina opuesta del 1er rectángulo: ");
        double x2A = scanner.nextDouble();
        double y2A = scanner.nextDouble();

        System.out.print("Ingrese una esquina del 2do rectángulo: ");
        double x1B = scanner.nextDouble();
        double y1B = scanner.nextDouble();
        System.out.print("Ingrese la esquina opuesta del 2do rectángulo: ");
        double x2B = scanner.nextDouble();
        double y2B = scanner.nextDouble();

        Rectangulo rectanguloA = new Rectangulo(new Coordenada(x1A, y1A), new Coordenada(x2A, y2A));
        Rectangulo rectanguloB = new Rectangulo(new Coordenada(x1B, y1B), new Coordenada(x2B, y2B));

        System.out.println("\nRectángulo A = ([" + rectanguloA.getEsquina1() + "], [" + rectanguloA.getEsquina2() + "])");
        System.out.println("Rectángulo B = ([" + rectanguloB.getEsquina1() + "], [" + rectanguloB.getEsquina2() + "])");

        if (rectanguloA.seSuperpone(rectanguloB)) {
            System.out.println("Rectángulos A y B se sobreponen.");
            System.out.println("Área de superposición = " + rectanguloA.calcularAreaInterseccion(rectanguloB));
        } else if (rectanguloA.seJunta(rectanguloB)) {
            System.out.println("Rectángulos A y B se juntan.");
        } else {
            System.out.println("Rectángulos A y B son disjuntos.");
        }
    }
}
