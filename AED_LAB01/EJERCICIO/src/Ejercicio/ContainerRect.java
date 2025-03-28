package Ejercicio;
import java.util.ArrayList;

public class ContainerRect {
	 private ArrayList<Rectangulo> rectangulos;
	    private ArrayList<Double> distancias;
	    private ArrayList<Double> areas;
	    private int numRec;
	    private int capacidadMaxima;

	    public ContainerRect(int capacidad) {
	        this.capacidadMaxima = capacidad;
	        this.rectangulos = new ArrayList<>();
	        this.distancias = new ArrayList<>();
	        this.areas = new ArrayList<>();
	        this.numRec = 0;
	    }

	    public boolean addRectangulo(Rectangulo rect) {
	        if (numRec < capacidadMaxima) {
	            rectangulos.add(rect);
	            distancias.add(rect.calcularDistancia());
	            areas.add(rect.calcularArea());
	            numRec++;
	            return true;
	        } else {
	            System.out.println("No se puede agregar más rectángulos, capacidad máxima alcanzada.");
	            return false;
	        }
	    }

	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        sb.append("Rectángulo\tCoordenadas\t\tDistancia\tÁrea\n");

	        for (int i = 0; i < numRec; i++) {
	            sb.append((i + 1)).append("\t")
	              .append(rectangulos.get(i)).append("\t")
	              .append(String.format("%.3f", distancias.get(i))).append("\t")
	              .append(String.format("%.2f", areas.get(i))).append("\n");
	        }

	        return sb.toString();
	    }
}
