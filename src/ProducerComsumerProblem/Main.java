package ProducerComsumerProblem;

public class Main {

    public static void main(String[] args){
        ProducerConsumerProblem pcp = new ProducerConsumerProblem();
        Producer p =new Producer(pcp);
        Consumer c = new Consumer(pcp);
        p.start();
        c.start();
    }
}
