import java.util.*;
public class Graph_string_10{
   Map<String, List<String>> adjacencyList = new HashMap<>();
//Map(key,value) list of integers store chesukuntundhi
    public Graph_string_10(){
        adjacencyList=new HashMap<>();
    }
    public void print(){
        for(String Person : adjacencyList.keySet()){
            System.out.println(Person + "=" +adjacencyList.get(Person));
        }
    }
    public void addEdge(String a, String b) {
    adjacencyList.putIfAbsent(a, new ArrayList<>());
    adjacencyList.putIfAbsent(b, new ArrayList<>());
    adjacencyList.get(a).add(b);
    adjacencyList.get(b).add(a); // undirected graph
    }

    public static void main(String[] args) {
       Graph_string_10 g = new Graph_string_10();

        // ⭐ Your input converted to edges
        g.addEdge("Rc", "Ntr");
        g.addEdge("Rc", "MB");
        g.addEdge("Rc", "prabhas");

        g.addEdge("MB", "AA");

        g.addEdge("prabhas", "yash");
        g.addEdge("AA", "nani");
        // ⭐ Print final graph
        g.print();
    }
}
//prabhas=[Rc, yash]
//AA=[MB, vijay]
//Rc=[Ntr, MB, prabhas]
//MB=[Rc, AA]
//yash=[prabhas]
//Ntr=[Rc]
//vijay=[AA]