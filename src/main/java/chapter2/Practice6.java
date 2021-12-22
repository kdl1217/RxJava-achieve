package chapter2;

import io.reactivex.rxjava3.core.Observable;

/**
 * note
 *
 * @author kon, created on 2021/12/15T10:13.
 * @version 1.0.0-SNAPSHOT
 */
public class Practice6 {

    public static void main(String[] args) {
        Observable<String> source = Observable.just("Alpha", "Beta", "Gamma");
        source.map(String::length)
                .filter(i -> i >= 5)
                .subscribe(i -> System.out.println("RECEIVED :" + i),
                        throwable -> throwable.printStackTrace(),
                        () -> System.out.println("Done."));
    }
}
