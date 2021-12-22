package chapter1;


import io.reactivex.rxjava3.core.Observable;

/**
 * 练习1
 *
 * @author kon, created on 2021/12/13T17:20.
 * @version 1.0.0-SNAPSHOT
 */
public class Practice1 {

    public static void main(String[] args) {

        Observable<String> myStrings = Observable.just("Alpha", "Beta", "Gamma");

        myStrings.subscribe(s -> System.out.println(s));
    }
}
