import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.classifiers.functions.LinearRegression;

import java.util.Scanner;

public class multipleWithWEKA {
    public static void main(String args[]) throws Exception{
        //Load Data set
        DataSource source = new DataSource("C:\\Users\\User\\Desktop\\Real-estate.arff");
        Instances dataset = source.getDataSet();
        //set class index to the last attribute
        dataset.setClassIndex(dataset.numAttributes()-1);
        //Build model
        LinearRegression model = new LinearRegression();
        model.buildClassifier(dataset); //Builds a regression model for the given data.
        //output model
        System.out.println("Linear Regression Formula: "+model);

        // Now Predicting the cost
        Instance myHouse = dataset.firstInstance();
        double price = model.classifyInstance(myHouse);
        System.out.println("PREDICTING THE PRICE : "+price);

    }
}
