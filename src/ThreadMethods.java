
class userDefindClass extends Thread {
    public void run() {
        System.out.println("User Defind Thread ");

    }
}

public class ThreadMethods extends Thread{



    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        System.out.println("Program Started");


        // Getting and Setting thread name using getName() and setName() method
        Thread t = Thread.currentThread();
       String ThreadName = t.getName();
       System.out.println("Current thread name = "+ ThreadName); //it will give you current thread name
       t.setName("MyMain"); //Changing thread name
        System.out.println("Updated thread name = "+t.getName());

        // Sleep method
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //getting thread id via getId() method

        System.out.println(t.getId());
        System.out.println("Program Ended");
//       ThreadMethods tm = new ThreadMethods();
        userDefindClass ut = new userDefindClass();
        ut.start();


    }
}
