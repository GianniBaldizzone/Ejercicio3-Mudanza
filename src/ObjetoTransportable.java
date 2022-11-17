public class ObjetoTransportable {
    private double peso;
    private Dimension dimensiones;
    private Boolean esFragil;
    private String nombre;

    public ObjetoTransportable(double peso, Dimension dimensiones, Boolean esFragil, String nombre) {
        setPeso(peso);
        setDimensiones(dimensiones);
       setEsFragil(esFragil);
        setNombre(nombre);
    };

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Dimension getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimension dimensiones) {
        this.dimensiones = dimensiones;
    }

    public Boolean getEsFragil() {
        return esFragil;
    }

    public void setEsFragil(Boolean esFragil) {
        this.esFragil = esFragil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
