
public class Tire {
    String make;
    int id;
    static int nextid=0;
    
    public Tire(String mk){
        make=mk;
        nextid++;
        id=nextid;
    }
    
    public String toString(){
        return "ID: "+id+"\tMake: "+make;
    }
}
