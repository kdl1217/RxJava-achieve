package chapter1;

import io.reactivex.rxjava3.core.Observable;

/**
 * note
 *
 * @author kon, created on 2021/12/13T17:30.
 * @version 1.0.0-SNAPSHOT
 */
public class Practice2 {

    public static void main(String[] args) {
        Observable<String> myStrings = Observable.just("Alpha", "Beta", "Gamma");
        myStrings.map(s -> s.length()).subscribe(s -> System.out.println(s));
    }
}
