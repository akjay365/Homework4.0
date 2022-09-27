public class Main {


    public static void main(String[] args) {

        short bananas = 200;
        System.out.println("Бананов " + bananas + " кг!");

        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("Одна порция сахара весит " + onePortion + " кг!");


        byte a = 1;
        int c = 1;
        short b = 1;
        int d = a + b + c;
        System.out.println(d);
        float g = a + 1f;
        System.out.println(g);


        byte a1 = 1;
        short b2 = 2;
        int c3 = 3;
        long d4 = 4L;
        float e5 = 5;
        double f6 = 6.3;
        System.out.println("Значение переменной а1 с типом byte равно " + a1 + "! " + "" +
                "Значение переменной b2 с типом short равно " + b2 + "! " +
                "Значение переменной c3 с типом int равно " + c3 + "! " +
                "Значение переменной d4 с типом long равно " + d4 + "! " +
                "Значение переменной e5 с типом float равно " + e5 + "! " +
                "Значение переменной f6 с типом double равно " + f6 + "! ");


        double a26 = 27.12;
        long b3 = 987678965549L;
        float c4 = 2.786f;
        short d5 = 569;
        short e6 = -159;
        int f7 = 27897;
        byte g8 = 67;


        byte classLP = 23;
        byte classAS = 27;
        byte classEA = 30;
        short sheets = 480;
        float sheetsPerUnit = sheets / (classLP + classAS + classEA);
        System.out.println("На каждого ученика расчитано " + sheetsPerUnit + " листов бумаги!");


        byte bottles = 16;
        byte time = 2;
        int productivityIn20Min = bottles / 2 * 20;
        System.out.println("За 20 мин работы машина произвела бутылок " + productivityIn20Min + " штук!");
        int productivityInDay = bottles / 2 * 1440;
        System.out.println("За сутки работы машина произвела бутылок " + productivityInDay + " штук!");
        int productivityIn3Days = bottles / 2 * (productivityInDay * 3);
        System.out.println("За 3 дня работы машина произвела бутылок " + productivityIn3Days + " штук!");
        int monthlyIndicators = bottles / 2 * (productivityInDay * 30);
        System.out.println("За 1 месяц работы машина произвела бутылок " + monthlyIndicators + " штук!");


        int cansOfPaint = 120;
        byte white = 2;
        byte brown = 4;
        float numberClasses = cansOfPaint / (white + brown);
        System.out.println(numberClasses);
        float white1 = numberClasses * 2;
        float brown2 = numberClasses * 4;
        System.out.println("В школе, где " + numberClasses + " классов, нужно " + white1 + " банок белой краски и "
                + brown2 + " банок коричневой краски");



        int bananas1 = 80 * 5;
        short milk = 105 * 2;
        short plombir = 100 * 2;
        short eggs = 70 * 4;
        int recipe = bananas1 + milk + plombir + eggs;
        System.out.println(recipe + " грамм!");
        float recipekg = recipe / 1000f;
        System.out.println(recipekg + " киллограм");



        int weight1 = 7000;
        short weight2 = 250;
        short weight3 = 500;
        int days1 = weight1 / weight2;
        System.out.println(days1);
        int days2 = weight1 / weight3;
        System.out.println(days2);


        int MashaBefore = 67760;
        int DenisBefore = 83690;
        int KristinaBefore = 76230;
        double MashaRaising = MashaBefore * 1.1;
        double DenisRaising = DenisBefore * 1.1;
        double KristinaRaising = KristinaBefore * 1.1;
        double MashaBeforeAfter = (MashaRaising * 12) - (MashaBefore * 12);
        System.out.println("Маша теперь получает " + MashaRaising + " рублей. Годовой доход вырос на " +
                MashaBeforeAfter + " рублей");
        double DenisBeforeAfter = (DenisRaising * 12) - (DenisBefore * 12);
        System.out.println("Денис теперь получает " + DenisRaising + " рублей. Годовой доход вырос на " +
                DenisBeforeAfter + " рублей");
        double KristinaBeforeAfter = (KristinaRaising * 12) - (KristinaBefore * 12);
        System.out.println("Кристина теперь получает " + KristinaRaising + " рублей. Годовой доход вырос на " +
                KristinaBeforeAfter + " рублей");
    }}