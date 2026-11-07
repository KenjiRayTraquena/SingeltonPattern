public class OnlineMonitor {
    private QueueManage queueManage;

    public OnlineMonitor(){
        this.queueManage = queueManage.getInstance();
    }
    public void displayCurrentQueue(){
        System.out.println("Currently Serving: "+queueManage.getCurrentQueueNumber());
    }
}