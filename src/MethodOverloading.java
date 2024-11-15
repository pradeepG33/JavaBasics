public class MethodOverloading {

    public double Calculate_Area(int r){
       return (3.14*r*r);
    }
    public int Calculate_Area(int l, int b){
        return (l*b);
    }
    public void Calculate_Area(int p, int l, int b){
        System.out.println((p*l)+(2*b));
    }
    public static void main(String[] args){
        int r = 5;
        int l = 6;
        int b = 8;
        int p = 9;
        MethodOverloading m = new MethodOverloading();
       double x = m.Calculate_Area(l,b);
       System.out.println(x);

    }
}
