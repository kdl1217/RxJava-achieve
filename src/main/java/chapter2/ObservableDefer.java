package chapter2;

import io.reactivex.rxjava3.core.Observable;

/**
 * note
 *
 * @author kon, created on 2021/12/15T16:41.
 * @version 1.0.0-SNAPSHOT
 */
public class ObservableDefer {

    private static int start = 1;

    private static int count = 3;

    /**
     * println:
     *
     * Observer 1: 1
     * Observer 1: 2
     * Observer 1: 3
     * Observer 2: 1
     * Observer 2: 2
     * Observer 2: 3
     * Observer 2: 4
     * Observer 2: 5
     *
     * @param args
     */
    public static void main(String[] args) {
        Observable<Integer> defer = Observable.defer(() -> Observable.range(start, count));
        defer.subscribe(i -> System.out.println("Observer 1: " + i));
        count = 5;
        defer.subscribe(i -> System.out.println("Observer 2: " + i));
    }

}
