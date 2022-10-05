package com.company;
import com.company.FileReader;
import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(args.length);
        if (args.length>0) {
            String filename = args[0];
            FileReader file = new FileReader(filename);
        }//"C:\\Users\\huber\\Desktop\\calculator\\src\\com\\company\\txt"
    }
}
