/*
Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
первый и второй члены последовательности равны единицам, а каждый следующий — сумме
двух предыдущих.
 */
public class Task32 {
    public static void main(String[] args){
        fibonachi();
    }
    private static void fibonachi(){
        int a = 1, b = 1, c = 0;
        System.out.print(a + " ");
        for (int i=0; i<10; i++){
            System.out.print(b + " " );
            c = b;
            b += a;
            a = c;
        }
    }
}
