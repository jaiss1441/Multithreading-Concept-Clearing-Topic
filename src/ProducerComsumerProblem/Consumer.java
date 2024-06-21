package ProducerComsumerProblem;

public class Consumer extends Thread{

    ProducerConsumerProblem p2;

    Consumer(ProducerConsumerProblem p2){
        this.p2=p2;

    }

    public void run(){
        while (true){
            this.p2.consume_item();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
    }
}
