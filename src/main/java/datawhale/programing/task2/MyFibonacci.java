package datawhale.programing.task2;

public class MyFibonacci {
    public MyFibonacci() {

    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        MyFibonacci myFibonacci = new MyFibonacci();
        int result = myFibonacci.fibonacci(6);
        System.out.println("result = " + result);
    }
}
