public class ClosetToZero {

    public static void main(String[] args) {

        int[] dt1 = new int[]{7, 5, 9, 1, 4};
        System.out.println("Result [Data of test 1] = " + closestToZero(dt1));

        int[] dt2 = new int[]{-1, 5, 9, 1, 4};
        System.out.println("Result [Data of test 2] = " + closestToZero(dt2));

        int[] dt3 = new int[]{1, 5, 9, -1, 4};
        System.out.println("Result [Data of test 3] = " + closestToZero(dt3));

        int[] dt4 = new int[]{};
        System.out.println("Result [Data of test 4] = " + closestToZero(dt4));

        System.out.println("Result [Data of test 4] = " + closestToZero(null));
    }

    /** @return the number that is closest to zero */
    public static int closestToZero(int[] ints) {
        if( ints == null || ints.length == 0){
            return 0;
        }
        int closestToZero = ints[0];

        for( int i = 1; i < ints.length; i++ ){
            if( Math.abs(closestToZero) > Math.abs(ints[i]) ||
                    Math.abs(closestToZero) == ints[i]){
                closestToZero = ints[i];
            }
        }

        return closestToZero;
    }
}
