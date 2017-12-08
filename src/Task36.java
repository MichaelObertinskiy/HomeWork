import java.util.Random;

/*
Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из
отрезка [-5;5]. Вывести массив на экран. Определить и вывести на экран индекс строки с
наибольшим по модулю произведением элементов. Если таких строк несколько, то вывести
индекс первой встретившейся из них.
 */
public class Task36 {
    public static void main(String[] args) {
        int str = 7, col = 4;
        int[][] array =  int  createArray(str, col);

    }

    public static int[][] createArray(int x, int y) {
        int[][] arr = new int[x][y];
        Random ran = new Random();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = ran.nextInt(11) - 5;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        return arr;
    }

    public static void maxLine() {
        int res = 0;
        for (int i = 0; i < 7; i++) {
            array
        }
    }

}


