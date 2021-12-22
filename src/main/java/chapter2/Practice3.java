package chapter2;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;

/**
 * note
 *
 * @author kon, created on 2021/12/15T09:41.
 * @version 1.0.0-SNAPSHOT
 */
public class Practice3 {

    public static void main(String[] args) {
        Observable<String> source = Observable.create(emitter -> {
            emitter.onNext("Alpha");
            emitter.onNext("Beta");
            emitter.onNext("Gamma");
            emitter.onComplete();
        });
//        Observable<Integer> lengths = source.map(String::length);
//        Observable<Integer> filter = lengths.filter(i -> i >= 5);
//        Disposable subscribe = filter.subscribe(s -> System.out.println("RECEIVED: " + s));
//        System.out.println(subscribe.isDisposed());
        source.map(String::length).filter(i -> i >= 5).subscribe(s -> System.out.println(s));
    }


}
