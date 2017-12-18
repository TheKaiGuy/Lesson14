
public class RadioCallInShow {

    
    public static void main(String[] args) {
        LinkedQueue phoneline=new LinkedQueue();
        System.out.println("The lines are open");
        System.out.println("Currently we have "+phoneline.size() +" callers waiting");
        System.out.println("3 calls are coming in");
        phoneline.enqueue(new Caller("Jim"));
        phoneline.enqueue(new Caller("Amy"));
        phoneline.enqueue(new Caller("Susan"));
        System.out.println("The next caller will be: "+phoneline.peekFront());
    }
    
}
