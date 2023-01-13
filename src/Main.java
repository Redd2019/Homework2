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
    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        }

        public static void task2 () {
            System.out.println("Задача 2");
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            dog = dog + 4;
            System.out.println(dog);
            cat = cat + 4;
            System.out.println(cat);
            paper = paper + 4;
            System.out.println(paper);
        }

        public static void task3 () {
            System.out.println("Задача 3");
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            dog = dog - 3.5;
            System.out.println(dog);
            cat = cat - 1.6;
            System.out.println(cat);
            paper = paper - 7639;
            System.out.println(paper);
        }

        public static void task4 () {
            System.out.println("Задача 4");
            var friend = 19;
            System.out.println(friend);
            friend = friend + 2;
            System.out.println(friend);
            friend = friend / 7;
            System.out.println(friend);
        }

        public static void task5 () {
            System.out.println("Задача 5");
            var frog = 3.5;
            System.out.println(frog);
            frog = frog * 10;
            System.out.println(frog);
            frog = frog / 3.5;
            System.out.println(frog);
            frog = frog + 4;
            System.out.println(frog);
        }

        public static void task6 () {
            System.out.println("Задание 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightTotal = weightBoxer1 + weightBoxer2;
            System.out.println("Общий вес двух боксеров составит " + weightTotal);

            var weightDifference = weightBoxer2 - weightBoxer1;
            System.out.println("Разница в весе двух боксеров составит " + weightDifference);
        }

        public static void task7 () {
            System.out.println("Задание 7");
            var weightBoxer1 = 78.2;
            var weightBoxer2 = 82.7;
            var weightDifference = weightBoxer2 - weightBoxer1;
            System.out.println("Разница весов боксеров вычитанием составит " + weightDifference);

            var weightTotal = weightBoxer1 + weightBoxer2;
            var weightDifference2 = weightTotal % weightBoxer1;
            System.out.println("Разница весов боксеров остатком от деления составит " + weightDifference2);
        }

        public static void task8 () {
            System.out.println("Задание 8");
            var workingHoursTotal = 640;
            var hoursPerWorker = 8;
            var numberOfWorkers = workingHoursTotal / hoursPerWorker;
            System.out.println("Всего работников в компании - " + numberOfWorkers + " человек.");

            var moreWorkers = numberOfWorkers + 94;
            var workingHoursTotalNew = moreWorkers * hoursPerWorker;
            System.out.println("Если в компании работает " + moreWorkers + " человека, то всего " + workingHoursTotalNew + " часов работы может быть поделено между сотрудниками.");
        }
}