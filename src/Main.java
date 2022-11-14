public class Main{
public static void main(String[]args){
    System.out.println("Hola soy una compañia de transportes");

    MedioDeTransporte camionDisponible = new MedioDeTransporte(500.0,
            new Dimension(2.5,1.5,4),
            3
    );

    ObjetoTransportable silla = new ObjetoTransportable(5,
            new Dimension(1,1,1),
            false,
            "Silla gamer");
    ObjetoTransportable televisor = new ObjetoTransportable(10,
            new Dimension(1.5,1.5,1.5),
            true,
            "TV SONY 45 pulgadas");
}
}