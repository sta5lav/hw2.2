public class Hogwarts {
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
    @Override
    public String toString() {
        return "Гарри Поттер: " + harryPotter + '\n' +
                "Гермиона Грейнджер: " + hermioneGranger + '\n' +
                "Рон Уизли: " + ronWeasley + '\n' +
                "Драко Малфой: " + dracoMalfoy + '\n' +
                "Грэхэм Монтегю: " + grahamMontague + '\n' +
                "Грегори Гойл: " + gregoryGoyle + '\n' +
                "Захария Смит: " + zachariahSmith + '\n' +
                "Седрик Диггори: " + cedricDiggory + '\n' +
                "Джастин Финч-Флетчли: " + justinFinchFletchley + '\n' +
                "Чжоу Чанг: " + zhouChang + '\n' +
                "Падма Патил: " + padmaPatil + '\n' +
                "Маркус Белби: " + marcusBelby;
    }
}
