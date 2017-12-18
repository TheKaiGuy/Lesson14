
public class TireSales {

    public static void main(String[] args) {
        //make a tire pole
        ArrayStack pole = new ArrayStack();
        Tire t;
        System.out.println("Adding 10 goodyears to the pole");
        for (int i = 0; i < 10; i++) {
            t=new Tire("Goodyear");
            pole.push(t);
        }
        System.out.println("Selling 4 tires");
        for (int i = 0; i < 4; i++) {
            t=(Tire)pole.pop();
            System.out.println(t);
        }
    }
    
}
