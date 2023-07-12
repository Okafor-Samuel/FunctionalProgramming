package FILEIO;

import ENTITY.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StoreFile {
    public static ArrayList<Product> readFile () throws IOException {
        String filePath = "/Users/decagon/Downloads/FunctionalPrograming-Week4/src/FILEIO/ProducList.csv";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        ArrayList<Product> productList = new ArrayList<>();
        String line;
        bufferedReader.readLine();
        while ((line = bufferedReader.readLine()) != null) {
            String str[] = line.split(",");

            Product product1 = new Product();
            product1.setUnit(Integer.parseInt(str[0]));
            product1.setDescription(str[1]);
            product1.setUnitPrice(Double.parseDouble(str[2]));
            product1.setAmount(Double.parseDouble(str[3]));
            productList.add(product1);
        }

        return productList;
    }
    public static void main(String[] args) {

    }

}
