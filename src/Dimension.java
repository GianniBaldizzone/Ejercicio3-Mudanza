public class Dimension {
    private double profundidad;
    private double alto;
    private double ancho;

    public Dimension(double profundidad, double alto, double ancho) {
        setProfundidad(profundidad);
        setAlto(alto);
        setAncho(ancho);
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
}
