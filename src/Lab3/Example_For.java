package Lab3;
// ให้พิมพ์ข้อความ "Hello"10 ครั้ง แสดงออกทางจอภาพ
public class Example_For {

    public  static void  main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println(i+ "Hello");
        }
        //พิมพ์เฉพาะเลขคุ่
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
        //พิมพ์ตัวเลข1-100 ที่หาร3,5,7,9, ลงตัว
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 1; i < 100; i++) {
            if (i% 3==0){
                if (i%5==0)
                    System.out.println(i);
            }
        }




        }//main

    }//class

