public class Stat {
    /* Combinations */
    public static double nCr(double a, double b){
        return factorial(a) / (factorial(b) * factorial(a - b));
    }

    /* Permutations */
    public static double nPr(double a, double b){
        return factorial(a) / factorial(a - b);
    }

    /* Factorial of a */
    public static double factorial(double a){
        double answer = 1;
        for(double i = a; i > 0; i--){
            answer *= i;
        }
        return answer;
    }
}
