package chapter2;

import io.reactivex.rxjava3.core.Observable;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * note
 *
 * @author kon, created on 2021/12/15T13:41.
 * @version 1.0.0-SNAPSHOT
 */
public class Practice8 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ToggleButton toggleButton = new ToggleButton("TOGGLE ME");
        Label label = new Label("Kon");
        Observable<Boolean> selectedStates = valuesOf(toggleButton.selectedProperty());
        selectedStates.map(selected -> selected ? "DOWN" : "UP").subscribe(label::setText);
        VBox vBox = new VBox(toggleButton, label);

        primaryStage.setScene(new Scene(vBox));
        primaryStage.show();
    }

    private static <T> Observable<T> valuesOf(final ObservableValue<T> fxObservable) {
        return Observable.create(emitter -> {
            emitter.onNext(fxObservable.getValue());

            final ChangeListener<T> listener =  ((observable, oldValue, newValue) -> emitter.onNext(newValue));
            fxObservable.addListener(listener);
        });
    }

}
