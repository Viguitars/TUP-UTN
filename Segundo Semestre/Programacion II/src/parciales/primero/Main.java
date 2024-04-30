package parciales.primero;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de cada clase
        Athlete athlete1 = new Athlete(1, "Víctor", 1.78, 39, 71.0);
        Athlete athlete2 = new Athlete(2, "Alejandra", 1.64, 38, 50.0);
        Athlete athlete3 = new Athlete(2, "Gastón", 1.70, 36, 85.0);

        NationalTeam nationalTeam = new NationalTeam("Azul", "Argentina");
        nationalTeam.addAthlete(athlete1);
        nationalTeam.addAthlete(athlete2);
        nationalTeam.addAthlete(athlete3);

        Test test1 = new Test(1001, "Lanzamiento de jabalina");
        Test test2 = new Test(1002, "Salto de altura");

        test1.addAthlete(athlete1);
        test2.addAthlete(athlete1);
        test2.addAthlete(athlete2);
        test2.addAthlete(athlete3);

        Installation installation1 =
                new Installation("Primera", "Pista 3", "Instalación 1",
                        "Interior");
        Installation installation2 =
                new Installation("Segunda", "Pista 5", "Instalación 2",
                        "Exterior");

        installation1.addTest(test1);
        installation2.addTest(test2);
        installation2.addTest(test2);

        Site site = new Site(1, "30-04-2024", "10:00");
        site.addInstallation(installation1);
        site.addInstallation(installation2);

        // Mostrar la información de la una de las instalaciones
        if (installation2.getTests().size() > 1 &&
                installation2.getTests().get(1).getAthletes().size() >= 3) {
            System.out.println(" - Nombre del 3er atleta de la 2da prueba: " +
                    installation2.getTests().get(1).getAthletes().get(2)
                            .getName());
        } else {
            System.out.println(
                    " - No hay suficientes atletas en la 2da prueba.");
        }

        // Mostrar el código de la segunda prueba
        System.out.println(" - Código de la 2da prueba: " + test2.getCode());

        // Mostrar la información del equipo nacional
        System.out.println(" - Altura y peso extra de los atletas:");
        for (Athlete athlete : nationalTeam.getAthletes()) {
            System.out.println(
                    "     - " + athlete.getName() + ": " + athlete.getHeight() +
                            " metros.");
            System.out.println("      ¿" + athlete.getName() + " tiene peso extra? " +
                    athlete.hasExtraWeight(athlete.getWeight()));
        }
    }
}
