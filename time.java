class wtime{

    private int i;

    public wtime(int i, int r) {
        i=r;
    } 
     
    public  void wtime(){
        for(int y=1;y<=5;y++){
            for(int h= 1;h<=5;h++){
            System.out.print("@");
            }
            System.out.println();
        }
    }
}

public class time{
    public static void main(String []args){

        wtime in=new wtime(23,34);
        in.wtime();
        // System.out.println(in.wtime());

    }
}