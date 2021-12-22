package chapter2;

import io.reactivex.rxjava3.core.Observable;

/**
 * note
 *
 * @author kon, created on 2021/12/15T09:34.
 * @version 1.0.0-SNAPSHOT
 */
public class Practice2 {

    public static void main(String[] args) {
        Observable<String> source = Observable.create(emitter -> {
            try {
                emitter.onNext("Alpha");
                emitter.onNext("Beta");
                emitter.onNext("Gamma");
//                int s = 1/0;
                emitter.onComplete();
            } catch (Exception e) {
                emitter.onError(e);
            }
        });

        source.subscribe(s -> System.out.println("RECEIVED: " + s), throwable -> throwable.printStackTrace());
    }
}
