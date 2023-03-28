public class Hogwarts {
    protected final String student;
    protected int thePowerOfMagic;
    protected int transgressionRange;

    public Hogwarts(String student, int thePowerOfMagic, int transgressionRange) {
        this.student = student;
        this.thePowerOfMagic = thePowerOfMagic;
        this.transgressionRange = transgressionRange;
    }

    public String getStudent() {
        return student;
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
        return    student + '\'' +
                ", сила магии = " + thePowerOfMagic +
                ", расстояние трансгрессии = " + transgressionRange;
    }
}
