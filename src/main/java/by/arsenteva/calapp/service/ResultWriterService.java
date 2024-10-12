package by.arsenteva.calapp.service;

public class ResultWriterService {
    public static void printNumber(int num1, int num2) {
        System.out.println("Число первое: " + num1);
        System.out.println("Число второе: " + num2);
    }

    public static void printResult(String operation, int num1, int num2, int result) {
        System.out.println(operation + num1 + " и " + num2 + " равно " + result);
    }
}
