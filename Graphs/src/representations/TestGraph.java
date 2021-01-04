package representations;

public class TestGraph
{
    public static void main(String[] args)
    {
        // let's store a graph of social network relationships
        // We can store anything that can be related/represented as a network, and we can store that on a graph.

        DirectedGraphAL<String> socialNetwork = new DirectedGraphAL<>();

        // add a few people
        socialNetwork.addVertex("Jose");
        socialNetwork.addVertex("Lisa");
        socialNetwork.addVertex("Bob");
        socialNetwork.addVertex("Kevin");
        socialNetwork.addVertex("Susie");

        // add a few relationships

        // Normally the relationships are like two ways (Undirected graph), where if Jose is friend with Lisa, Lisa is friend with Jose
        // But this one is like Twitter (one way, directed graph), Jose may follow Lisa, but Lisa may not have followed Jose.
        socialNetwork.addEdge("Jose", "Lisa");
        socialNetwork.addEdge("Lisa", "Jose"); // on this let's say they both are following each other.
        socialNetwork.addEdge("Bob", "Lisa");
        socialNetwork.addEdge("Kevin", "Lisa");
        socialNetwork.addEdge("Lisa", "Susie");
        socialNetwork.addEdge("Susie", "Jose");

        // verify that the graph contains our data
        System.out.println("Vertices in the graph: ");
        for(String vertex : socialNetwork.vertices())
        {
            System.out.println("V: " + vertex);
        }
        System.out.println();

        System.out.println("Edges in the graph: ");
        for(DirectedGraphAL.Edge<String> edge : socialNetwork.edges())
        {
            System.out.println("E: " + edge.getSource() + " --> " + edge.getDest());
        }
        System.out.println();
    }
}



















