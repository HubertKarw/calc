package com.company;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Opertation> operations = new ArrayList<Opertation>();

    public Calculator() {
    }

    public void populate(Opertation op){
        if((op.instruction.toLowerCase().equals("apply"))){
            operations.add(0,op);
        }else{
            operations.add(op);
        }
    }
    public int calculate(){
        int value = 0;
        for (Opertation op : operations) {
            value = op.equation(value);
//            System.out.println(value);
        }
        return value;
    }
}
