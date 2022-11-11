package module13;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Solution {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        Future<Integer> s = (Future<Integer>) ex.submit(new MyThread());
        Future<Integer> s1 = (Future<Integer>) ex.submit(new MyThread());
        try {
            System.out.println("а я уже здесь");
            System.out.println(s.get());
            System.out.println(s1.get());
        } catch (InterruptedException e) {	e.printStackTrace();
        } catch (ExecutionException e) {e.printStackTrace();	}
    }
}