import java.math.BigDecimal;

public class CalculatorBigDecimal {

    public static void main(String[] args) {
        System.out.println(sum(99.35, 1.10));
        System.out.println(sum("99.35", "1.10"));
    }

    static String sum(Double... numbers){
        BigDecimal total = new BigDecimal(0);
        for(Double number : numbers){
            total = total.add(new BigDecimal(number));
        }
        return String.valueOf(total);
    }

    static String sum(String... numbers){
        BigDecimal total = new BigDecimal("0");
        for(String number : numbers){
            total = total.add(new BigDecimal(number));
        }
        return String.valueOf(total);
    }
}
