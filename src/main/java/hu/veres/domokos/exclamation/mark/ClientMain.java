package hu.veres.domokos.exclamation.mark;

public class ClientMain {
    public static void main(String[] args) {
        ExclamationMarkClient exclamationMarkClient = new ExclamationMarkClient();
        ExclamationMark.MessageResponse exclamationMark = exclamationMarkClient.getExclamationMark();
        System.out.println(exclamationMark.getMessage());
    }
}
