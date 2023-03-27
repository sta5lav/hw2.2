public class Main {
    public static void main(String[] args) {
        Hogwarts students = new Hogwarts();
        System.out.println(students.toString()); //список студентов
        compareStudentsRankGriffindor(students.harryPotter, students.ronWeasley);
        compareStudentsRankKogtevran(students.padmaPatil, students.zhouChang);
        compareStudentsRankPuffenduy(students.zachariahSmith, students.cedricDiggory);
        compareStudentsRankSlytherin(students.dracoMalfoy, students.gregoryGoyle);
        compareStudentsForPowerOfMagic(students.dracoMalfoy.getStudent(), students.dracoMalfoy.getThePowerOfMagic(),
                students.harryPotter.getStudent(), students.harryPotter.getThePowerOfMagic());
    }

    public static void compareStudentsRankGriffindor(Griffindor f, Griffindor s) {
        String result = null;
        String fakultet = "Гриффиндорец";
        if (f.getRank() > s.getRank()) {
            result = f.getStudent() + " лучший " + fakultet + ", чем " + s.getStudent();
        } else result = s.getStudent() + " лучший " + fakultet + ", чем " + f.getStudent();
        System.out.println(result);
    }

    public static void compareStudentsRankKogtevran(Kogtevran f, Kogtevran s) {
        String result = null;
        String fakultet = "Когтевранец";
        if (f.getRank() > s.getRank()) {
            result = f.getStudent() + " лучший " + fakultet + ", чем " + s.getStudent();
        } else result = s.getStudent() + " лучший " + fakultet + ", чем " + f.getStudent();
        System.out.println(result);
    }

    public static void compareStudentsRankPuffenduy(Puffenduy f, Puffenduy s) {
        String result = null;
        String fakultet = "Пуффендуец";
        if (f.getRank() > s.getRank()) {
            result = f.getStudent() + " лучший " + fakultet + ", чем " + s.getStudent();
        } else result = s.getStudent() + " лучший " + fakultet + ", чем " + f.getStudent();
        System.out.println(result);
    }

    public static void compareStudentsRankSlytherin(Slytherin f, Slytherin s) {
        String result = null;
        String fakultet = "Слизеринец";
        if (f.getRank() > s.getRank()) {
            result = f.getStudent() + " лучший " + fakultet + ", чем " + s.getStudent();
        } else result = s.getStudent() + " лучший " + fakultet + ", чем " + f.getStudent();
        System.out.println(result);
    }

    public static void compareStudentsForPowerOfMagic(String firstMageName, int fRank, String secondMageName, int sRank) {
        if (fRank > sRank) {
            System.out.println(firstMageName + " обладает большей магической мощью, чем " + secondMageName);
        } else System.out.println(secondMageName + " обладает большей магической мощью, чем " + firstMageName);

    }
}