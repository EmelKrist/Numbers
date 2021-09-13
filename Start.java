package tasknumbers;

import java.util.Scanner;

public class Start {

    /**
     * Статичные элементы. n - количество чисел; numbers - массив чисел; nINPUT
     * - объект класса scanner для ввода данных;
     */
    static int n;
    static Scanner nINPUT = new Scanner(System.in);
    static int[] numbers; 
     
    public Start() {
       inputNumbers(); //вызываем метод для вода данных    
    }

    /**
     * Метод,отвечающий за ввод данных с командной строки.
     */
    public static void inputNumbers() throws NumberFormatException {

        try { // блок обработки ошибок
            System.out.print("Enter amount of numbers: ");
            n = nINPUT.nextInt(); //воддим количество чисел
            numbers = new int[n]; //задаем размер массива чисел
            
            if(n==0){
             //выводим результаты вычислений
             System.out.println("Сумма чисел = 0"
             + "\nПроизведение чисел = 0");
             System.exit(0); //программа завершается 
            }else{
            System.out.println("\nEnter the values of numbers: ");
            int num = 0;
            //инициализируем массив чисел
            for (int i = 0; i < n; i++) {
                num++;
                System.out.print("Number №" + num + ":");
                int number = nINPUT.nextInt();
                numbers[i] = number;
                System.out.println();
            }}

        } catch (Exception e) { //в случае ошибки выводится сообщение
            System.out.println("Введенно некорректное значение!");
            System.exit(0); //программа завершается 
        }
        
        //создаем объект класса Calculation для проведения вычислений
        Calculation calc = new Calculation(n,numbers);

    }
}
