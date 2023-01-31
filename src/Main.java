import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador(700, 10, 9, "El Caballero", 40, 10);
        Enemigo enemigo1 = new Enemigo(1400, 25, 15, "Hornet", 4);
        Entidad[] arrayEntidades = new Entidad[2];
        arrayEntidades[0] = jugador1;
        arrayEntidades[1] = enemigo1;
        boolean isSalir = false;
        Scanner inputUsuario = new Scanner(System.in);
        int inputMenu = 0;

        while (!isSalir) {
            for (Entidad e : arrayEntidades) {
                int accion = 0;
                int damage = 0;
                accion = (int) (Math.random() * (3 - 1 + 1) + 1); //la acción se elige aleatoriamente
                //en función de la acción hace un tipo de ataque u otro
                if (accion == 1) {
                    damage = e.turno(accion);
                    System.out.println(e.getNombre() + " ha hecho un ataque normal provocando " + damage + " puntos de daño.");
                } else if (accion == 2) {
                    damage = e.turno(accion);
                    System.out.println(e.getNombre() + " ha hecho un ataque cargado provocando " + damage + " puntos de daño.");
                } else if (accion == 3) {
                    damage = e.turno(accion);
                    System.out.println(e.getNombre() + " ha usado una habilidad provocando " + damage + " puntos de daño.");
                }
                //se restan los puntos de vida al contrincante
                if (e.getNombre().equals("El Caballero")) {
                    enemigo1.setVida(enemigo1.getVida() - damage);
                    System.out.println("Hornet tiene " + enemigo1.getVida() + " puntos de vida.");
                    if (enemigo1.getVida() <= 0) {
                        System.out.println("¡Has derrotado a Hornet!");
                        isSalir = true;
                    }
                } else if (e.getNombre().equals("Hornet")) {
                    jugador1.setVida(jugador1.getVida() - damage);
                    System.out.println("El Caballero tiene " + jugador1.getVida() + " puntos de vida.");
                    if (jugador1.getVida() <= 0) {
                        System.out.println("Hornet te ha vencido.");
                        isSalir = true;
                    }
                }
            }
            if (!isSalir) { //condicion necesaria para que no se ejecute el sout cuando uno de los dos ha perdido.
                System.out.println("Para continuar el combate pulsa 1. Para pararlo pulsa 2.");
                inputMenu = inputUsuario.nextInt();
                inputUsuario.nextLine();
                System.out.println();
                if (inputMenu == 2) isSalir = true;
            }
        }
        /*Comentario sobre el comportamiento: Este tipo de construcciones son útiles para evitar repetir código (ahorrando así tiempo y optimizando recursos del ordenador).
        Permite agrupar las clases siguiendo unos criterios determinados, dando como resultado una visión general del proyecto más fácil de entender al estar jerarquizada,
        especialmente útil si es la primera vez que abres el proyecto y estás intentando entender las relaciones entre los distintos objetos.
        Concretamente, en videojuegos debe de ser un recurso muy usado, ya que pueden existir muchos objetos, personajes, armas, etc. que compartan características básicas
        de funcionalidad y se diferencien en detalles concretos, como el aspecto estético, por ejemplo. Así, a la hora de crear un nuevo objeto del tipo que sea, obtenemos de forma
        predeterminada la estructura más básica de este, pudiendo personalizarlo en función de lo que nos interese en el momento o de los usos que se le vayan a dar. Como contras a este método,
        está la necesidad de realizar un diseño previo muy exhaustivo del esquema que tendría la aplicación o programa, con una(s) clase(s) padre(s) que pueda(n) abarcar todas
        las casuísticas de las posibles clases hijas para evitar futuros conflictos. Para ello, es posible que nos interese dejar las peculiaridades a las clases hijas y construir
        clases padre lo más genéricas posible, solo con aquellos atributos que sepamos seguro que van a compartir todas las hijas.*/
    }
}