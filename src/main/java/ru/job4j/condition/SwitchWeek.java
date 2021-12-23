package ru.job4j.condition;

    public class SwitchWeek {
        public static String nameOfDay(int day) {
            String name;
            switch (day) {
                case 1:
                    name = "Monday";
                    break;
                case 2:
                    name = "Sunday";
                    break;
                case 3:
                    name = "Tuesday";
                    break;
                case 4:
                    name = "Wednesday";
                    break;
                case 5:
                    name = "Thursday";
                    break;
                case 6:
                    name = "Friday";
                    break;
                case 7:
                    name = "Saturday";
                    break;
                default:
                    name = "ошибка";
                    break;
            }
            return name;
        }

        public static void main(String[] args) {
            System.out.println(nameOfDay(7));
        }
    }

