import java.util.*;
public class Graph_traversal{
    private Map<Integer,List<Integer>> adjacencyList=new HashMap<>(); 
    
        public void addNode(int data){
            adjacencyList.putIfAbsent(data,new ArrayList<>());
        }
        public void addEdges(int v,int u){
            addNode(u);
            addNode(v);
            adjacencyList.get(v).add(u);
            adjacencyList.get(u).add(v);

        }
        public void printGraph(){
            for(int v : adjacencyList.keySet()){
                System.out.println(v + "->" + adjacencyList.get(v));
            }
        }
        public void Bfss(int data){
            Queue<Integer> queue=new java.util.LinkedList<>();
            Set<Integer> visited=new HashSet<>();
            queue.add(data);
            visited.add(data);
            System.out.println("BFS:");
            while(!queue.isEmpty()){
                int current = queue.poll();
                System.out.print(current + " ");
                for(int neighbour : adjacencyList.get(current)){
                    if(!visited.contains(neighbour)){
                        visited.add(neighbour);
                        queue.add(neighbour);
                    }

                }
            System.out.println();
            }

        }
        public void Dfs(int start){
            Set<Integer> visited = new HashSet<>();
            dfsHelper(start,visited);
        }
        public void dfsHelper(int node,Set<Integer>visited){ //
            visited.add(node);
            System.out.print(node + " ");
            for(int neighbour : adjacencyList.get(node)){
                if(!visited.contains(neighbour)){
                    dfsHelper(neighbour,visited);
                }
            }
        }
    public static void main(String[] args) {
        Graph_traversal gt=new Graph_traversal();
        gt.addNode(1);
        gt.addNode(2);
        gt.addNode(3);
        gt.addNode(4);
        gt.addNode(5);
        gt.printGraph();
        gt.addEdges(1,2);
        gt.addEdges(1, 3);
        gt.addEdges(2, 4);
        gt.addEdges(3,5);
        gt.printGraph();
        gt.Bfss(1);
        gt.printGraph();
        gt.Dfs(2);
        gt.printGraph();
    }
}