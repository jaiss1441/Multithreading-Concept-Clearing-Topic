public class MyThreadUsingThreadClass extends Thread{

    public void run(){

        for(int i=10; i>=1; i--){
            System.out.println("Second Thread ="+i);

            try {
                Thread.sleep(1000);
            }catch (Exception c){}
        }
    }
}
