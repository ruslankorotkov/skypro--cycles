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
        task9();
    }

    public static void task1() {
        System.out.println(" Задача 1 ");
        int accumulation = 15000;
        int totalAccumulation = 0;
        int total = 2459000;
        int month = 0;
        while (totalAccumulation < total) {
            totalAccumulation = accumulation + totalAccumulation;
            month = month + 1;
            System.out.println(" Месяц " + month + " сумма накоплений равна " + totalAccumulation + " рублей ");
        }
    }

    public static void task2() {
        System.out.println(" Задача 2 ");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(" " + i + " ");
        }
        for (int z = 10; z > 0; z = z - 1) {
            System.out.print(" " + z + " ");
        }
        {
            System.out.println();
        }
    }

    public static void task3() {
        System.out.println(" Задача 3 ");
        int countryPeople = 12000000;
        int mortality1000 = 8;
        int fertility1000 = 17;
        int peoplefer = (countryPeople * (fertility1000 - mortality1000)) / 1000;
        int year = 0;
        while (year < 10) {
            year = year + 1;
            countryPeople = peoplefer + countryPeople;
            System.out.println(" Год " + year + "  численность населения составляет  " + countryPeople);
        }
    }

    public static void task4() {
        System.out.println(" Задача 4 ");
        int accumulation = 15000;
        double totalAccumulation = 0;
        int total = 12000000;
        double percent = 0.07;
        int month = 0;
        while (totalAccumulation < total) {
            totalAccumulation = accumulation + totalAccumulation;
            totalAccumulation = totalAccumulation + (totalAccumulation * percent);
            month = month + 1;
            System.out.println(" Месяц " + month + " сумма накоплений равна " + totalAccumulation + " рублей ");
        }
    }

    public static void task5() {
        System.out.println(" Задача 5 ");
        int accumulation = 15000;
        double totalAccumulation = 0;
        int total = 12000000;
        int month = 0;
        double percent = 0.07;
        while (totalAccumulation < total) {
            totalAccumulation = accumulation + totalAccumulation;
            totalAccumulation = totalAccumulation + (percent * totalAccumulation);
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println(" Месяц " + month + " сумма накоплений равна " + totalAccumulation + " рублей ");
            }
        }
    }

    public static void task6() {
        System.out.println(" Задача 6 ");
        int accumulation = 15000;
        double totalAccumulation = 0;
        int month = 0;
        int year9 = 12 * 9;
        double percent = 0.07;
        while (month < year9) {
            totalAccumulation = accumulation + totalAccumulation;
            totalAccumulation = totalAccumulation + (totalAccumulation * percent);
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println(" Месяц " + month + " сумма накоплений равна " + totalAccumulation + " рублей ");
            }
        }
    }

    public static void task7() {
        System.out.println(" Задача 7 ");
        int day = 3;
        System.out.println(" Сегодня пятница, " + day + " -е число. Необходимо подготовить отчет  ");
        while (day < 31) {
            day = day + 7;
            System.out.println(" Сегодня пятница, " + day + " -е число. Необходимо подготовить отчет  ");
        }
    }

    public static void task8() {
        System.out.println(" Задача 8 ( способ 1 )");
        int year = 0;
        int yearReal = 2022;
        int yearDown = 200;
        int yearUp = 100;
        while (year <= yearReal + yearUp) {
            year = year + 79;
            if (year > yearReal - yearDown && year < yearReal + yearUp) {
                System.out.println(" " + year + "");
            }
        }
    }

    public static void task9() {
        System.out.println(" Задача 8 ( способ 2 )");
        int yearReal = 2022;
        int yearDown = 200;
        int yearUp = 100;
        for (int year = 0; year <= yearReal + yearUp; year = year + 79) {
            if (year > yearReal - yearDown) {
                System.out.println(" " + year + " ");
            }
        }
    }
}
