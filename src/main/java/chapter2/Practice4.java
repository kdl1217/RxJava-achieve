package chapter2;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.List;

/**
 * note
 *
 * @author kon, created on 2021/12/15T09:50.
 * @version 1.0.0-SNAPSHOT
 */
public class Practice4 {

    public static void main(String[] args) {
//        Observable<String> source = Observable.just("Alpha", "Beta", "Gamma");
        List<String> items = Arrays.asList("Alpha", "Beta", "Gamma");
        Observable<String> source = Observable.fromIterable(items);
        source.map(String::length).filter(i -> i >= 5).subscribe(s -> System.out.println(s));
    }
}
