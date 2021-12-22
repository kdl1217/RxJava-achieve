package chapter2;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;

/**
 * note
 *
 * @author kon, created on 2021/12/15T13:55.
 * @version 1.0.0-SNAPSHOT
 */
public class Practice9 {

    public static void main(String[] args) {
        ConnectableObservable<String> publish = Observable.just("Alpha", "Beta", "Gamma").publish();

        publish.subscribe(s -> System.out.println("Observer : " + s));
        publish.map(String::length).subscribe(s -> System.out.println("Observer : " + s));

        publish.connect();
    }
}
