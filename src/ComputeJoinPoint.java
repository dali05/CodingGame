public class ComputeJoinPoint {

    public static void main(String[] args) {

        System.out.println(computeJoinPoint(471, 480));
    }

    public static int computeJoinPoint(int s1, int s2){
        if(s1 == 0 || s2 == 0 || s1 == 20_000_000 || s2 == 20_000_000){
            return 0;
        }

        while(s1 != s2){
            if(s1 < s2){
                s1 = computeSommePoint(s1);
            }else{
                s2 = computeSommePoint(s2);
            }
        }
        return s1;
    }

    public static int computeSommePoint(int s){
        int somme = s;
       for(char c :  String.valueOf(s).toCharArray()){
           somme += Character.getNumericValue(c);
       }

       return somme;
    }

}
