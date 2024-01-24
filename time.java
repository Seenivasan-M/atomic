class wtime{

    

    public wtime(int i, int r) {
        i=r;
    } 
     
    public  void Wtime(){
        for(int y=1;y<=5;y++){
            for(int h= 1;h<=5;h++){
            System.out.print("@");
            }
            System.out.println();
        }
    }
}
// second class

 class fug{
    int g;
    int n;

    public fug(){
        g=34;
        n=g+2;
    }

    


}

public class time{
    public static void main(String []args){

        wtime in=new wtime(23,34);
        in.Wtime();
        // System.out.println(in.wtime());
      

        }
    }
