package hu.veres.domokos.exclamation.mark;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ExclamationMarkServer exclamationMarkServer = new ExclamationMarkServer();
        try {
            exclamationMarkServer.start();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
