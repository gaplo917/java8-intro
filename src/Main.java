import lambda.HighOrderFunctionExample;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("result:" + HighOrderFunctionExample.func.apply(2));

        HighOrderFunctionExample.funcWithLogging.apply(2);

    }
}
