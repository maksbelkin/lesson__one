package ru.lesson_two;

public class SecondProgram {
    public static void main(String[] args) {
// 1 урок
        int x = 12;
        switch (x) {
            case 13:
                System.out.println('1');
                break;
            case 132:
                System.out.println('2');
                break;
            case 1313:
                System.out.println('3');
                break;
            case 134:
                System.out.println('4');
                break;
            case 1:
                System.out.println('5');
                break;
            default:
                System.out.println('6');
        }
// 2 урок
        int w;
        for (w = 0; w < 10; w++) {
            System.out.println(w);
        }
        System.out.println(w);

// 3 урок
        int q = 0;
        while (q < 5) {
            System.out.println("Hello!");
            q++;
        }
        int i = 0;
// 4 урок
        do {
            System.out.println(i);
            i++;

        } while (i < -1);
// 5 урок
        for (int r = 1; r < 10; r++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.print("\n");

        }
    }

}

