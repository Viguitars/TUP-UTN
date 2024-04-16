package clases.clase06_1604.Ejercicio;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //        Crear un equipo
        Team Argentina = new Team(new ArrayList<>());

        //        Crear y agregar jugadores al equipo
        Argentina.addPlayer(new Player("Franco Armani", "Goalkeeper", 1));
        Argentina.addPlayer(new Player("Gerónimo Rulli", "Goalkeeper", 12));
        Argentina.addPlayer(new Player("Emiliano Martínez", "Goalkeeper", 23));
        Argentina.addPlayer(new Player("Juan Foyth", "Defender", 2));
        Argentina.addPlayer(new Player("Nicolás Tagliafico", "Defender", 3));
        Argentina.addPlayer(new Player("Gonzalo Montiel", "Defender", 4));
        Argentina.addPlayer(new Player("Germán Pezzella", "Defender", 6));
        Argentina.addPlayer(new Player("Marcos Acuña", "Defender", 8));
        Argentina.addPlayer(new Player("Cristian Romero", "Defender", 13));
        Argentina.addPlayer(new Player("Nicolás Otamendi", "Defender", 19));
        Argentina.addPlayer(new Player("Lisandro Martínez", "Defender", 25));
        Argentina.addPlayer(new Player("Nahuel Molina", "Defender", 26));
        Argentina.addPlayer(new Player("Leandro Paredes", "Midfielder", 5));
        Argentina.addPlayer(new Player("Rodrigo de Paul", "Midfielder", 7));
        Argentina.addPlayer(new Player("Exequiel Palacios", "Midfielder", 14));
        Argentina.addPlayer(new Player("Alejandro Gómez", "Midfielder", 17));
        Argentina.addPlayer(new Player("Guido Rodríguez", "Midfielder", 18));
        Argentina.addPlayer(new Player("Alexis Mac Allister", "Midfielder", 20));
        Argentina.addPlayer(new Player("Enzo Fernández", "Midfielder", 24));
        Argentina.addPlayer(new Player("Julián Álvarez", "Forward", 9));
        Argentina.addPlayer(new Player("Lionel Messi", "Forward", 10));
        Argentina.addPlayer(new Player("Ángel Di María", "Forward", 11));
        Argentina.addPlayer(new Player("Ángel Correa", "Forward", 15));
        Argentina.addPlayer(new Player("Thiago Almada", "Forward", 16));
        Argentina.addPlayer(new Player("Paulo Dybala", "Forward", 21));
        Argentina.addPlayer(new Player("Lautaro Martínez", "Forward", 22));

        //        Iterar sobre los jugadores del equipo usando el bucle
        //        for-each y mostrar la información de aquellos cuyo número de
        //        camiseta sea par.
        System.out.println("Players in the teamArgentina:");
        for (Player player : Argentina) {
            if (player.getJerseyNumber() % 2 == 0) {
                System.out.println("Name: " + player.getName() + ", Position: "
                        + player.getPosition() + ", Jersey Number: " + player.getJerseyNumber());
            }
        }


    }
}
