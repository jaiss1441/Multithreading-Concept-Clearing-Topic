package ProducerComsumerProblem;

public class ProducerConsumerProblem {

    int n;
    synchronized public void produce_item(int n){
        this.n=n;
        System.out.println("Producer : "+this.n );
    }

    synchronized public int consume_item(){
        System.out.println("Consumer :" +this.n);

        return this.n;
    }

}
