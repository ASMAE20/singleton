import java.awt.*;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("1-mode sequentiel     2-mode concurrent   |");
        int mode=scanner.nextInt();
        if(mode==1) {

        for(int i=0;i<6;i++){
            Client client=new Client("Client");
            client.programPequnentiel();
        }

        } else if (mode==2) {
            for(int i=0;i<6;i++){
                Client client=new Client("Client");
                client.start();
            }
        }else{
            System.out.println("choix non valide   |");
        }



}
    }
