package Oops;

public class child extends Parent{
    public int cage;
    public String cname;

    public child(String fname, int fage, int cage, String cname) {
        super(fname, fage);
        this.cage = cage;
        this.cname = cname;
    }
}
