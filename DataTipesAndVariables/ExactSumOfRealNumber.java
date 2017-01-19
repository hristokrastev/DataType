package Java_fund_second_couse.DataTipesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        float n = Float.parseFloat(console.nextLine());

       BigDecimal n1 = BigDecimal.valueOf(1.0d);
        for (int i = 1; i <= n; i++) {
            n1 += Double.parseDouble(console.nextLine());

        }
        System.out.println(n1);

    }
}
