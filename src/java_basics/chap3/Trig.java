package java_basics.chap3;
public class Trig {
    //fields
    private Angle angle1 , angle2 ;

    //constuctors
    public Trig(Angle angle1 , Angle angle2){
        this.angle1 = angle1;
        this.angle2 = angle2;
    }
    public Trig(double value1 , double value2){
        this.angle1 = new Angle(value1);
        this.angle2 = new Angle(value2);
    }

    //methods
    public double maximumCosine(){
        return this.angle1.maxCosine(this.angle2);
        // same as return this.angle2.maxCosine(this.angle1);
    }

    public static void main(String[] args) {
        //----------------Method 1 (use the first constructor)---------------------------
        Angle a1 = new Angle(180);
        Angle a2 = new Angle(120);
        Trig t = new Trig(a1, a2);
        //----------------Method 2 (use the second constructor) ------------------------
        // Trig t = new Trig (30,40);

        System.out.println(t.maximumCosine());
    }
}
// mafina n3ayyit la shi manno static bi aleb static method ;