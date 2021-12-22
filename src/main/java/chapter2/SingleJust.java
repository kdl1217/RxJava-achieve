package chapter2;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/**
 * note
 *
 * @author kon, created on 2021/12/15T16:51.
 * @version 1.0.0-SNAPSHOT
 */
public class SingleJust {

    public static void main(String[] args) {
//        Single.just("Hello!").map(String::length).subscribe(s -> System.out.println(s), e -> System.out.println("Error captured: " + e));

        Observable<String> just = Observable.just("Alpha", "Beta");
        Single<String> nil = just.first("Nil");
        nil.subscribe(s -> System.out.println(s), e -> System.out.println("Error captured: " + e));
    }

}
