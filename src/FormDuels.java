import java.util.function.Function;

public class FormDuels {

    public static void main(String[] args) {
        System.out.println("For 4 players, we can have " + count(4) + " pairs");
        System.out.println("For 8 players, we can have " + count(8) + " pairs");
        System.out.println("For 10000 players, we can have " + count(10_000) + " pairs");

        System.out.println("Calculating number of pairs for 4 players is done in : " + measurePerf(FormDuels::count, 4) + "ms");
        System.out.println("Calculating number of pairs for 10000 players is done in : " + measurePerf(FormDuels::count, 10_000) + "ms");
    }

    /**
     * Counts the number of pairs for n players.
     * Relation nC2 ==> fact(n) / [ fact(2) * fact(n-2) ]
     */
    public static int count(int n) {
        //return fact(n)/(2*fact(n-2));
        return (n*(n-1))/2;
    }

    public static long measurePerf(Function<Integer, Integer> adder, int n){
        long fastest = Long.MAX_VALUE;
        for(int i = 0; i < 10; i++){
            long start = System.nanoTime();
            int sum = adder.apply(n);
            long duration = (System.nanoTime() - start) / 1_000_000;
            //System.out.println("Result : " + sum);
            if(duration < fastest)
                fastest = duration;
        }
        return fastest;
    }
}
