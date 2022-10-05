package com.company;

public class Opertation {

    String instruction;
    int number;

    public Opertation() {
    }

    public Opertation(String instruction, int number){
        this.instruction = instruction;
        this.number = number;
    }
    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int equation(int number) {
        try {
            int another_number = this.number;
            if (this.instruction.toLowerCase().equals("add")) {
                number = number + another_number;
//                System.out.println("add");
            } else if (this.instruction.toLowerCase().equals("multiply")){
                number = number * another_number;
//                System.out.println("mul");
            } else if (this.instruction.toLowerCase().equals("divide")) {
                number = number / another_number;
//                System.out.println("div");
            } else if (this.instruction.toLowerCase().equals("subtract")){
                number = number - another_number;
            } else if (this.instruction.toLowerCase().contains("apply")) {
//                System.out.println(number);
//                System.out.println("apply");
                number = another_number;
            }else{
                WrongInstructionException ex = new WrongInstructionException("Wrong Instruction");
                System.out.println(ex);
            }
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }catch (ArithmeticException ex){
            System.out.println(ex);
        }
    return number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Opertation{");
        sb.append("instruction='").append(instruction).append('\'');
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}
class WrongInstructionException extends Exception{
    public WrongInstructionException(String exception){
        super(exception);
    }
}