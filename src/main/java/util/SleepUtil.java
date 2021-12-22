package util;

import java.util.concurrent.TimeUnit;

/**
 * note
 *
 * @author kon, created on 2021/12/15T15:26.
 * @version 1.0.0-SNAPSHOT
 */
public final class SleepUtil {

    public static void sleep(long millis) {
        try {
            TimeUnit.MILLISECONDS.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
