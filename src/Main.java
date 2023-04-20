import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte a = 12;
        System.out.println("Значение переменной a с типом byte равно " + a);
        short b = 32;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 99;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 555555555555L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float e = 5.5f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 6.256;
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2(){
        System.out.println("Задача 2");
        float a1 = 27.12f;
        long b1 = 987678965549L;
        double c1 = 2.786;
        short d1 = 569;
        short e1 = -159;
        int f1 = 27897;
        byte g1 = 67;
    }

    public static void task3(){
        System.out.println("Задача 3");
        byte studLudmila = 23;
        System.out.println("Людмила Павловна - " + studLudmila + " ученика");
        byte studAnna = 27;
        System.out.println("Анна Сергеевна - " + studAnna + " учеников");
        byte studEkaterina = 30;
        System.out.println("Екатерина Андреевна - " + studEkaterina + " учеников");
        short totalPaper = 480;
        System.out.println("Общее количество бумаги - " + totalPaper);
        int totalStud = studLudmila + studAnna + studEkaterina;
        int studPaper = totalPaper / totalStud;
        System.out.println("На каждого ученика рассчитано " + studPaper + " листов бумаги");
    }

    public static void task4(){
        System.out.println("Задача 4");
        byte totalBottle = 16;
        System.out.println("Машина производит " + totalBottle + " бутылок");
        byte minTime = 2;
        System.out.println("16 бутылок производится за " + minTime + " минуты");
        byte time1 = 20; // 20 минут
        short time2 = 1440; // в сутки
        short time3 = 4320; // за 3 дня
        int time4 = 44640; // за 1 месяц
        int bottles1min = totalBottle / minTime;
        int min20 = time1 * bottles1min;
        System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок");
        int day1 = time2 * bottles1min;
        System.out.println("В сутки машина произвела " + day1 + " штук бутылок");
        int day3 = time3 * bottles1min;
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок");
        int mou1 = time4 * bottles1min;
        System.out.println("За месяц машина произвела " + mou1 + " штук бутылок");
    }

    public static void task5(){
        System.out.println("Задача 5");
        byte totalPaint = 120;
        System.out.println("Общее количество банок краски двух цветов - " + totalPaint + " банок");
        byte whitePaint = 2;
        System.out.println("Количество белой краски на 1 класс - " + whitePaint + " банки");
        byte brownPaint = 4;
        System.out.println("Количество коричневой краски на 1 класс - " + brownPaint + " банки");
        int totalNecPaint = brownPaint + whitePaint;
        int totalClasses = totalPaint / totalNecPaint;
        int totalWhitePaint = totalClasses * whitePaint;
        int totalBrownPaint = totalClasses * brownPaint;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
    }

    public static void task6(){
        System.out.println("Задача 6");
        byte totalBananas = 5;
        System.out.println("Бананы - " + totalBananas + " шт");
        byte weight1Banana = 80;
        System.out.println("В 1 банане - " + weight1Banana + " грамм");
        float totalMilk = 2.0f;
        System.out.println("Молоко - " + totalMilk + " мл");
        short milk100ml = 105;
        System.out.println("В 100 мл молока - " + milk100ml + " грамм");
        byte totalIceCream = 2;
        System.out.println("Брикеты мороженого - " + totalIceCream + " шт");
        byte weightIceCream = 100;
        System.out.println("В 1 брикете мороженого - " + weightIceCream + " грамм");
        byte totalEggs = 4;
        System.out.println("Яйца - " + totalEggs + " шт");
        byte egg1 = 70;
        System.out.println("В 1 яйце - " + egg1 + " грамм");
        int totalBananasGr = totalBananas * weight1Banana;
        float totalMilkGr = totalMilk * milk100ml;
        int totalIceCreamGr = totalIceCream * weightIceCream;
        int totalEggsGr = totalEggs * egg1;
        float totalWeightGr = totalBananasGr + totalMilkGr + totalIceCreamGr + totalEggsGr;
        float totalWeightKg = totalWeightGr / 1000;
        System.out.println("В завтраке спортсмена " + totalWeightGr + " грамм или " + totalWeightKg + " килограмм");
    }

    public static void task7(){
        System.out.println("Задача 7");
        byte totalWeightKg = 7;
        System.out.println("Нужно сбросить " + totalWeightKg + " кг");
        int weight1gr = 250;
        System.out.println("Потеря в весе на " + weight1gr + " грамм");
        int weight2gr = 500;
        System.out.println("Потеря в весе на " + weight2gr + " грамм");
        int totalWeightGr = totalWeightKg * 1000;
        int totalDays250Gr = totalWeightGr / weight1gr;
        int totalDays500Gr = totalWeightGr / weight2gr;
        double diffDays = (weight1gr + weight2gr) / 2D;
        double diffDaysGeneral = totalWeightGr / diffDays;
        System.out.println("При похедании на 250 грамм в день потребуется " + totalDays250Gr + " дней похудения");
        System.out.println("При похедании на 500 грамм в день потребуется " + totalDays500Gr + " дней похудения");
        System.out.printf(Locale.US,"Среднее количество дней для похудения составит %.2f%n", diffDaysGeneral);
    }

    public static void task8(){
        System.out.println("Задача 8");
        int moneyMasha = 67760;
        System.out.println("Маша получает " + moneyMasha + " рублей в месяц");
        int moneyDenis = 83690;
        System.out.println("Денис получает " + moneyDenis + " рублей в месяц");
        int moneyKristina = 76230;
        System.out.println("Кристина получает " + moneyKristina + " рублей в месяц");
        double moneyMashaNew = moneyMasha * 1.1;
        System.out.println("При повышении зарплаты на 10%, Маша будет зарабатывать " + moneyMashaNew + " рублей в месяц");
        double moneyDenisNew = moneyDenis * 1.1;
        System.out.println("При повышении зарплаты на 10%, Денис будет зарабатывать " + moneyDenisNew + " рублей в месяц");
        double moneyKristinaNew = moneyKristina * 1.1;
        System.out.println("При повышении зарплаты на 10%, Кристина будет зарабатывать " + moneyKristinaNew + " рублей в месяц");
        double diffMoneyMasha1year = (moneyMashaNew - moneyMasha) * 12;
        double diffMoneyDenis1year = (moneyDenisNew - moneyDenis) * 12;
        double diffMoneyKristina1year = (moneyKristinaNew - moneyKristina) * 12;
        System.out.println("Годовая разница зарплаты Маши после повышения составляет " + diffMoneyMasha1year + " рублей");
        System.out.println("Годовая разница зарплаты Дениса после повышения составляет " + diffMoneyDenis1year + " рублей");
        System.out.println("Годовая разница зарплаты Кристины после повышения составляет " + diffMoneyKristina1year + " рублей");
    }
}