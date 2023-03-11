import java.io.*;
import java.util.*;

// This class represents a
// directed graph using adjacency
// list representation
class Graph {
    private int V;
    private LinkedList<Integer> adj[];
    // Constructor
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
    void addEdge(int v, int w)
    {
        adj[v].add(w);
    }
    Boolean isReachable(int s, int d)
    {

        LinkedList<Integer>temp;
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s]=true;
        queue.add(s);
        Iterator<Integer> i;
        while (queue.size()!=0)
        {
            s = queue.poll();
            int n;
            i = adj[s].listIterator();
            while (i.hasNext())
            {
                n = i.next();
                if (n==d)
                    return true;
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        return false;
    }
}