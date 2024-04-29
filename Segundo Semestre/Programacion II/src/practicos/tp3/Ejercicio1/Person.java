package practicos.tp3.Ejercicio1;

public abstract class Person {
    protected int identityDocument;
    protected String name;

    public Person() {
    }

    public Person(int identityDocument, String name) {
        this.identityDocument = identityDocument;
        this.name = name;
    }

    public int getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(int identityDocument) {
        this.identityDocument = identityDocument;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
