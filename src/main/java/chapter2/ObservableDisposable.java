package chapter2;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import util.SleepUtil;

import java.util.concurrent.TimeUnit;

/**
 * note
 *
 * @author kon, created on 2021/12/15T17:39.
 * @version 1.0.0-SNAPSHOT
 */
public class ObservableDisposable {

    /**
     * println:
     *
     * Received: 0
     * Received: 1
     * Received: 2
     * Received: 3
     * sleep1 end.
     * Received: 4
     * End.
     *
     * @param args args
     */
    public static void main(String[] args) {
        Observable<Long> interval = Observable.interval(1, TimeUnit.SECONDS);

        Disposable disposable = interval.subscribe(l -> System.out.println("Received: " + l));

        SleepUtil.sleep(5000);
        System.out.println("sleep1 end.");

        // 停止
        disposable.dispose();

        SleepUtil.sleep(5000);
        System.out.println("End.");
    }
}
