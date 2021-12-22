package chapter2;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

/**
 * note
 *
 * @author kon, created on 2021/12/15T10:04.
 * @version 1.0.0-SNAPSHOT
 */
public class Practice5 {

    public static void main(String[] args) {
        Observable<String> source = Observable.just("Alpha", "Beta", "Gamma");
        Observer<Integer> myObserver = new Observer<Integer>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                // do nothing with Disposable, disregard for now
            }

            @Override
            public void onNext(@NonNull Integer s) {
                System.out.println("Received : " + s);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                e.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("Done.");
            }
        };

        source.map(s -> s.length()).filter(i -> i >= 5).subscribe(myObserver);
    }
}
