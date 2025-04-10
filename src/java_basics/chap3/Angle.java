package java_basics.chap3;
public class Angle{
    private double value;
    
    public Angle(double value){
        this.value = value;
    }

    public double maxCosine(Angle other) {
        return Math.max(Math.cos(other.value), Math.cos(value));
        // double thisCos , otherCos;
        // thisCos = Math.cos(this.value);
        // otherCos= Math.cos(other.value);
        // double maxCosine = Math.max(thisCos, otherCos);
        // return maxCosine;
    }
}