package Lab7;

public class Student {
    //attributes
    private  String name;
    private  String sid;
    private  String S_leve;
    private  int age;
    //constructor

    public Student(String name, String sid, String s_leve, int age) {
        this.name = name;
        this.sid = sid;
        S_leve = s_leve;
        this.age = age;
    }

    //getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getS_leve() {
        return S_leve;
    }

    public void setS_leve(String s_leve) {
        S_leve = s_leve;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //toString

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sid='" + sid + '\'' +
                ", S_leve='" + S_leve + '\'' +
                ", age=" + age +
                '}';
    }
}
