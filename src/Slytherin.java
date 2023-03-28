public class Slytherin extends Hogwarts {

    private final int trick;
    private final int determination;
    private final int ambition;
    private final int resourcefulness;
    private final int lustForPower;
    private final int rank;

    public Slytherin(String student, int trick, int determination, int ambition, int resourcefulness, int lustForPower, int thePowerOfMagic, int transgressionRange) {
        super(student, thePowerOfMagic, transgressionRange);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
        this.rank = trick + determination + ambition + resourcefulness + lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return  "Факультет Slytherin. Студент: " + student + ". " +
                "хитрость = " + trick +
                ", решительность = " + determination +
                ", амбициозность = " + ambition +
                ", находчивость = " + resourcefulness +
                ", жажда власти = " + lustForPower +
                ", сумма баллов = " + rank +
                ", сила магии = " + thePowerOfMagic +
                ", расстояние трансгрессии = " + transgressionRange;
    }
}
