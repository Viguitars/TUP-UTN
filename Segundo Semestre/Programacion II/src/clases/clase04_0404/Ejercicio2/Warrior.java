package clases.clase04_0404.Ejercicio2;

public class Warrior extends CharacterBase {
    //    Atributo
    private int strength;

    public Warrior(int strength) {
        this.strength = strength;
    }

    //    Constructor
    public Warrior(String name, int level, int healthPoints, int strength) {
        super(name, level, healthPoints);
        this.strength = strength;
    }

    //    Getters y Setters
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    // Implementación de ataque específico del guerrero
    //    El daño es tres veces el nivel del guerrero más la fuerza
    @Override
    public int attack() {
        return 3 * level + strength;
    }
}
