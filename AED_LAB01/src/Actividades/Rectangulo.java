package Actividades;

public class Rectangulo {
	private Coordenada esquina1;
    private Coordenada esquina2;
    private double x1, y1, x2, y2;

    public Rectangulo(Coordenada esquina1, Coordenada esquina2) {
        this.esquina1 = esquina1;
        this.esquina2 = esquina2;
        this.x1 = Math.min(esquina1.getX(), esquina2.getX());
        this.y1 = Math.min(esquina1.getY(), esquina2.getY());
        this.x2 = Math.max(esquina1.getX(), esquina2.getX());
        this.y2 = Math.max(esquina1.getY(), esquina2.getY());
    }

    public Coordenada getEsquina1() {
        return esquina1;
    }

    public Coordenada getEsquina2() {
        return esquina2;
    }

    public double calcularArea() {
        return Math.abs((x2 - x1) * (y2 - y1));
    }

    public double calcularPerimetro() {
        return 2 * ((x2 - x1) + (y2 - y1));
    }

    public boolean seSuperpone(Rectangulo otro) {
        return !(this.x2 <= otro.x1 || this.x1 >= otro.x2 || this.y2 <= otro.y1 || this.y1 >= otro.y2);
    }

    public boolean seJunta(Rectangulo otro) {
        return (this.x2 == otro.x1 || this.x1 == otro.x2) && 
               (this.y1 <= otro.y2 && this.y2 >= otro.y1) ||
               (this.y2 == otro.y1 || this.y1 == otro.y2) && 
               (this.x1 <= otro.x2 && this.x2 >= otro.x1);
    }

    public double calcularAreaInterseccion(Rectangulo otro) {
        if (!seSuperpone(otro)) {
            return 0.0;
        }
        double xIzq = Math.max(this.x1, otro.x1);
        double xDer = Math.min(this.x2, otro.x2);
        double yInf = Math.max(this.y1, otro.y1);
        double ySup = Math.min(this.y2, otro.y2);

        return Math.abs((xDer - xIzq) * (ySup - yInf));
    }

    @Override
    public String toString() {
        return "Rectángulo [ (" + x1 + ", " + y1 + ") , (" + x2 + ", " + y2 + ") ]";
    }
}
