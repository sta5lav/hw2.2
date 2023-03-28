public class Main {
    public static void main(String[] args) {
        Griffindor harryPotter = new Griffindor
                ("Гарри Поттер", 34, 33, 35, 54, 16);
        Griffindor hermioneGranger = new Griffindor
                ("Гермиона Грейнджер ", 35, 27, 23, 47, 17);
        Griffindor ronWeasley = new Griffindor
                ("Рон Уизли ", 30, 31, 31, 43, 11);
        Slytherin dracoMalfoy = new Slytherin
                ("Драко Малфой", 22, 29, 36, 19,
                        34, 52, 17);
        Slytherin grahamMontague = new Slytherin
                ("Грэхэм Монтегю", 18, 23, 31, 15,
                        29, 35, 11);
        Slytherin gregoryGoyle = new Slytherin
                ("Грегори Гойл", 17, 21, 30, 14,
                        28, 36, 11);
        Puffenduy zachariahSmith = new Puffenduy
                ("Захария Смит", 26, 30, 35, 43, 15);
        Puffenduy cedricDiggory = new Puffenduy
                ("Седрик Диггори", 29, 34, 39, 49, 14);
        Puffenduy justinFinchFletchley = new Puffenduy
                ("Джастин Финч-Флетчли", 25, 30, 34, 44, 14);
        Kogtevran zhouChang = new Kogtevran
                ("Чжоу Чанг", 23, 24, 29, 31, 40, 9);
        Kogtevran padmaPatil = new Kogtevran
                ("Падма Патил", 24, 21, 31, 35, 37, 15);
        Kogtevran marcusBelby = new Kogtevran
                ("Маркус Белби", 27, 29, 32, 27, 38, 13);

        System.out.println(harryPotter.toString());
        System.out.println(dracoMalfoy.toString());
        compareStudentsRankGriffindor(harryPotter, ronWeasley);
        compareStudentsRankKogtevran(padmaPatil, zhouChang);
        compareStudentsRankPuffenduy(zachariahSmith, cedricDiggory);
        compareStudentsRankSlytherin(dracoMalfoy, gregoryGoyle);
        compareStudentsForPowerOfMagic(harryPotter.getStudent(), harryPotter.getThePowerOfMagic(), dracoMalfoy.getStudent(), dracoMalfoy.getThePowerOfMagic());
    }

    public static void compareStudentsRankGriffindor(Griffindor one, Griffindor two) {
        String result = null;
        String fakultet = "Гриффиндорец";
        if (one.getRank() > two.getRank()) {
            result = one.getStudent() + " лучший " + fakultet + ", чем " + two.getStudent();
        } else result = two.getStudent() + " лучший " + fakultet + ", чем " + one.getStudent();
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
