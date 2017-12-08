import java.util.Scanner;

/*
Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его
цифр (заранее не известно сколько цифр будет в числе).
 */
public class Task31 {
    public static void main(String[] args){
        System.out.println(sumNumber(input()));
    }
    private static int input(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number");
        int x = scan.nextInt();
        return x;
    }
    private static int sumNumber (int x){
        int a = 0;
        while(x > 0){
            a += x % 10;
            x = x / 10;
        }
        return a;
    }

}
