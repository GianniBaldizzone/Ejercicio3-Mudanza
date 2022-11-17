public class Main{
public static void main(String[]args) {
    System.out.println("Hola soy una compañia de transportes");

    MedioDeTransporte camionDisponible = new MedioDeTransporte("Camion cool",500.0,
            new Dimension(2.5, 1.5, 4),
            3
    );

    ObjetoTransportable silla = new ObjetoTransportable(0.5,
            new Dimension(1, 1, 1),
            false,
            "Silla gamer");
    ObjetoTransportable televisorViejo = new ObjetoTransportable(1,
            new Dimension(1.5, 1.5, 1.5),
            true,
            "TV SONY 45 pulgadas");
    ObjetoTransportable escritorio = new ObjetoTransportable(1,
            new Dimension(1.5, 2, 1),
            false,
            "Escritorio");
    ObjetoTransportable parlante = new ObjetoTransportable(3,
            new Dimension(1.5, 2, 1),
            true,
            "Parlante");

    camionDisponible.cargar(silla);
    camionDisponible.cargar(televisorViejo);
    camionDisponible.cargar(escritorio);
    camionDisponible.cargar(parlante);
    System.out.println("Capacidad actual del camion: "+camionDisponible.getCapacidadActual());
    // Algunos observadores que podrian interactuar con los objeto silla y televisor podrian ser la gente que se encarga de cargar y descargarel camion.
}

}