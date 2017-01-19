package Java_fund_second_couse.DataTipesAndVariables;

import java.math.BigDecimal;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double r = Double.parseDouble(console.nextLine());
        BigDecimal radius =BigDecimal.valueOf(Math.PI * r * r);
        System.out.printf("%.12f",radius);
    }
}
