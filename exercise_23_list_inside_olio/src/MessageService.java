import java.util.ArrayList;

public class MessageService {
    private ArrayList<Message> list;

    public MessageService () {
        this.list = new ArrayList<>();
    }

    public void add (Message message) {
        if (message.getContent().length() <= 280) {
            list.add(message);
        }
    }

    public ArrayList<Message> getMessage () {
        return this.list;
    }
}
