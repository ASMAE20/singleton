public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Terre terre=Terre.getInstance(4000,7000);

//        terre.printHello();

        Client client=new Client("riad");

        client.printHello();
    }
}