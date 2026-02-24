import java.io.*;

public class Main{
    public static void main(String[] args) {
        System.out.println("test1");
        task1();
        System.out.println("test2");
        task2();
        System.out.println("test3");
        task3();

    }

    public static void task1() {
        int a = 5;
        int b = 2;
        int sum = (a/b) + (a%b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(sum);
    }
    public static void task2(){
        int a = 45;
        int b = 10;
        int sum = (a/b) + (a%b);
        System.out.println(a/b);
        System.out.println(a%b);
        System.out.println(sum);

    }
    public static void task3(){
        double num1 = 7.983;
        double num2 = 15.411;
        double sum = Math.round(num1)/num2*Math.round(num2);
        System.out.println(Math.round(Math.round(num1)));
        System.out.println(Math.round(Math.round(num2)));
        System.out.println(Math.round(sum));

    }


}