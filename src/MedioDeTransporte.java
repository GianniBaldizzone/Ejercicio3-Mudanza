import java.util.ArrayList;
public class MedioDeTransporte {


    private ArrayList<ObjetoTransportable> trasportables;
private double capacidadMaxima;
private double capacidadActual;
private Dimension dimensiones;
private int CapacidadMaximaDeObjetos;

    public MedioDeTransporte( double capacidadMaxima, Dimension dimensiones, int capacidadMaximaDeObjetos) {
       setTrasportables(new ArrayList<ObjetoTransportable>(0));
       setCapacidadActual(0);
       setCapacidadMaxima(capacidadMaxima);
       setDimensiones(dimensiones);
       setCapacidadMaximaDeObjetos(capacidadMaximaDeObjetos);
    }

    public ArrayList<ObjetoTransportable> getTrasportables() {
        return trasportables;
    }

    public void setTrasportables(ArrayList<ObjetoTransportable> trasportables) {
        this.trasportables = trasportables;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public Dimension getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }

    public int getCapacidadMaximaDeObjetos() {
        return CapacidadMaximaDeObjetos;
    }

    public void setCapacidadMaximaDeObjetos(int capacidadMaximaDeObjetos) {
        CapacidadMaximaDeObjetos = capacidadMaximaDeObjetos;
    }
}
