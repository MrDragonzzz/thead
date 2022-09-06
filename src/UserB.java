public class UserB extends  Thread{
    private Message message;
    UserB(Message message){
        this.message=message;
    }

    @Override
    public void run() {
        while(message.num<message.content.size()){
            System.out.println(getName()+"开始发送第"+(message.num+1)+"条信息：");
            message.send();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
