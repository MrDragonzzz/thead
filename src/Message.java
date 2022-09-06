import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Message {
    public Integer num=0;
    public List content;
    Message(){
        content= Arrays.asList("你好，Mr.B","你好，Mr.A","吃饭了没","还没有","我也没有吃","一起去吃饭不","好啊，走吧");
    }
    public synchronized void send(){

            System.out.println(content.get(num));
            num++;

        notify();
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
