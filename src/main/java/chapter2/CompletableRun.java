package chapter2;

import io.reactivex.rxjava3.core.Completable;
import util.SleepUtil;

/**
 * note
 *
 * @author kon, created on 2021/12/15T17:23.
 * @version 1.0.0-SNAPSHOT
 */
public class CompletableRun {

    /**
     * println:
     *
     * running...
     * Done.
     * END.
     *
     * 非异步执行
     * @param args
     */
    public static void main(String[] args) {
        Completable.fromRunnable(() -> runProcess()).subscribe(() -> System.out.println("Done."));

        System.out.println("END.");
    }

    private static void runProcess() {
        SleepUtil.sleep(3000);
        // run process here
        System.out.println("running...");
    }
}
