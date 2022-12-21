package stacks;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Input input =Mockito.mock(Input.class);
    private Output output = Mockito.mock(Output.class);
    Stack stack = new Stack(input, output);


    @Test
    void shouldPushTheElement() {
       when(input.getNextInt()).thenReturn(2);

        stack.push();

        assertEquals(0, stack.getTop());
        final int[] stack = this.stack.getStack();
        assertEquals(2, stack[0]);
    }

    @Test
    void shouldPopTheElement() {
        when(input.getNextInt()).thenReturn(2);
        stack.push();

        stack.pop();

        assertEquals(-1, stack.getTop());
        verify(output).display("element to be deleted: "+ 2);
    }
}