/*
package is.vidmot;

import is.vidmot.EiturSnakur;
import is.vidmot.Faeda;
import is.vidmot.ListObserver;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import org.junit.Test;

import static javax.management.Query.times;
import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.verify;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ObserverTest {

    @Test
    public void testObserverPattern() {
        // Create the observed lists
        ObservableList<Faeda> matur = FXCollections.observableArrayList();
        ObservableList<EiturSnakur> eiturSnakar = FXCollections.observableArrayList();

        // Create a mock observer object
        ListObserver mockObserver = mock(ListObserver.class);

        // Register the observer with the observed lists
        matur.addListener((ListChangeListener<Faeda>) change -> mockObserver.onListChanged(matur));
        eiturSnakar.addListener((ListChangeListener<EiturSnakur>) change -> mockObserver.onListChanged(eiturSnakar));

        // Add an item to the matur list
        matur.add(new Faeda("item1"));

        // Verify that the observer was notified with the updated matur list
        verify(mockObserver).onListChanged(matur);

        // Add an item to the eiturSnakar list
        eiturSnakar.add(new EiturSnakur("item2"));

        // Verify that the observer was notified with the updated eiturSnakar list
        verify(mockObserver).onListChanged(eiturSnakar);

        // Remove an item from the matur list
        matur.remove(0);

        // Verify that the observer was notified with the updated matur list
        verify(mockObserver, times(2)).onListChanged(matur);

        // Test that the matur list and eiturSnakar list contain the expected items
        assertEquals(0, matur.size());
        assertEquals(1, eiturSnakar.size());
        assertEquals("item2", eiturSnakar.get(0).getName());
    }

    private ListObserver mock(Class<ListObserver> listObserverClass) {
        ListObserver o = null;
        ListObserver o1 = o;
        return o1;
    }
}
*/