package problempract;

public class Box {
    int height,width;
    double depth;

    void setvol(int hight,int width,double depth){
        this.height=hight;
        this.width=width;
        this.depth=depth;
    }
    void Boxvolume(){
        System.out.println(height*width*depth);
    }
}
