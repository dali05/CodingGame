public class Pi {

    public static void main(String[] args) {

        double[][] rands = new double[1000000][2];
        for(int i = 0; i < rands.length; i++){
            rands [i][0] = Math.random();
            rands [i][1] = Math.random();
        }

        // 3.14159265358979323846
        System.out.println(approx(rands));

    }

    public static double approx(double[][] pts){
        double m = 0d;
        double pi;

        for(int i = 0; i < pts.length; i++){
            if( (pts[i][0]*pts[i][0]) + (pts[i][1]*pts[i][1]) <= 1 ){
                m = m + 1;
            }
        }
        pi = (m * 4) / pts.length;
        return pi;
    }
}
