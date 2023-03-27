public class Kogtevran {
    private final String student;
    private int smart;
    private int wisdom;
    private int wit;
    private int fullOfCeativity;
    private int rank;
    private int thePowerOfMagic;
    private int transgressionRange;

    public Kogtevran(String student, int smart, int wisdom,
                     int wit, int fullOfCeativity,
                     int thePowerOfMagic, int transgressionRange) {
        this.student = student;
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.fullOfCeativity = fullOfCeativity;
        this.rank = smart + wisdom + wit + fullOfCeativity;
        this.thePowerOfMagic = thePowerOfMagic;
        this.transgressionRange = transgressionRange;
    }

    public String getStudent() {
        return student;
    }

    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getFullOfCeativity() {
        return fullOfCeativity;
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

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setFullOfCeativity(int fullOfCeativity) {
        this.fullOfCeativity = fullOfCeativity;
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

    @Override
    public String toString() {
        return          "ум = " + smart +
                        ", мудрость = " + wisdom +
                        ", остроумие = " + wit +
                        ", творчество = " + fullOfCeativity +
                        ", сумма баллов = " + rank +
                        ", сила магии = " + thePowerOfMagic +
                        ", расстояние трансгрессии = " + transgressionRange;
    }
}
