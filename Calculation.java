package tasknumbers;

public class Calculation {
    
    static int[] numbers; 
    static int n;
    static int sum = 0; //сумма
    static int multipl = 1; //произведение
    
    public Calculation(int n, int[] numbers) {
     this.numbers = numbers;
     this.n = n;
     Calculations();
    } 
    
    /**
     * Метод,отвечающий за выисление суммы и произведения заданных чисел.
     */
    public static void Calculations() {

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
