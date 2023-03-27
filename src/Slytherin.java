public class Slytherin {
    private final String student;
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;
    private int rank;
    private int thePowerOfMagic;
    private int transgressionRange;

    public Slytherin(String student, int trick, int determination,
                     int ambition, int resourcefulness, int lustForPower,
                     int thePowerOfMagic, int transgressionRange) {
        this.student = student;
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
        this.rank = trick + determination + ambition + resourcefulness + lustForPower;
        this.thePowerOfMagic = thePowerOfMagic;
        this.transgressionRange = transgressionRange;
    }

    public String getStudent() {
        return student;
    }
    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
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
        return  "хитрость = " + trick +
                ", решительность = " + determination +
                ", амбициозность = " + ambition +
                ", находчивость = " + resourcefulness +
                ", жажда власти = " + lustForPower +
                ", сумма баллов = " + rank +
                ", сила магии = " + thePowerOfMagic +
                ", расстояние трансгрессии = " + transgressionRange;
    }
}
