package test;

import main.Log;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogTest {

    @Test
    public void shouldReturnNumberOfWarnings() {
        Log.getInstance().setNumOfWarnings(42);
        assertEquals(42, Log.getInstance().getNumOfWarnings());
    }

    @Test
    public void shouldReturnNumberOfErrors() {
        Log.getInstance().setNumOfErrors(21);
        assertEquals(21, Log.getInstance().getNumOfErrors());
    }

    @Test
    public void shouldReturnConsoleMessage(){
        Log.getInstance().addConsoleMessage("One Console message", "warning");
        assertEquals("[warning:One Console message]", Log.getInstance().getConsoleMessages().toString());
    }


}