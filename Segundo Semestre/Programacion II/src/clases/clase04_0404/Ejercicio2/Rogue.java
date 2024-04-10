package clases.clase04_0404.Ejercicio2;

public class Rogue extends CharacterBase {

    //    Atributo
    private int agility;

    //    Constructor
    public Rogue(int agility) {
        this.agility = agility;
    }

    public Rogue(String name, int level, int healthPoints, int agility) {
        super(name, level, healthPoints);
        this.agility = agility;
    }

    //    Getters y Setters
    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    //    Implementación especificó del pícaro
    //    El daño es dos veces el nivel más la agilidad
    @Override
    public int attack() {
        return 2 * level + agility;
    }
}
