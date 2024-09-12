package Looping;

public class EvenNum {
    public static void main (String[] args){
        int num= 100;
        System.out.println("The even number between 1 to " +num+ "are :");
       for(int i=1;i<num; i++){
           if(i%2==0){
               System.out.println(" It is an Even Num");
           }
       }
    }

}
