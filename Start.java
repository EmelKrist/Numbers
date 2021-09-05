package tasknumbers;

import java.util.Scanner;

public class Start {

    /**
     * Статичные элементы. n - количество чисел; numbers - массив чисел; nINPUT
     * - объект класса scanner для ввода данных;
     */
    static int n;
    static int[] numbers;
    static Scanner nINPUT = new Scanner(System.in);

    public Start() {
        inputNumbers(); //вызываем метод для вода данных
        Calculations(); //вызываем метод для проведения вычислений     
    }

    /**
     * Метод,отвечающий за ввод данных с командной строки.
     */
    public static void inputNumbers() throws NumberFormatException {

        try { // блок обработки ошибок
            System.out.print("Enter amount of numbers: ");
            n = nINPUT.nextInt(); //воддим количество чисел
            numbers = new int[n]; //задаем размер массива чисел

            System.out.println("\nEnter the values of numbers: ");
            int num = 0;
            //инициализируем массив чисел
            for (int i = 0; i < n; i++) {
                num++;
                System.out.print("Number №" + num + ":");
                int number = nINPUT.nextInt();
                numbers[i] = number;
                System.out.println();
            }

        } catch (Exception e) { //в случае ошибки выводится сообщение
            System.out.println("Допустим ввод только целых чисел!");
            System.exit(1); //программа завершается 
        }

    }

    /**
     * Метод,отвечающий за выисление суммы и произведения заданных чисел.
     */
    public static void Calculations() {
        //инициализируем меременные
        int sum = 0; //сумма
        int multipl = 1; //произведение

        for (int i = 0; i < n; i++) { //суммируем содержимое массива
            sum += numbers[i];
        }

        for (int i = 0; i < n; i++) { //перемножаем содержимое массива
            multipl *= numbers[i];
        }
        //выводим результаты вычислений
        System.out.println("Сумма чисел = " + sum
                + "\nПроизведение чисел = " + multipl);

    }

}
