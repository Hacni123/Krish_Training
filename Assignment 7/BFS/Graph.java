

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import java.util.LinkedList;
import java.util.Queue;

class Neighbor {
    public int vertexNum;
    public Neighbor next;
    public Neighbor(int vnum, Neighbor nbr) {
            this.vertexNum = vnum;
            next = nbr;
    }
}

class Vertex {
    String name;
    Neighbor adjList;
    Vertex(String name, Neighbor neighbors) {
            this.name = name;
            this.adjList = neighbors;
    }
}

/**
 * @author Sesh Venugopal. 
 */
public class Graph {

	Vertex[] adjLists;
	
	public Graph(String file) throws FileNotFoundException {
		
		Scanner sc = new Scanner(new File(file));
		
		String graphType = sc.next();
		boolean undirected=true;
		if (graphType.equals("directed")) {
			undirected=false;
		}
		
		adjLists = new Vertex[sc.nextInt()];

		// read vertices
		for (int v=0; v < adjLists.length; v++) {
			adjLists[v] = new Vertex(sc.next(), null);
		}

		// read edges
		while (sc.hasNext()) {
			
			// read vertex names and translate to vertex numbers
			int v1 = indexForName(sc.next());
			int v2 = indexForName(sc.next());
			
			// add v2 to front of v1's adjacency list and
			// add v1 to front of v2's adjacency list
			adjLists[v1].adjList = new Neighbor(v2, adjLists[v1].adjList);
			if (undirected) {
				adjLists[v2].adjList = new Neighbor(v1, adjLists[v2].adjList);
			}
		}
	}
	
	int indexForName(String name) {
		for (int v=0; v < adjLists.length; v++) {
			if (adjLists[v].name.equals(name)) {
				return v;
			}
		}
		return -1;
	}	
	
	public void bfs() {
		boolean[] visited = new boolean[adjLists.length];
		Queue<Integer> queue = new LinkedList<Integer>();
		for (int v=0; v < visited.length; v++) {
			if (!visited[v]) {
				System.out.println("\nSTARTING AT " + adjLists[v].name);
				queue.clear();
				bfs(v, visited, queue);
			}
		}
	}
	
	// BFS starting at some vertex v
	private void bfs(int start, boolean[] visited, Queue<Integer> queue) {
		visited[start] = true;
		System.out.println(adjLists[start].name);
		queue.add(start);
		
		while (!queue.isEmpty()) {
			int v = queue.remove();
			for (Neighbor nbr=adjLists[v].adjList; nbr != null; nbr=nbr.next) {
				int vnum = nbr.vertexNum;
				if (!visited[vnum]) {
				
					visited[vnum] = true;
					System.out.println(adjLists[vnum].name);
					queue.add(vnum);
				}
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter graph input file name: ");
		String file = sc.nextLine();
		Graph graph = new Graph(file);
		graph.bfs();
	}

}
