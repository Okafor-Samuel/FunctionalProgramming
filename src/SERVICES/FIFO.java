package SERVICES;

import ENTITY.Product;
import FILEIO.StoreFile;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class FIFO implements Sales{
    public static Queue<Product> queue = new LinkedList<>();

    @Override
    public void sales() throws Exception{
        try {
            StoreFile.readFile()
                    .stream()
                    .forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
