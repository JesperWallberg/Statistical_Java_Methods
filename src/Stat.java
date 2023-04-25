public class Stat {
    /* Binomnial distribution */
    public static double binominalDist(double k, double n, double p){
        return nCr(n, k) * Math.pow(p, k) * Math.pow((1 - p), (n - k));
    }

    /* Hypergeometric distribution */
    public static double hyperDist(double k, double N, double n, double p){
        return nCr((N * p), k) * nCr(N * (1 - p), (n - k)) / nCr(N, n);
    }

    /* Poisson distribution */
    public static double poissonDist(double k, double u){
        return (Math.pow(u, k) / factorial(k)) * Math.exp(-u);
    }

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
