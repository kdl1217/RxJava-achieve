package chapter2;

import io.reactivex.rxjava3.core.Observable;

/**
 * note
 *
 * @author kon, created on 2021/12/15T09:23.
 * @version 1.0.0-SNAPSHOT
 */
public class Practice1 {

    public static void main(String[] args) {
        Observable<String> source = Observable.create(emitter -> {
            emitter.onNext("Alpha");
            emitter.onNext("Beta");
            emitter.onNext("Gamma");
            emitter.onComplete();
        });

        source.subscribe(s -> System.out.println("RECEIVED:" + s));
    }
}
