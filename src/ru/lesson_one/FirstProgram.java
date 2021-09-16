package ru.lesson_one;

public class FirstProgram {
    //*************************************************************************************************************
    // Домашняя работа
// Задание 3 Написать метод вычисляющий выражение a * (b +(c / d)) и возвращающий результат,где
//a,b,c,d - входные параметры этого метода;
    static double doTwo(int a, int b, int c, int d) {
        int z = a * (b + (c / d));
        return z;
    }
// Задание 4 Написать метод,принимающий на вход два числа,и проверяющий что их сумма лежит в пределах
//от 10 до 20(включительно),если да - вернуть true, в противном случае - false;
    static void checkTwoNumbers(int a, int b){
        boolean z = a + b < 10 && a + b > 20;
        boolean n = a + b >= 10 && a + b <= 20;
        if (a + b < 10 && a + b > 20){
            System.out.println(z);
        }else{
            System.out.println(n);
        }
    }
// Задание 5 Написать метод,которому в качестве параметра передается целое число,метод должен напечатать
//в консоль положительное ли число передали, или отрицательное;Замечание:ноль считаем положительным числом;
    static void printIsPositive(int a){
        if (0 <= a){
            System.out.println("Положительное число");
        }else{
            System.out.println("Отрицательное число");
        }
    }
// Задание 6 Написать метод, которому в качестве параметра передается целое число,метод должен вернуть
//true,если число отрицательное;
    static void isNegative(int a){
        boolean x = 0 > a;
        if (0 > a){
            System.out.println(x);
        }
    }
// Задание 7 Написать метод, которому в качестве параметра передается строка,обозначающая имя,метод
//должен вывести в консоль сообщение "Привет,указанное_имя!";
    static void name(String a){
        System.out.println(a);
    }
// Задание 8 Написать метод,который определяет является ли год високосным,и выводит сообщение в консоль.
//Каждый 4-й год я вляется високосным,кроме каждого 100-го,при этом каждый 400-й-високосный;
    static void isLeapYear(int a){
        if (a % 4 == 0 && a % 100 != 0){
            System.out.println("Високосный год");
        }else if (a % 400 == 0){
            System.out.println("Високосный год");
        }else{
            System.out.println(" ");
        }
    }


    public static void main(String[] args){
        int z = (int)doTwo(10,43, 33,66);

        System.out.println("Otvet :" + z);

        checkTwoNumbers(12, 9);

        printIsPositive(-1);

        isNegative(-4334);

        name("Привет" + "," + " " + "Макс" + "!");

        isLeapYear(1600);
    }
    //*************************************************************************************************************
    // Работа над ошибками

    // Задание 3
//    private static int calculate(int a,int b, int c, int d){
//        return a * (b + (c / d));
//    }
//    private static float calculate(float a,float b, float c, float d){
//        return a * (b + (c / d));
//    }
//    // Задание 4
//    private static boolean checkTwoNumbers(int first,int second){
//        int sum = first + second;
//        return sum <= 20 && sum >= 10;
//    }
//    // Задание 5
//    private static void printIsPositive(int variable){
//        System.out.println("Your number is " + ((variable>= 0) ? "+" : "-" ) + " " + "!");
//    }
//    // Задание 6
//    private static boolean isNegative(int variable){
//        return (variable < 0);
//    }
//    // Задание 8
//    private static boolean isLeapYear(int year){
//        return (year % 100 != 0) && (year % 4 == 0) || (year % 400 == 0);
//    }
//
//    public static void main(String[] args){
//        // Задание 3
//        final int varOne = 3;
//        final int varTwo = 5;
//        final int varThree = 1;
//        final int varFour = 7;
//
//        final float fOne = 1;
//        final float fTwo = 1;
//        final float fThree = 1;
//        final float fFour = 7.0f;
//        System.out.println(calculate (varOne,varTwo,varThree,varFour ));
//        System.out.println(calculate (fOne,fTwo,fThree,fFour ));
//        // Задание 4
//        System.out.println(checkTwoNumbers (9, 2));
//        // Задание 5
//        printIsPositive(-1);
//        // Задание 6
//        System.out.println(isNegative(-1));
//        // Задание 8
//        System.out.println(isLeapYear(0));
//    }
    //*************************************************************************************************************
}