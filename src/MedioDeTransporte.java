import java.util.ArrayList;
public class MedioDeTransporte {

    private ArrayList<ObjetoTransportable> trasportables;
private double capacidadMaxima;
private double capacidadActual;
private Dimension dimensiones;
private int CapacidadMaximaDeObjetos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String nombre;

    public MedioDeTransporte( String nombre ,double capacidadMaxima, Dimension dimensiones, int capacidadMaximaDeObjetos) {
       setNombre(nombre);
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

    public void cargar(ObjetoTransportable objetoTransportable) {

        if (this.getCapacidadActual() + objetoTransportable.getPeso()< getCapacidadMaximaDeObjetos()) {
            this.capacidadActual = capacidadActual + objetoTransportable.getPeso();
            getTrasportables().add(objetoTransportable);
            System.out.println("su objeto transportable " + objetoTransportable.getNombre() + " se cargo con exito");

        }else{
            System.out.println("Ha superado la capacidad maxima del "+ this.getNombre()+" no se ha podido sumar ese objeto");
        }
        }

        public void descargar(ObjetoTransportable objetoTransportable){
            if (this.getCapacidadActual() + objetoTransportable.getPeso() <= getCapacidadMaximaDeObjetos() && this.getCapacidadActual() + objetoTransportable.getPeso() !=0) {
                this.capacidadActual = capacidadActual - objetoTransportable.getPeso();
                getTrasportables().remove(objetoTransportable);
                System.out.println("su objeto" + objetoTransportable.getNombre() + "transportable ha sido descargado con exito");
            }else{
                System.out.println("No se ha podido descargar con exito");
            }
        }

    }

