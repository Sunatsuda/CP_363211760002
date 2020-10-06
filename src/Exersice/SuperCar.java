package Exersice;

public class SuperCar {

        private String CarBrand;
        private String CarColor;
        private int CarEngineSize;
        private int MaxSpeed;
        private String CountryOfOrigin;
        public SuperCar(){}
        public SuperCar(String n,String c,int s,int m,String o){
            CarBrand = n;
            CarColor = c;
            CarEngineSize = s;
            MaxSpeed = m;
            CountryOfOrigin = o;
        }
        public String getCarBrand (){
            return CarBrand;
        }
        public void setCarBrand(String n){
            CarBrand = n;
        }
        public String getCarColor(){
            return CarColor;
        }
        public void setCarColor(String c) {
            CarColor = c;
        }
        public int getCarEngineSize(){
            return CarEngineSize;
        }
        public  void setCarEngineSize(int s){
            CarEngineSize = s;
        }
        public int getMaxSpeed(){
            return MaxSpeed;
        }
        public  void setMaxSpeed(int m){
            MaxSpeed = m;
        }
        public String getCountryOfOrigin(){
            return CountryOfOrigin;
        }
        public void setCountryOfOrigin(String o) {
            CountryOfOrigin = o;
        }
        @Override
        public String toString() {
            return "SuperCar{" +
                    "CarBrand='" + CarBrand + '\'' +
                    ", CarColor='" + CarColor + '\'' +
                    ", CarEngineSize=" + CarEngineSize +
                    ", MaxSpeed=" + MaxSpeed +
                    ", CountryOfOrigin='" + CountryOfOrigin + '\'' +
                    '}';
        }
    }//class

