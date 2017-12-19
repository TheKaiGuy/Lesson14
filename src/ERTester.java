
public class ERTester {
    
    public static void main(String[] args){
        LinkedPriorityQueue ER =new LinkedPriorityQueue(3);
        //add 2 serious, 1 critical, and 1 fair
        ER.enqueue("Sam",2);
        ER.enqueue("Bob", 1);
        ER.enqueue("Joe",0);
        ER.enqueue("Amy",1);
        System.out.println("Treating patient "+ER.dequeue());
        System.out.println("Treating patient "+ER.dequeue());
        System.out.println("Treating patient "+ER.dequeue());
        System.out.println("Treating patient "+ER.dequeue());
    }
}
