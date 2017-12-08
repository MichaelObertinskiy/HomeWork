public class Task33 {
    public static void main(String[] args){
        System.out.println("Sum happy Tikets:\t" + happyTiket());
    }
    private static int happyTiket (){
        int res=0;
        for(int i=001001; i<=999999; i++){
            int a = i%10;
            int b = (i/10)%10;
            int c = (i/100)%10;
            int d = (i/1000)%10;
            int e = (i/10000)%10;
            int f = (i/100000)%10;
            if((a+b+c)==(d+e+f)){
                res++;
            }
        }
        return res;
    }
}
