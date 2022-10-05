package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileReader {
    String fileName;
    Boolean hasApply = false;

    public FileReader(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        Calculator calculator = new Calculator();

        while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                if(data.isEmpty()) {
//                    System.out.println("Empty Line");
                }else if(!data.contains(" ")) {
//                    System.out.println("Wrong Format");
                }else if(data.contains("apply")){
                    hasApply = Boolean.TRUE;
                    String[] object = data.split(" ");
                    Opertation op = new Opertation();
                    op.instruction = object[0];
                    op.number = Integer.parseInt(object[1]);
                    calculator.populate(op);
                    break;
                }else{
                    String[] object = data.split(" ");
                    Opertation op = new Opertation();
                    op.instruction = object[0];
                    op.number = Integer.parseInt(object[1]);
                    calculator.populate(op);
//                System.out.println(object[1]);
//                System.out.println(op.instruction);
                }

//            System.out.println(data);

        }
//        System.out.println(calculator.operations.toString());
        System.out.println(calculator.calculate());

    }
}
