public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, наставник!:)");
        System.out.println("Задание 1");
        int age = 22;
        {
            System.out.println("Если возраст человека равен " + age);
        }
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("Задание 2");
        int temperature = -10;
        if (temperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println("Задание 3");
        int score = 75;
        if (score > 60) {
            System.out.println("Если скорость " + score + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + score + ", можно ездить спокойно");
        }
        System.out.println("Задание 4");
        int ageP = 25;
        boolean ageMini = ageP > 2 && ageP <= 6;
        if (ageMini) {
            System.out.println("Если возраст человека равен " + ageP + ", то ему нужно ходить в детский сад.");
        }
        boolean ageMedium = ageP >= 7 && ageP <= 17;
        if (ageMedium) {
                System.out.println("Если возраст человека равен " + ageP + ", то ему нужно ходить в школу.");
             }
        boolean ageHard = ageP >= 18 && ageP <= 24;
        if (ageHard) {
                    System.out.println("Если возраст человека равен " + ageP + ", то его место в университете.");
                }
                boolean ageHardcore = ageP > 24;
        if (ageHardcore) {
                        System.out.println("Если возраст человека равен " + ageP + ", ему пора ходить на работу.");
                    }
        System.out.println("Задание 5");
        int childAge = 14;
        boolean childAgeNot5 = childAge < 5;
        if (childAgeNot5) {
            System.out.println( "Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционах");
        }
        boolean childAgeMedium = childAge >= 5 && childAge < 14;
        if (childAgeMedium) {
            System.out.println("Если возраст ребенка равен " + childAge + ", можно кататься на аттракционе в сопровождении взрослого");
        }
        boolean childAgeHight = childAge >= 14;
        if (childAgeHight) {
            System.out.println("Если возраст ребенка равен " + childAge + ", можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("Задание 6");
        int totalPlace = 102;
        int seatPlace = 60;
        int stayPlace = totalPlace - seatPlace;
        int peopleInTrainSeat = 48;
        int peopleInTrainStay =22;
        if ((seatPlace-peopleInTrainSeat)>0) {
            System.out.println("Сидячих мест в поезде " + (seatPlace-peopleInTrainSeat));
        } else {
            System.out.println("Сидячих мест не осталось");
        }
        if ((stayPlace-peopleInTrainStay)>0) {
            System.out.println("Стоячих мест в поезде"+ (stayPlace-peopleInTrainStay));
        } else {
            System.out.println("Стоячих мест не осталось");
        }
        System.out.println("Задание 7");
        int one = 14;
        int two = 23;
        int three = 3;
        if (one > two && one > three) {
            System.out.println( "Самое большое число " + one);
        } else if (two > one && two > three) {
            System.out.println("Самое большое число " + two);
        } else {
            System.out.println( "Самое большое число " + three);
        }}
}

