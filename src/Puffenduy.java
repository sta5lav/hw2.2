public class Puffenduy {
    private final String student;
    private int industriousness;
    private int loyalty;
    private int honor;
    private int rank;
    private int thePowerOfMagic;
    private int transgressionRange;

    public Puffenduy(String student, int industriousness, int loyalty,
                     int honor, int thePowerOfMagic, int transgressionRange) {
        this.student = student;
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honor = honor;
        this.rank = industriousness + loyalty + honor;
        this.thePowerOfMagic = thePowerOfMagic;
        this.transgressionRange = transgressionRange;
    }

    public String getStudent() {
        return student;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getThePowerOfMagic() {
        return thePowerOfMagic;
    }

    public void setThePowerOfMagic(int thePowerOfMagic) {
        this.thePowerOfMagic = thePowerOfMagic;
    }

    public int getTransgressionRange() {
        return transgressionRange;
    }

    public void setTransgressionRange(int transgressionRange) {
        this.transgressionRange = transgressionRange;
    }

    @Override
    public String toString() {
        return   "трудолюбие = " + industriousness +
                ", верность = " + loyalty +
                ", честь = " + honor +
                ", сумма баллов = " + rank +
                ", сила магии = " + thePowerOfMagic +
                ", расстояние трансгрессии = " + transgressionRange +
                '}';
    }
}
