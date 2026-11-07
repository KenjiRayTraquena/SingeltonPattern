public class HelpDeskStation{
    private int stationId;
    private QueueManage queueManage;

    public HelpDeskStation(int stationId){
        this.stationId = stationId;
        this.queueManage = queueManage.getInstance();
    }

    public void serveNext(){
        int nextNum = queueManage.getNextQueueNumber();
        System.out.println("Help Desk Station "+stationId + " is now serving Queue Number: "+nextNum);
    }
    public void resetQueue(int newNumber){
        System.out.println("Help Desk Station "+ stationId +" is resetting the queue.");
        queueManage.resetQueueNumber(newNumber);
    }

}