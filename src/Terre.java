public class Terre {
    private int age;
    private int population;
    private static Terre terre;

    private Terre(int age,int population) {
        // The following code emulates slow initialization.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }

    public static Terre getInstance(int age,int population) {
        if (terre == null) {
            terre = new Terre(age,population);
        }
        return terre;
    }
    public void printHello(){
        System.out.println("Bonjour j suis terre !");
    }
    public void create(){

    }
    public void add(){

    }
    public void display(){

    }
}
