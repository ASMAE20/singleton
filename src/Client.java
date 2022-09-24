import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client extends Thread{

    String name;


        public Client(String name){
        super(name);
    }
    // ------------------
    public void programPequnentiel() {
        try{
            System.out.println("Tu es  "+this.getName()+"-"+this.getId());
            Terre terre=Terre.getInstance(4000,7000);

        }catch(Exception e){

            System.out.println("Exception is caught");
        }
       }

       // -------------
       @Override
     public   void run(){
                try{
                    System.out.println("Tu es  "+this.getName()+"-"+this.getId());
                    Terre terre = Terre.getInstance(4000, 7000);
                }catch(Exception e){
                    System.out.println("Exception is caught");
                }
    }}


