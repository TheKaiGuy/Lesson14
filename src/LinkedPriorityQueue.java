import java.util.ArrayList;

public class LinkedPriorityQueue implements PriorityQueue{
    public ArrayList list[];
    public LinkedPriorityQueue(int levels){
        list=new ArrayList[levels];
        for (int i = 0; i < levels; i++) {
            list[i]=new ArrayList();
        }
    }
    @Override
    public void enqueue(Object o, int priority) {
        list[priority].add(o);
    }

    @Override
    public Object peekFront() {
        /////////
        for(int i=0; i<list.length; i++){
            if(list[i].size()>0)
                return list[i].get(i);
        }
      throw new IllegalStateException("Queue is empty");
    }

    @Override
    public Object dequeue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void enqueue(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
      return list.length; //number of priorities
    }
    
    public boolean hasData(){
        boolean answer=false;
        for (int i = 0; i < list.length; i++) {
            if(list[i].size()>0) return true;
        }
        return false;
    }
}
