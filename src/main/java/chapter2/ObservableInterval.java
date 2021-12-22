package chapter2;

import io.reactivex.rxjava3.core.Observable;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/**
 * note
 *
 * @author kon, created on 2021/12/15T14:13.
 * @version 1.0.0-SNAPSHOT
 */
public class ObservableInterval {

    public static void main(String[] args) {
        Observable<Long> interval = Observable.interval(1, TimeUnit.SECONDS);

        interval.subscribe(s -> System.out.println(LocalDateTime.now().getSecond() + " [1] " + s + " Mississippi"));

        sleep(3000);

        interval.subscribe(s -> System.out.println(LocalDateTime.now().getSecond() + " [2] " + s + " Mississippi"));

        sleep(3000);
    }

    private static void sleep(long millis) {
        try {
            TimeUnit.MILLISECONDS.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
