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


    public static int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        int nSteps = 0;
        int firstStep = 2;
        int secondStep = 1;

        for (int i = 2; i < n; i++) {
            nSteps = firstStep + secondStep;
            secondStep = firstStep;
            firstStep = nSteps;
        }


        return nSteps;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));




    }
}
