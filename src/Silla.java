public class Silla extends ObjetoTransportable {
  private int cantidadDePatas;

  public Silla(double peso, Dimension dimensiones, Boolean esFragil, String name, int cantidadDePatas) {
    super(peso, dimensiones, esFragil, name);
    this.cantidadDePatas = cantidadDePatas;
  }
}
