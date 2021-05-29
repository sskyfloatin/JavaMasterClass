package LambdaAndExpressions;

public class Main {



    public static void main(String[] args) {
        new Thread(new CodeToRun()).start();
        new Thread(() -> System.out.println("Print from the runnable.")).start();
    }
}

class CodeToRun implements Runnable {

    @Override
    public void run() {
        System.out.println("Printing from the runnable");
    }
}
