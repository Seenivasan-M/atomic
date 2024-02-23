
import java.util.Random;
import java.util.*;

public class game {
    public static void main(String []args){
       
        //starts 
        //
        Scanner i=new Scanner(System.in);
        while(true){
        String [] rps={"ROCK","PAPER","SESOCR"};
String comp=rps[new Random().nextInt(rps.length)];

// System.out.print("please Enter the : \n ROCK \n PAPER \n SESCOR");
String ing;
while(true){
    System.out.println("please Enter the : \n ROCK \n PAPER \n SESCOR \n you play:");
    ing =i.nextLine();
    // System.out.println("you play:" + i);
    if(ing.equals("ROCK") || ing.equals("PAPER") || ing.equals("SESCOR") ){
        break;
    }
    System.out.println("SORRY THIS IS NOT VALIDAT INPUT");

}
System.out.println("computer played :"+comp);

if(ing.equals(comp)){
    System.out.println("SORRY THIS IS  GONNA be tIE!");
}
else if(ing.equals("ROCK")){
    if(comp.equals("PAPER")){
        System.out.println("you lose");

    }else if(comp.equals("SESCOR")){
        System.out.println("you win");
    }
}
       //next part
//mocks

else if(ing.equals("PAPER")){
    if(comp.equals("ROCK")){
        System.out.println("you lose");

    }else if(comp.equals("SESCOR")){
        System.out.println("you win");
    }
}
//...
//..
else if(ing.equals("SESCOR")){
    if(comp.equals("PAPER")){
        System.out.println("you lose");

    }else if(comp.equals("ROCK")){
        System.out.println("you win");
    }    
 }
     System.out.println(" \n \n PLAY AGIAN PICK ?(yes/no)");
    String ti=i.nextLine();
    if(!ti.equals("yes")){
    break;
    }

   }



}
        }


    