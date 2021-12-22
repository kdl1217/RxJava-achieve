package chapter2;


import io.reactivex.rxjava3.core.Maybe;

/**
 * note
 *
 * @author kon, created on 2021/12/15T17:07.
 * @version 1.0.0-SNAPSHOT
 */
public class MaybeJust {

    /**
     * println:
     *
     * Process 1 : 100
     * Process 2 done.
     *      与 Observable 不同，有数据在执行完成之后，不会执行 `OnComplete()` 方法。
     * @param args args
     */
    public static void main(String[] args) {

        Maybe<Integer> just = Maybe.just(100);
        just.subscribe(s -> System.out.println("Process 1 : " + s),
                e -> System.out.println("Error captured: " + e),
                () -> System.out.println("Process 1 done."));

        Maybe<Integer> empty = Maybe.empty();
        empty.subscribe(s -> System.out.println("Process 2 : " + s),
                e -> System.out.println("Error captured: " + e),
                () -> System.out.println("Process 2 done."));
    }

}
