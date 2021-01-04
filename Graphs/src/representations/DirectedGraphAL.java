package representations;

import java.util.*;

/*
    This is a directed, unweighted graph that uses adjacency lists.
 */
public class DirectedGraphAL<V>
{
    // use adjacency lists
    private Map<V, LinkedList<Edge<V>>> adjacencyLists;

    public DirectedGraphAL()
    {
        adjacencyLists = new HashMap<V, LinkedList<Edge<V>>>();
    }

    // vertices on the graph are set, they have to be all unique
    public boolean addVertex(V element)
    {
        if(!hasVertex(element))
        {
            // add it if not already present
            adjacencyLists.put(element, new LinkedList<Edge<V>>());
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean addEdge(V source, V dest)
    {
        // double check that the vertices are present
        if(!hasVertex(source) || !hasVertex(dest))
        {
            throw new IllegalArgumentException("One of the following vertices " +
                    "does not exist: " + source + ", " + dest);
        }

        // double check that the edge does not exist
        Edge<V> newEdge = new Edge<V>(source, dest);

        LinkedList<Edge<V>> adjacencyList = adjacencyLists.get(source);

        if(adjacencyList.contains(newEdge))
        {
            return false;
        }
        else
        {
            adjacencyList.add(newEdge);
            return true;
        }
    }

    public boolean hasVertex(V element)
    {
        return adjacencyLists.containsKey(element);
    }

    public Set<V> vertices()
    {
        return adjacencyLists.keySet();
    }

    // hard one is to return edges
    // From the picture on onenote, The array [0, 1, 2, 3, 4] on the left are vertices, the LinkedList on the right are edges.
    public Set<Edge<V>> edges()
    {
        Set<Edge<V>> results = new HashSet<Edge<V>>();

        // loop over each adjacency list
        // From our private Map variable above, values on our map are adjacencyLists.
        for(LinkedList<Edge<V>> adjacencyList : adjacencyLists.values())
        {
            // it will loop over the all the adjacencyLists.values, and add them one by one to our set.
            results.addAll(adjacencyList);
        }

        return results;
    }

    // Generic class Edge that is not tied to any specific problem.
    // We don't have any weight field, so we are not storing any specific type of data.
    public static class Edge<V>
    {
        private V source;
        private V dest;

        public Edge(V source, V dest)
        {
            this.source = source;
            this.dest = dest;
        }

        public V getSource()
        {
            return source;
        }

        public V getDest()
        {
            return dest;
        }

        // HashCode and Equals should only be changed together
        @SuppressWarnings("unchecked")
        @Override
        public boolean equals(Object other)
        {
            if (this == other)
            {
                return true;
            }
            if (other == null || getClass() != other.getClass())
            {
                return false;
            }
            Edge<V> otherEdge = (Edge<V>) other; // we suppress the warning for this line, we already double checked
                                           // the classes are the same with the above two checks.

            // making sure two edges are equal based on their source and destination vertex
            return this.source.equals(otherEdge.source) && this.dest.equals(otherEdge.dest);
        }

        @Override
        public int hashCode()
        {
            return Objects.hash(source, dest);
        }
    }
}




















