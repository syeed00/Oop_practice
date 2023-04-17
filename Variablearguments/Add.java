package varargs;

public class Add {

    void adding(int ... num){
        int sum=0;
        for(int x : num){
            sum =sum+x;
        }
        System.out.println(sum);
    }
}
