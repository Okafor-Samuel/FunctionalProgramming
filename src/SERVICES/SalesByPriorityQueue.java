package SERVICES;

import ENTITY.Product;
import FILEIO.StoreFile;

import java.io.IOException;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SalesByPriorityQueue implements Sales{
    public PriorityQueue<Product> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
    @Override
    public void sales() throws Exception {
        try {
            for (Product product: StoreFile.readFile()){
                priorityQueue.add(product);
            }
            while ( !priorityQueue.isEmpty()){
                System.out.println(priorityQueue.poll().toString());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
