package Lab8;

public class ExThrows {

    public  static  void main(String[] args) {
        int x = 10;
        int y = 0;

        int r = 0;
        try {
            r = divide(x, y);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("The result: "+r);

    }

    private  static  int divide (int x, int y) throws  Exception {
        return  x / y;
    }
}
