
//Using Runnable Interface
public class MyThreadUsingRunnableInterface implements  Runnable {

    public void run(){
        for(int i=0; i<=10; i++){
            try{
                System.out.println("Value of i ="+i);
                Thread.sleep(1000);
            }catch (Exception c){}
        }
    }
//    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//
//
//
//    }


}
