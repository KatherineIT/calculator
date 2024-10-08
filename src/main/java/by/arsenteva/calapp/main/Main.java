package by.arsenteva.calapp.main;


import by.arsenteva.calapp.service.ResultWriterService;
import by.arsenteva.calapp.util.Calculator;

public class Main{
    public static void main(String[] args){
       int num1 = 6;
       int num2 = 5;
       int res1 = Calculator.sum(num1, num2);
       int res2 = Calculator.subtraction(num1, num2);
       int res3 = Calculator.multiplication(num1, num2);
       ResultWriterService.printNumber(num1, num2);
       ResultWriterService.printResult("Сложение ", num1, num2, res1);
       ResultWriterService.printResult("Вычитание ", num1, num2, res2);
       ResultWriterService.printResult("Умножение ", num1, num2, res3);
    }
}