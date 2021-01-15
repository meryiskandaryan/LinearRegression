public class driver {
    public static void main(String[] args) {
        Reader b = new Reader("Real estate.csv");
        DescStat a = new DescStat((Double[]) b.to_Array(b.columns())[0]);
        SimpleLinearRegression c = new SimpleLinearRegression(((Double[]) b.to_Array(b.columns())[2]),((Double[]) b.to_Array(b.columns())[3]));
        //c.prediction();
        //c.print_results();
        //System.out.println(a.mean());
        //Sorting d = new Sorting((Double[]) b.to_Array(b.columns())[3]);
        //System.out.println(d.Select_sort_asc((Double[]) b.to_Array(b.columns())[3]));
        System.out.println(c.r());;
    }
}
