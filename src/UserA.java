public class UserA  extends Thread{
        private Message message;
        UserA(Message message){
            this.message=message;
        }

    @Override
    public void run() {
        while(message.num<message.content.size()){

            System.out.println(getName()+"开始发送第"+(message.num+1)+"条信息：");
            message.send();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
