package is.vidmot;

import javafx.collections.ObservableList;

public interface ListObserver<T> {
    void onListChanged(ObservableList<T> list);
}

