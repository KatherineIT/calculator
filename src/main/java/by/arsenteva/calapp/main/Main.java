package by.arsenteva.calapp.main;


import by.arsenteva.calapp.service.ResultWriterService;
import by.arsenteva.calapp.util.Calculator;

public class Main {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 5;
        ResultWriterService.printNumber(num1, num2);

        int res = Calculator.sum(num1, num2);
        ResultWriterService.printResult("Сложение ", num1, num2, res);

        res = Calculator.subtraction(num1, num2);
        ResultWriterService.printResult("Вычитание ", num1, num2, res);

        res = Calculator.multiplication(num1, num2);
        ResultWriterService.printResult("Умножение ", num1, num2, res);
    }
}