package Ejercicio;

public class Rectangulo {
	private Coordenada esquina1, esquina2;

    public Rectangulo(Coordenada esquina1, Coordenada esquina2) {
        this.esquina1 = new Coordenada(Math.min(esquina1.getX(), esquina2.getX()), Math.min(esquina1.getY(), esquina2.getY()));
        this.esquina2 = new Coordenada(Math.max(esquina1.getX(), esquina2.getX()), Math.max(esquina1.getY(), esquina2.getY()));
    }

    public double calcularArea() {
        return Math.abs((esquina2.getX() - esquina1.getX()) * (esquina2.getY() - esquina1.getY()));
    }

    public double calcularDistancia() {
        return Coordenada.distancia(esquina1, esquina2);
    }

    @Override
    public String toString() {
        return "[" + esquina1 + ", " + esquina2 + "]";
    }
}
