package chapter2;

import io.reactivex.rxjava3.core.Observable;

/**
 * note
 *
 * @author kon, created on 2021/12/15T15:58.
 * @version 1.0.0-SNAPSHOT
 */
public class ObservableError {

    /**
     * println:
     *  Error captured: java.lang.Exception: Crash and burn!!!
     *
     *  error 错误后，不会打印完成日志。
     * @param args args
     */
    public static void main(String[] args) {
//        Observable.error(new Exception("Crash and burn!!!")).subscribe(
//                i -> System.out.println("RECEIVED : " + i),
//                e -> System.out.println("Error captured: " + e),
//                () -> System.out.println("Done."));

        Observable.error(() -> new Exception("Crash and burn!!!")).subscribe(
                i -> System.out.println("RECEIVED : " + i),
                e -> System.out.println("Error captured: " + e),
                () -> System.out.println("Done."));
    }
}
