package chapter1;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

/**
 * note
 *
 * @author kon, created on 2021/12/13T17:37.
 * @version 1.0.0-SNAPSHOT
 */
public class Practice3 {

    /**
     * Result
     * 0
     * 1
     * 2
     * 3
     * 4
     * @param args args
     */
    public static void main(String[] args) {
        Observable<Long> secondIntervals = Observable.interval(1, TimeUnit.SECONDS);
        secondIntervals.subscribe(s -> System.out.println(s));
        sleep(5000);
    }

    private static void sleep(long millis) {
        try {
            TimeUnit.MILLISECONDS.sleep(millis);
            System.out.println("sleep" + millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
