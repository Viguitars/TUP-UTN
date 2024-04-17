package practicos.tp2.Ejercicio2;

public class Children extends Book {
    private int recommendedAge;

    public Children(String title, String author, int publicationYear,
                    int recommendedAge) {
        super(title, author, publicationYear);
        this.recommendedAge = recommendedAge;
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }

    public void setRecommendedAge(int recommendedAge) {
        this.recommendedAge = recommendedAge;
    }
}
