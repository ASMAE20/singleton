public class MThread  extends Thread{
   public void run(){
       try{
                System.out.println("Thread of id : "+this.getId());
       }catch(Exception e){

           System.out.println("Exception is caught");
       }
   }
}
