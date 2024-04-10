package clases.clase04_0404.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Conan", 10, 100, 20);
        Wizard wizard = new Wizard("Gandalf", 10, 80, 30);
        Rogue rogue = new Rogue("Legolas", 10, 90, 25);

        // Comienza el enfrentamiento
        System.out.println("The battle begins:");
        System.out.println("--------------------------------");

        // El guerrero ataca al mago
        int damage = warrior.attack();
        wizard.defend(damage);
        System.out.println(warrior.name + " attacks " + wizard.name + " and" +
                " deals " + damage + " points of damage to him.");

        // El mago ataca al pícaro
        damage = wizard.attack();
        rogue.defend(damage);
        System.out.println(wizard.name + " attacks " + rogue.name + " and" +
                " deals " + damage + " points of damage to him.");

        // El pícaro ataca al guerrero
        damage = rogue.attack();
        warrior.defend(damage);
        System.out.println(rogue.name + " attacks " + warrior.name + " and" +
                " deals" + damage + "  points of damage to him.");

        // Termina el enfrentamiento
        System.out.println("The battle ends:");
        System.out.println("--------------------------------");

        // Mostramos los puntos de vida restantes de cada personaje
        System.out.println("Remaining life points:");
        System.out.println(warrior.name + ": " + warrior.healthPoints);
        System.out.println(wizard.name + ": " + wizard.healthPoints);
        System.out.println(rogue.name + ": " + rogue.healthPoints);
    }
}
