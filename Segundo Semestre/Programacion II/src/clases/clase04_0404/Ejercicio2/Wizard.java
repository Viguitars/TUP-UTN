package clases.clase04_0404.Ejercicio2;

public class Wizard extends CharacterBase {

    //    Atributo
    private int intelligence;

    //    Constructor
    public Wizard(int intelligence) {
        this.intelligence = intelligence;
    }

    public Wizard(String name, int level, int healthPoints, int intelligence) {
        super(name, level, healthPoints);
        this.intelligence = intelligence;
    }

    //    Getters y Setters
    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    //    Implementación de ataque específico del mago
    //    El daño es dos veces el nivel del mago más la inteligencia
    @Override
    public int attack() {
        return 2 * level + intelligence;
    }
}
