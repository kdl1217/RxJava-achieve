package chapter2;

import io.reactivex.rxjava3.core.Observable;

/**
 * note
 *
 * @author kon, created on 2021/12/15T10:21.
 * @version 1.0.0-SNAPSHOT
 */
public class Practice7 {

    public static void main(String[] args) {
        Observable<String> source = Observable.just("Alpha", "Beta", "Gamma");

        source.subscribe(s -> System.out.println("RECEIVED1 : " + s));
//        source.subscribe(s -> System.out.println("RECEIVED2 : " + s));
        source.map(s -> s.length()).filter(i -> i >= 5).subscribe(s -> System.out.println("RECEIVED2 : " + s));
    }
}
