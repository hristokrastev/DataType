    package Java_fund_second_couse.DataTipesAndVariables;

    import java.util.DoubleSummaryStatistics;
    import java.util.Scanner;

    public class Timeline {
        public static void main(String[] args) {
            System.out.print("Centuries = ");
            Scanner console = new Scanner(System.in);




            int centuries = Integer.parseInt(console.nextLine());
            int years = centuries * 100;
            int days = (int)(years * 365.2422);
            int hours = days * 24;
            int minutes = hours * 60;

            System.out.print(centuries + " Centuries = ");
            System.out.print(years + " Years = ");
            System.out.print( days + " Days = ");
            System.out.print(hours + " Hours = " );
            System.out.print(minutes + " Minutes" );
            System.out.println();

        }
    }
