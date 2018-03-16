import counter.ConsoleView;
import counter.Counter;

import java.util.Scanner;

public class ObserverTest {
    public static void main(String[] args) {
        final Scanner console = new Scanner(System.in);
        Counter counter = new Counter();
        ConsoleView view = new ConsoleView(counter);
        counter.addObserver(view);

        while (true){
            System.out.println("Count how many? ");
            int howmany = console.nextInt();
            if(howmany==0) System.exit(0);
            counter.add(howmany);
        }
    }
}
