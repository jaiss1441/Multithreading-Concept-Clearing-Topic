package ProducerComsumerProblem;

public class Producer extends Thread {

    ProducerConsumerProblem p;

    public Producer(ProducerConsumerProblem p){
        this.p=p;
    }

    public void run(){
        int i=1;
        while(true){
            this.p.produce_item(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            i++;
        }
    }

}
