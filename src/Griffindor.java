public class Griffindor extends Hogwarts {
    private final int nobility;
    private final int honor;
    private final int bravery;
    private final int rank;

    public Griffindor(String student, int nobility, int honor, int bravery, int thePowerOfMagic, int transgressionRange) {
        super(student, thePowerOfMagic, transgressionRange);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        this.rank = nobility + honor + bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Факультет Griffindor. Студент: " + student + ". " +
                "благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery +
                ", сумма баллов = " + rank +
                ", сила магии = " + thePowerOfMagic +
                ", расстояние трансгрессии = " + transgressionRange;
    }
}
