import java.util.Random;

/*
Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из
        отрезка [10;99]. Вывести массив на экран.
*/
public class Task35 {
    public static void main(String[] args){
        array(8,5);
    }
    public static void array (int str, int col){
        Random ran = new Random();
        for (int i=0; i<str; i++){
            for (int j=0; j<col; j++){
                System.out.print((ran.nextInt(89)+10) + "\t");
            }
            System.out.println();
        }
    }
}
