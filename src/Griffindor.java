public class Griffindor {
    private final String student;
    private int nobility;
    private int honor;
    private int bravery;
    private int rank;
    private int thePowerOfMagic;
    private int transgressionRange;

    public String getStudent() {
        return student;
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

    public int getThePowerOfMagic() {
        return thePowerOfMagic;
    }

    public int getTransgressionRange() {
        return transgressionRange;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setThePowerOfMagic(int thePowerOfMagic) {
        this.thePowerOfMagic = thePowerOfMagic;
    }

    public void setTransgressionRange(int transgressionRange) {
        this.transgressionRange = transgressionRange;
    }

    public Griffindor(String student, int nobility, int honor,
                      int bravery, int thePowerOfMagic, int transgressionRange) {
        this.student = student;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        this.rank = nobility + honor + bravery;
        this.thePowerOfMagic = thePowerOfMagic;
        this.transgressionRange = transgressionRange;
    }

    @Override
    public String toString() {
        return  "благородство = " + nobility +
                ", честь = " + honor +
                ", храбрость = " + bravery +
                ", сумма баллов = " + rank +
                ", сила магии = " + thePowerOfMagic +
                ", расстояние трансгрессии = " + transgressionRange;
    }
}
