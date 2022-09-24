import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Terre {
    private int age;
    private int population;
    private static  Terre terre;


    private Terre(int age,int population) {
      this.population=population;
      this.age=age;

    }

    public synchronized static Terre   getInstance(int age,int population) {

            if (terre == null) {
               System.out.println("Tu viens de creer la terre");
                terre = new Terre(age, population);
                    }
         else {
                System.out.println("terre est deja cree");
                       }

        return terre;

    }
    public void printHello(){

        System.out.println("Bonjour je suis terre !");
    }


}
