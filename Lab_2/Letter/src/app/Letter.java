package app;


public class Letter {
    private String sender;
    private String recipient;
    private String body;

    public Letter(String from, String to) {
        sender = from;
        recipient = to;
        body = "";
    }

    public void addLine(String line) {
        body = body.concat(line).concat("\n");
    }

    public String getText() {
        String letterText = "Dear " + recipient + ":\n\n" + body + "\nSincerely,\n\n" + sender;
        return letterText;
    }
}
