package is.vidmot;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class IntStackTest {

    @Test
    public void testNewStackIsNotFull() {
        IntStack stack = new IntStack();

        assertFalse(stack.isFull());
    }

    @Test
    public void testPopReturnsPushedValue() {
        IntStack stack = new IntStack();
        int pushedValue = 42;
        stack.push(pushedValue);
        int poppedValue = stack.pop();
        assertEquals(pushedValue, poppedValue);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPopOnEmptyStack() {
        IntStack myStack = new IntStack();
        myStack.pop();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testPushOnFullStack() {
        IntStack myStack = new IntStack();
        for (int i = 1; i <= 11; i++) {
            myStack.push(i);
        }
        //myStack.push();
    }

    @Test
    public void testIsEmptyOnEmptyStack() {
        IntStack myStack = new IntStack();
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void testIsEmptyOnNonEmptyStack() {
        IntStack myStack = new IntStack();
        myStack.push(1);
        assertFalse(myStack.isEmpty());
    }
}