package main;
import java.util.ArrayList;

public class Log {
    private Log() {}
    private static Log instance = new Log();

    public static Log getInstance(){
        return instance;
    }

    private int numOfWarnings = 0;
    private int numOfErrors = 0;
    private ArrayList<String> consoleMessages = new ArrayList<String>();

    public void addConsoleMessage(String message, String type) {
        if(type == "warning")
            numOfWarnings++;
        else
            numOfErrors++;
        consoleMessages.add(type + ':' + message);
    }

    public void printConsoleMessages(){
        System.out.println("Messages:" + consoleMessages);
    }

    public int getNumOfErrors() {
        return numOfErrors;
    }

    public void setNumOfErrors(int numOfErrors) {
        this.numOfErrors = numOfErrors;
    }

    public int getNumOfWarnings() {
        return numOfWarnings;
    }

    public void setNumOfWarnings(int numOfWarnings) {
        this.numOfWarnings = numOfWarnings;
    }


    public ArrayList<String> getConsoleMessages() {
        return consoleMessages;
    }

    public void setConsoleMessages(ArrayList<String> consoleMessages) {
        this.consoleMessages = consoleMessages;
    }
}
