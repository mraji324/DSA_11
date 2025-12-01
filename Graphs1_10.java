import java.util.*;
public class Graphs1_10{
    private Map<Integer,List<Integer>> adjacencyList;//Map(key,value) list of integers store chesukuntundhi
    public Graphs1_10(){
        adjacencyList=new HashMap<>();
    }
    public void addNode(int v){
        adjacencyList.putIfAbsent(v,new ArrayList<>());//node ekkada create avuthundhi
        for(int node : adjacencyList.keySet()){//just data ni store chesthunam variable lo
            //loop ey endhuku tisukuntam antey prev data tho need lekunda insert chestham
            if(node !=v){
                addEdge(node, v);
            }
        }
    }
    public void addEdge(int u,int v){//edge kosam inko function tisukunam
        if(!adjacencyList.containsKey(u)) addNode(u);
        if(!adjacencyList.containsKey(v)) addNode(v);
        if(!adjacencyList.get(u).contains(v)) adjacencyList.get(u).add(v);
        if(!adjacencyList.get(v).contains(u)) adjacencyList.get(v).add(u);
    }
    public void printGraph(){
        for(int v : adjacencyList.keySet()){
            System.out.println(v + "->" + adjacencyList.get(v));
        }
    }
    public boolean isConnected(int v,int u){
        if(adjacencyList.containsKey(v) && adjacencyList.get(v).contains(u)){
            return true;
        }
        return false;
    }
    public void removeConnection(int v,int u){
        if(adjacencyList.containsKey(v)){
            adjacencyList.get(v).remove(Integer.valueOf(u));
        }
        if(adjacencyList.containsKey(u)){
            adjacencyList.get(u).remove(Integer.valueOf(v));
        }
    }
    public int countOfEdges(){
        int count = 0;
        for(int node: adjacencyList.keySet()){
            count +=adjacencyList.get(node).size();
        }
        return count/2;
    }
    public int countOfNodes(){
        return adjacencyList.size();
    }
     public int PrintcountNodes(){
        int count = 0;
        for(int node: adjacencyList.keySet()){
            count +=adjacencyList.get(node).size();
            System.out.println(node + "=" +count);
        }
        return count;
    }
    //main method to test
    public static void main(String[] args) {
        Graphs1_10 graph = new Graphs1_10();
        //Add nodes(Automatically forms complete graph)
        graph.addNode(6);
        graph.addNode(1);
        graph.addNode(3);
        graph.addNode(5);
        graph.addNode(7);
        graph.addNode(8);
        graph.printGraph();
        System.out.println();
        graph.isConnected(5, 7);
        graph.printGraph();
        System.out.println();
        graph.removeConnection(5, 7);
        graph.printGraph();
        System.out.println();
        System.out.println(graph.countOfEdges());
        System.out.println(graph.countOfNodes());
        System.out.println(graph.PrintcountNodes());
    }
}
//1->[6, 3, 5, 7, 8]
//3->[1, 6, 5, 7, 8]
//5->[1, 3, 6, 7, 8]
//6->[1, 3, 5, 7, 8]
//7->[1, 3, 5, 6, 8]
//8->[1, 3, 5, 6, 7]

//1->[6, 3, 5, 7, 8]
//3->[1, 6, 5, 7, 8]
//5->[1, 3, 6, 7, 8]
//6->[1, 3, 5, 7, 8]
//7->[1, 3, 5, 6, 8]
//8->[1, 3, 5, 6, 7]

//1->[6, 3, 5, 7, 8]
//3->[1, 6, 5, 7, 8]
//5->[1, 3, 6, 8]
//6->[1, 3, 5, 7, 8]
//7->[1, 3, 6, 8]
//8->[1, 3, 5, 6, 7]
//14
//6
//1=5
//3=10
//5=14
//6=19
//7=23
//8=28
//28