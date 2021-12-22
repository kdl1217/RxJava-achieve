package chapter2;

import io.reactivex.rxjava3.core.Observable;

/**
 * note
 *
 * @author kon, created on 2021/12/15T14:03.
 * @version 1.0.0-SNAPSHOT
 */
public class Practice10 {

    public static void main(String[] args) {
        // 初始化一个 从1开始，依次累加1，长度为10的数组
//        Observable.range(1, 10).subscribe(s -> System.out.println(s));

        // 初始化一个 从3开始，依次累加1，长度为5的数组
        Observable.range(3, 5).subscribe(s -> System.out.println(s));
    }
}
