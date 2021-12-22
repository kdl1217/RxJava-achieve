package chapter2;

import io.reactivex.rxjava3.core.Observable;

/**
 * note
 *
 * @author kon, created on 2021/12/15T15:07.
 * @version 1.0.0-SNAPSHOT
 */
public class ObservableEmpty {

    public static void main(String[] args) {
        Observable<Object> empty = Observable.empty();
        empty.subscribe(s -> System.out.println(s), throwable -> throwable.printStackTrace(), () -> System.out.println("Done."));
    }

}
