/*
 * Q
 * Today, stores are increasingly equipped with automated checkout machines. Most of
 * these machines accept payment only by credit card, despite the fact that a significant
 * portion of consumers continue to pay for goods with cash.
 *
 * One of the problems presented by cash transactions is how to return change: what is
 * the optimal way to give back a certain amount, with the minimum number of coins and
 * bills? It's an issue that each of us encounters on a daily basis and the problem is the
 * same for automated checkout machines.
 *
 * In this exercise, you are asked to try and find an optimal solution for returning change in
 * a very specific case: when the machine contains only €2 coins, €5 bills and €10 bills.
 *
 * To simplify the problem, we imagine that all of these coins and bills are available in
 * unlimited quantities.
 *
 * Here are some examples of how change may be returned:
 *
 * -> Change For €1:
 *       - Possible Solutions: -> Impossible
 *       - Optimal Solution:   -> Impossible
 * -> Change For €6:
 *       - Possible Solutions: -> €2 + €2 + €2
 *       - Optimal Solution:   -> €2 + €2 + €2
 * -> Change For €10:
 *       - Possible Solutions: -> €2 + €2 + €2 + €2 + €2
 *                             -> €5 + €5
 *                             -> €10
 *       - Optimal Solution:   -> €10
 * -> Change For €9223372036854775807:
 *       - Possible Solutions: -> ...
 *       - Optimal Solution:   -> (€10 * 922337203685477580)+ €5 + €2
 *
 * Change is represented as a "Change" object. This object has three properties "coin2", "bill5"
 * and "bill10" which represents the numbers of €2 coins, €5 bills and €10 bills
 *
 * For instance, when applied to example #2 of the table above(€6), we should get a
 * "Change" object with the following values:
 *
 *    -> "coin2" value is 3 (3 €2 coins)
 *    -> "bill5" value is 0 (no €5 bill)
 *    -> "bill10" value is 0 (no €10 bill)
 *
 *  Implement the "optimalChange(long s) method which returns a "Change" object. The sum of
 *  coins and bills indicated in the "Change" object must be "s". If it is not possible to give
 *  back change -as in example#1 -, the method must return "null".
 *
 *  To get a maximum number of points, your Solution should always provide a result-
 *  when possible- having the minimal number of bills and coins.
 *
 *  Constraints:
 *  "s" is a "long".
 *  0<s<=9223372036854775807
 * */

public class OptimalChange {

    public static void main(String[] args) {
        System.out.println("Optimal change of 4 is ==> " + optimalChange(4));
        System.out.println("Optimal change of 5 is ==> " + optimalChange(5));
        System.out.println("Optimal change of 6 is ==> " + optimalChange(6));
        System.out.println("Optimal change of 7 is ==> " + optimalChange(7));
        System.out.println("Optimal change of 8 is ==> " + optimalChange(8));
        System.out.println("Optimal change of 9 is ==> " + optimalChange(9));
        System.out.println("Optimal change of 10 is ==> " + optimalChange(10));
        System.out.println("Optimal change of 11 is ==> " + optimalChange(11));
        System.out.println("Optimal change of 12 is ==> " + optimalChange(12));
        System.out.println("Optimal change of 13 is ==> " + optimalChange(13));
        System.out.println("Optimal change of 14 is ==> " + optimalChange(14));
        System.out.println("Optimal change of 15 is ==> " + optimalChange(15));
        System.out.println("Optimal change of 16 is ==> " + optimalChange(16));
        System.out.println("Optimal change of 17 is ==> " + optimalChange(17));
        System.out.println("Optimal change of 18 is ==> " + optimalChange(18));
        System.out.println("Optimal change of 19 is ==> " + optimalChange(19));
        System.out.println("Optimal change of 20 is ==> " + optimalChange(20));
        System.out.println("Optimal change of 21 is ==> " + optimalChange(21));

        System.out.println("Optimal change of 21 is ==> " + optimalChange2(21));
    }

    public static Change optimalChange(long s){
        if( s == 1 || s == 3 ){
            return null;
        }

        Change change = new Change();

        long rest = s % 10;
        change.bill10 = s / 10;

        if( rest == 0 ){
            change.bill5 = 0;
            change.coin2 = 0;
        }
        else if(rest == 5){
            change.bill5 = 1;
            change.coin2 = 0;
        }
        else if( rest > 5 && (rest - 5) % 2 == 0 ){
            change.bill5 = 1;
            change.coin2 = (rest - 5) / 2;
        }
        else if(rest % 2 == 0){
            change.bill5 = 0;
            change.coin2 = rest / 2;
        }
        else{
            change.bill10 --;
            rest = rest + 10;
            if( rest % 2 == 1 ){
                change.bill5 = 1;
                change.coin2 = (rest - 5) / 2;
            }else{
                change.bill5 = 0;
                change.coin2 = rest / 2;
            }
        }

        return change;
    }

    static Change optimalChange2(long s) {

        long remaining = 0;
        long NbrOfBill10 = 0;
        long NbrOfBill5 = 0;
        long NbrOfCoin2 = 0;

        NbrOfBill10 = s / 10;
        remaining = s % 10;

        NbrOfBill5 = remaining / 5;
        remaining = remaining % 5;

        if (remaining < 2) {
            remaining = (NbrOfBill5 * 5) + 1;
        } else {
            NbrOfCoin2 = remaining / 2;
            remaining = remaining % 2;
        }

        // return null if change cannot be rendered
        if (remaining != 0)
            return null;

        Change change = new Change();
        change.coin2 = NbrOfCoin2;
        change.bill5 = NbrOfBill5;
        change.bill10 = NbrOfBill10;
        return change;
    }
}
