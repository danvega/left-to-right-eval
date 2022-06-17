package dev.danvega;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String args[]){
        int result = 0;
        String equation = "1234567+5*2-5";
        List<String> operands;
        List<String> operators;

        operands = new ArrayList<>(Arrays.asList(equation.split("\\+|\\*|\\-|\\/")));
        operators = new ArrayList<>(Arrays.stream(equation.split("\\d+")).filter(s -> !s.isBlank()).toList());

        if(operands.size() < 2) {
            throw new IllegalArgumentException("Invalid equation: Please supply at least 2 operands");
        }

        while (!operators.isEmpty()) {
            // 3 + 5 calculate
            result = calculate(Integer.parseInt(operands.get(0)),Integer.parseInt(operands.get(1)),operators.get(0));
            operators.remove(0);
            operands.remove(1);
            operands.remove(0);
            operands.add(0,String.valueOf(result));
        }

        System.out.println("Final Result is: " + result);
    }

    static int calculate(int left, int right, String operator) {
        return switch(operator) {
            case "+" -> left + right;
            case "-" -> left - right;
            case "*" -> left * right;
            case "/" -> left / right;
            default -> 0;
        };
    }

}
