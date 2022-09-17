public class Client {
    String name;
    Terre terre=Terre.getInstance(4000,7000);


    public Client(String name){
        this.name=name;
    }
    public void printHello(){
        terre.printHello();
    }
    public void create(){
        terre.create();
    }
    public void add(){
        terre.add();
    }
    public void display(){
        terre.display();
    }


}
