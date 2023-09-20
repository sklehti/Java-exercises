public class Message {
    private String sender;
    private String content;

    public Message (String s, String c)  {
        this.sender = s;
        this.content = c;
    }

    public String getContent () {
        return this.content;
    }

    public String toString () {
        return this.sender + ": " + this.content;
    }

}
