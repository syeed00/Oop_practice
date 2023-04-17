package Polymorphism;

public class test {
    public static void main(String[] args) {

        person p=new person();
        p.display();
        p=new techer();
        p.display();
        p =new student();
    }
}
