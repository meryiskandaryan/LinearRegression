import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

class Reader {

    String file_name;
    public Reader(String file_name) {
        this.file_name=file_name;
    }

    public LinkedList[] columns() {
       // String fileName = "Real estate.csv";
        double[] my_array;
        LinkedList house_age = new LinkedList();
        LinkedList distance_MRT = new LinkedList();
        LinkedList stores = new LinkedList();
        LinkedList price = new LinkedList();
        Scanner input = null;
        File file = new File(this.file_name);
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (input.hasNext()) {
            String data = input.next();//gets a whole line
            String[] values = data.split(",");
            house_age.add(Double.parseDouble(values[0]));
            distance_MRT.add(Double.parseDouble(values[1]));
            stores.add(Double.parseDouble(values[2]));
            price.add(Double.parseDouble(values[3]));
        }
        LinkedList[] a = new LinkedList[4];
        a[0] = house_age;
        a[1] = distance_MRT;
        a[2] = stores;
        a[3] = price;
        input.close();
        return a;
    }
    //method to calculate data's rows
    public int length(LinkedList[] arr) {

        return arr[0].toArray().length;
    }

    public Object[] to_Array(LinkedList[] arr) {
        int arr_length = arr.length;
        int arr_length2 = length(arr);
        Double[][] arrs = new Double[arr_length][arr_length2];
        for (int i = 0; i < arr_length; i++) {
            for (int j = 0; j < arr_length2;j++) {
                arrs[i][j] = (Double) arr[i].toArray()[j];
            }
        }
        return arrs;
    }
}
        