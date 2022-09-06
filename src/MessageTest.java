import org.junit.Test;

public class MessageTest {
    public static void main(String[] args) {
        Message message = new Message();
        UserA userA = new UserA(message);
        UserB userB = new UserB(message);
        userA.setName("A");
        userB.setName("B");
        userA.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        userB.start();
    }


}
