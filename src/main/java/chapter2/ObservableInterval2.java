package chapter2;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

import java.util.concurrent.TimeUnit;

/**
 * note
 *
 * @author kon, created on 2021/12/15T14:41.
 * @version 1.0.0-SNAPSHOT
 */
public class ObservableInterval2 {

    /**
     * println:
     * Observer 1 : 0
     * Observer 1 : 1
     * Observer 1 : 2
     * Observer 1 : 3
     * Observer 2 : 3
     * Observer 1 : 4
     * Observer 2 : 4
     * Observer 1 : 5
     * Observer 2 : 5
     * @param args args
     */
    public static void main(String[] args) {
        ConnectableObservable<Long> publish = Observable.interval(1, TimeUnit.SECONDS).publish();
        publish.subscribe(l -> System.out.println("Observer 1 : " + l));
        publish.connect();
        sleep(3000);
        publish.subscribe(l -> System.out.println("Observer 2 : " + l));
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
