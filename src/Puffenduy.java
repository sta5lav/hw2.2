public class Puffenduy extends Hogwarts {
    private final int industriousness;
    private final int loyalty;
    private final int honor;
    private final int rank;


    public Puffenduy(String student, int industriousness, int loyalty, int honor, int thePowerOfMagic, int transgressionRange) {
        super(student, thePowerOfMagic, transgressionRange);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honor = honor;
        this.rank = industriousness + loyalty + honor;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonor() {
        return honor;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return   "Факультет Puffenduy. Студент: " + student + ". " +
                "трудолюбие = " + industriousness +
                ", верность = " + loyalty +
                ", честь = " + honor +
                ", сумма баллов = " + rank +
                ", сила магии = " + thePowerOfMagic +
                ", расстояние трансгрессии = " + transgressionRange;
    }
}
