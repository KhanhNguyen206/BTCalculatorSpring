package com.codegym.model;

public class Calculator {
    Integer firstOperand;
    Integer secondOperand;
    String operator;

    public Calculator(Integer firstOperand, Integer secondOperand, String operator) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operator = operator;
    }

    public Calculator() {
    }

    public Integer getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(Integer firstOperand) {
        this.firstOperand = firstOperand;
    }

    public Integer getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(Integer secondOperand) {
        this.secondOperand = secondOperand;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    public Integer calculate(){
        switch (operator){
            case "+":
                return firstOperand+secondOperand;
            case "-":
                return firstOperand-secondOperand;
            case "*":
                return firstOperand*secondOperand;
            case "/":
                return firstOperand/secondOperand;
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}

