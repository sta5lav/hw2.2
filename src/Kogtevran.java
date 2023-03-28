public class Kogtevran extends Hogwarts {
    private final int smart;
    private final int wisdom;
    private final int wit;
    private final int fullOfCeativity;
    private final int rank;

    public Kogtevran(String student, int smart, int wisdom, int wit, int fullOfCeativity, int thePowerOfMagic, int transgressionRange) {
        super(student, thePowerOfMagic, transgressionRange);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.fullOfCeativity = fullOfCeativity;
        this.rank = smart + wisdom + wit + fullOfCeativity;
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

    @Override
    public String toString() {
        return          "Факультет Kogtevran. Студент: " + student + ". " +
                        "ум = " + smart +
                        ", мудрость = " + wisdom +
                        ", остроумие = " + wit +
                        ", творчество = " + fullOfCeativity +
                        ", сумма баллов = " + rank +
                        ", сила магии = " + thePowerOfMagic +
                        ", расстояние трансгрессии = " + transgressionRange;
    }
}
