package Inheritance;

public class Human {
    String name;
    int age;

    private String Hobby;

    public String getHobby() {
        return Hobby;
    }

    public void setHobby(String hobby) {
        Hobby = hobby;
    }

    void displayinfo(){
        System.out.println("NAME: "+name);
        System.out.println("AGE: "+age);;
        System.out.println("hobby: "+Hobby);
    }
}
