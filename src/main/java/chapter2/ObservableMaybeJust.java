package chapter2;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;

/**
 * note
 *
 * @author kon, created on 2021/12/15T17:18.
 * @version 1.0.0-SNAPSHOT
 */
public class ObservableMaybeJust {

    public static void main(String[] args) {
        Observable<String> just = Observable.just("Alpha", "Beta");
        // 转换成 maybe.
        Maybe<String> stringMaybe = just.firstElement();

        stringMaybe.subscribe(s -> System.out.println("RECEIVED: " + s),
                e -> System.out.println("Error captured: " + e),
                () -> System.out.println("Done."));
    }
}
