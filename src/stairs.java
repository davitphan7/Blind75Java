package src;

public class stairs {
    public static int exhClimbStairs(int n) {

        if (n == 1) {
            return 1;
        }
        if (n ==2){
            return 2;
        }

        return exhClimbStairs(n - 1)  + exhClimbStairs( n - 2);


    }

    public static void main(String[] args) {
        System.out.println(exhClimbStairs(5));




    }
}
