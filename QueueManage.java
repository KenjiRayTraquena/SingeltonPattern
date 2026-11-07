public class QueueManage{
    private static QueueManage instance;
    private int currentQueueNumber;

    private QueueManage(){
        this.currentQueueNumber = 0;
    }

    public static synchronized QueueManage getInstance(){
        if(instance == null){
            instance = new QueueManage();
        }
        return instance;
    }
    
    public synchronized int getCurrentQueueNumber(){
        return currentQueueNumber;
    }

    public synchronized int getNextQueueNumber(){
        currentQueueNumber++;
        return currentQueueNumber;
    }

    public synchronized void resetQueueNumber(int newNumber){
        if(newNumber >=0){
            this.currentQueueNumber = newNumber;
            System.out.println("Queue number has been reset to: "+newNumber);
        }else{
            System.out.println("Invalid Queue number for reset.");
        }

    }
}