import org.junit.Test;

public class MessageTest {
    @Test
    public void testSend() throws InterruptedException {
        Message message = new Message();
        UserA userA = new UserA(message);
        UserB userB = new UserB(message);
        userA.setName("A");
        userB.setName("B");
        userA.start();
        Thread.sleep(100);
        userB.start();
    }
}
