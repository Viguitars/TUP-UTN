package clases.clase04_0404.Ejercicio2;

public abstract class CharacterBase implements Character {
    //    Atributos
    protected String name;
    protected int level;
    protected int healthPoints;

    //    Constructor
    public CharacterBase() {
    }

    public CharacterBase(String name, int level, int healthPoints) {
        this.name = name;
        this.level = level;
        this.healthPoints = healthPoints;
    }

    //    Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    //    Implementación general de la defensa
    //    Se reduce el daño recibido a la mitad
    @Override
    public void defend(int damage) {
        damage /= 2;
        healthPoints -= damage;
        System.out.println(name + " recives " + damage + " points of damage.");
        if (healthPoints < 0) {
            System.out.println(name + " has been defeated.");
        }

    }
}
