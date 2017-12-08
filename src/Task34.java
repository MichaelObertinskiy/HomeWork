/*
Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за
        сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
        что справа от двоеточия (например, 02:20, 11:11 или 15:51).
*/
public class Task34 {
    public static void main(String [] args){
        System.out.println(clock());
    }
    private static int clock(){
        int res = 0,a=0, b=0, c=0, d=0;
        for (int hour=00; hour < 24; hour++) {
            for (int minut=00 ;minut < 60; minut++) {
                a = hour % 10;
                b = (hour / 10) % 10;
                c = minut % 10;
                d = (minut / 10) % 10;
                if (a == d && b == c) {
//                    System.out.println(b + ""  + a + ":" + d + "" + c);
                    res++;
                }
            }
        }
        return res;

    }


}
