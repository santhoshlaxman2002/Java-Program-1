package Oops;

public class SimpleClass {
    public static int population;
    public int roll;
    public String name;
    public int mark;
    public SimpleClass(int roll, String name, int mark){
        this.roll=roll;
        this.name=name;
        this.mark=mark;
        population++;
//        System.out.println(name);
    }
    public void Print(){
        System.out.println(this.name+" "+this.roll+" "+this.mark);
    }
}
