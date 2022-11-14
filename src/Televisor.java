public class Televisor extends ObjetoTransportable {
    private String estaEmpaquetada;

    public Televisor(double peso, Dimension dimensiones, Boolean esFragil, String name, String estaEmpaquetada) {
        super(peso, dimensiones, esFragil, name);
        this.estaEmpaquetada = estaEmpaquetada;
    }
}
