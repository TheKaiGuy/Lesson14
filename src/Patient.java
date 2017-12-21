
public class Patient {
      LinkedPriorityQueue ER =new LinkedPriorityQueue(3);
      private String name;
      private String type;
      
      public Patient(String nm, String tp){
          name=nm;
          type=tp;
      }
      public String toString(){
          String str=name+", "+type;
          return str;
      }
      
      
}
