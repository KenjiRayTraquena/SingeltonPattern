public class Main{  
    public static void main(String[] args){
        OnlineMonitor monitor = new OnlineMonitor();
    

    HelpDeskStation station1 = new HelpDeskStation(1);
    HelpDeskStation station2 = new HelpDeskStation(2);
    HelpDeskStation station3 = new HelpDeskStation(3);   
    
    monitor.displayCurrentQueue();
    station1.serveNext();
    monitor.displayCurrentQueue();
    station2.serveNext();
    station3.serveNext();

    monitor.displayCurrentQueue();
    
    station2.resetQueue(100);
    monitor.displayCurrentQueue();

    station1.serveNext();
    monitor.displayCurrentQueue();

    }
}