import java.util.Arrays;

public class DescStat {
        public Double[] arr;

        public DescStat(Double[] arr){

            this.arr=arr;
        }
        //A method to calculate the Average
        public double mean(){
            double sums = 0;
            for(double i:this.arr){
                sums += i;
            }
            return sums/this.arr.length;
        }
        // Median
       /* public double median(){
            Arrays.sort(this.arr);
            if (this.arr.length/2 % 2 == 0){
                return (this.arr[Math.round(this.arr.length/2)-1] + this.arr[ Math.round(this.arr.length/2)])/2 ;
            }
            else {
                return this.arr[Math.round(this.arr.length/2)];
            }
        }*/
        // Standard deviation.
        public double std() {
            double sums = 0;
            for (double i : this.arr){
                sums += Math.pow(i - this.mean(),2);
            }
            return Math.sqrt(sums/(this.arr.length-1));
        }


}
