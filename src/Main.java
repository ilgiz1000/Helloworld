public class Main {
    public static void main(String[] args) {
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        } else if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " ,он не достиг совершеннолетия, нужно немного подождать».");
        }

        int temperature = 5;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }


        int speed = 40;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч,то придется заплатить штраф");

        } else {
            System.out.println("Если скорость " + speed + " км/ч, то можно ездить спокойно");

        }


        age = 25;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в детский сад");


        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в университет");

        } else {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить на работу");
        }


        age = 14;
        if (age < 5) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нельзя кататься на аттракционе");

        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст человека равен " + age + " ,то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст человека равен " + age + " ,то ему можно кататься без сопровождения взрослого");
        }


        int peopleInTheCarriage = 103;
        int numberOfPassengerSeats = 102;
        int numberOfStandingSeats = 60;
        int freeSeets = numberOfPassengerSeats - peopleInTheCarriage;
        int standingSeats = numberOfStandingSeats - peopleInTheCarriage;

        boolean thereAreSeats = numberOfPassengerSeats > peopleInTheCarriage;
        if (thereAreSeats) {
            System.out.println("Места есть, " + "их осталось " + freeSeets + ",");
            if (peopleInTheCarriage <= numberOfStandingSeats) {
                System.out.println("но если пришедшие заняли сидячие, то их осталось " + standingSeats + ", остальные- стоячие");
            } else if (peopleInTheCarriage > numberOfStandingSeats) {
                System.out.println("однако остались только стоячие места");
            }

        } else if (peopleInTheCarriage > numberOfPassengerSeats) {
            System.out.println("Автобус забит");

        }

        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Самое большое число- " + one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число- " + two);
        } else {
            System.out.println("Самое большое число- " + three);
        }
    }
}

