package Lab4;

public class Example_OverloadMethod {

    public static void main(String[] args) {

        int max = max(5,10);
       double max2 = max(5.0, 10.0);




    }//main
    public static  int  max(int x,int y){
        return x>y? x:y;
        //if (x>y) return x;
        //else return y;
    }
    public static  double  max(Double x,Double y) {
        return x > y ? x : y;
        //if (x>y) return x;
        //else return y;
    }


}//class
