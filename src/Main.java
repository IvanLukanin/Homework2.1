public class Main {
    public static void main(String[] args) {
        task1 ();
        task2();
        task3();
        task4();
        task5();
        task6();
}
public static void task1 () {
    System.out.println("Задача 1");
    byte a = 120;
    short b = -3021;
    int c = 67512987;
    long d = -783665818;
    float e = 120.2f;
    double f = -15021.124;
    }

    public static void task2 () {
        System.out.println("Задача 2");
        byte a = 67;
        short b = 569;
        int c = 27897;
        long d = -159;
        float e = 27.12F;
        double f = 2.786;
    }

    public static void task3 () {
        System.out.println("Задача 3");
        byte a = 23;
        byte b = 27;
        byte c = 30;
        short totalSheets = 480;
        System.out.println("Всего учеников " + (a + b + c));
        short totalStudents = 80;
        System.out.println("На каждого ученика расчитано " + (totalSheets / totalStudents) + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("Зачада 4");
        byte machinePerfomance = 16 / 2;
        System.out.println( machinePerfomance + " штук - производительность в 1 минуту");
        short timeOne = 20;
        int thingsOne = machinePerfomance * timeOne;
        System.out.println("За " + timeOne + " минут машина произвела " + thingsOne + " штук бутылок");
        short timeTwo = 1440;
        int thingsTwo = machinePerfomance * timeTwo;
        System.out.println("За сутки машина произвела " + thingsTwo + " штук бутылок");
        short timeThree = 4320;
        int thingsThree = machinePerfomance * timeThree;
        System.out.println("За 3 дня машина произвела " + thingsThree + " штук бутылок");
        int timeFour = 43200;
        int thingsFour = machinePerfomance * timeFour;
        System.out.println("За 1 месяц машина производит " + thingsFour + " штук бутылок");}

    public static void task5 () {
        System.out.println("Задача 5");
        byte oneClass = 2 + 4;
        System.out.println(oneClass + " банок краски было куплено на 1 класс");
        byte totalClasses = 120 / 6;
        System.out.println(totalClasses + " классов всего");
        byte whitePaint = 20 * 2;
        byte brownPaint = 20 * 4;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");
    }

    public static void task6 () {
        System.out.println("Задача 6");

    }
}