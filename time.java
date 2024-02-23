import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

class hashmap<h>{
   

    static void map(){
        LinkedList <String> list=new LinkedList<String >();
        list.add("exisit");
        list.get(0);
        list.addFirst("equitiy");
        list.remove(0);

        for(String y:list){
        
            System.out.println(y);
        }
    HashMap <String,Integer> tag= new HashMap<String,Integer>();

    tag.put("rgerg",23);
    }

}

//class

class begin{
    //
    //method 
    //

void inhi(){

        System.out.println("do want date or data \n just enter which one you want");
        System.out.println("DATE AND TIME or DATA");

    }
}



public class time{
    public static void main(String ...args) throws Exception{
        hashmap had=new hashmap();
        

        System.out.println();

        begin var=new begin();
        var.inhi();
    System.out.println(var) ;

        Scanner call=new Scanner(System.in);

        String inp=call.nextLine();


if(inp.equals("date")){
        //date and time
        LocalDateTime datetime=LocalDateTime.now();
        DateTimeFormatter form=DateTimeFormatter.ofPattern("E \n MMM dd yyyy \n HH:mm:ss \n");
        String type=datetime.format(form);
        System.out.println(type);
}
        //
        //
        //ArrayList 
        else if(inp.equals("data")){
        ArrayList <Integer> ref=new ArrayList <Integer>();
        ref.add(456156);
        ref.add(456533);
        ref.add(45612);
        ref.add(45634);

        for(int h:ref){
            System.out.println(h);
        }
    
        //
        //d
        //Arraylist2
        ArrayList <Integer> ref2=new ArrayList <Integer>();
        ref2.add(4568);
        ref2.addAll(ref);

        ref2.get(1);
        ref2.remove(2);

        ref2.set(2,8906);

    // try
    //catch
        try{
            ref2.remove(4);
            }
            catch(IndexOutOfBoundsException g) {
                System.out.println("4 th array list has been removed \n \n \n");
    
            }

    Collections.sort(ref2);

        for(int loop:ref2){

            
            System.out.println(loop);

        }

        ref2.clear();
        }
    
call.close();
    

    }
}
