package chapter2;

import io.reactivex.rxjava3.core.Observable;
import util.SleepUtil;

/**
 * note
 *
 * @author kon, created on 2021/12/15T15:14.
 * @version 1.0.0-SNAPSHOT
 */
public class ObservableNever {

    public static void main(String[] args) {
        Observable<Object> never = Observable.never();
        never.subscribe(s -> System.out.println(s), throwable -> throwable.printStackTrace(), () -> System.out.println("Done."));

        SleepUtil.sleep(3000);
    }

}
