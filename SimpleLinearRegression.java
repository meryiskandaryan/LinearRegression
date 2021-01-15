import java.util.Scanner;

public class SimpleLinearRegression {
    protected static Double[] x;
    protected Double[] y;
    protected Double alpha;
    protected int beta;

    public SimpleLinearRegression(Double[] x, Double[] y) {
        this.x = x;
        this.y = y;
    }

    public void alphabeta(Double[] x, Double[] y) {
        this.x = x;
        this.y = y;
    }

    public static double mean(Double[] x) {
        double sum = 0;
        for (double i : x) {
            sum += i;
        }
        return sum / x.length;
    }

    public int get_beta() {
        int beta_numerator = 0;
        int beta_denominator = 0;

        for (int i = 0, j = 0; i < x.length && j < y.length; i++, j++) {
            beta_numerator += (x[i] - mean(x)) * (y[j] - mean(y));
            beta_denominator += Math.pow((x[i] - mean(x)), 2);
            beta = beta_numerator / beta_denominator;

        }

        return beta;
    }

    protected Double get_alpha() {
        alpha = mean(y) - get_beta() * mean(x);
        return alpha;
    }

    public void print_results() {
        System.out.println("The alpha is " + get_alpha() + "The Beta zero is " + get_beta()+
                "\nFor entered data, the regression equation for Y is:\ny=" + get_beta() + "x + " + get_alpha());
    }

    public void prediction(){
        System.out.println("Please enter the x you want to the the prediction on:");
        Scanner input = new Scanner(System.in);
        double x_new = input.nextDouble();
        double y_pred = get_alpha()+get_beta()*x_new;
        System.out.println("The predicted price is: "+y_pred);
    }

    public Double r(){
        Reader a = new Reader("Real estate.csv");
        int n = a.length(a.columns());
        Double numerator = 0.;
        Double x_sums =0.;
        Double y_sums =0.;
        Double x_y = 0.;
        for (int i = 0, j = 0; i < x.length && j < y.length; i++, j++) {
            x_y += (x[i]  * y[j] );
        }
        for (int j=0;j<x.length;j++){
            x_sums += x[j];
        }
        for (int i =0;i<y.length;i++){
            y_sums+=y[i];
        }
        numerator = n* x_y - x_sums*y_sums;
        Double denominator = 0.;
        Double x_square=0.;
        for (int i=0;i<x.length;i++){
            x_square += Math.pow(x[i],2);
        }
        Double y_square=0.;
        for (int i=0;i<y.length;i++){
            y_square += Math.pow(x[i],2);
        }
        denominator = Math.sqrt((n*x_square - Math.pow(x_sums,2))*(n*y_square-Math.pow(y_sums,2)));
        return numerator/denominator;
    }

}






