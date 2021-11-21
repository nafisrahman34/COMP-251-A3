import java.util.*;

public class FordFulkerson {

	public static ArrayList<Integer> pathDFS(Integer source, Integer destination, WGraph graph){
		ArrayList<Integer> path = new ArrayList<Integer>();
		ArrayList<Integer> visited = new ArrayList<Integer>();


		ArrayList<Edge> edges = graph.getEdges();
		Edge currentEdge = null;
		for(Edge e : edges){
			if(e.nodes[0]==source || e.nodes[1]==source){
				currentEdge=e;
				break;
			}
		}

		Stack<Integer> stack = new Stack<Integer>();
		Integer pointer = source;

		while(edges.size()!=0){
			if(!visited.contains(pointer)){
				path.add(pointer);
				visited.add(pointer);
				stack.push(pointer);
				if(currentEdge.nodes[0]==pointer){
				pointer = currentEdge.nodes[1];
				}else{
					pointer = currentEdge.nodes[0];
				}
			}
			


		}

		if(!visited.contains(destination)){
			return new ArrayList<Integer>();
		}
		return path;
	}



	public static String fordfulkerson(WGraph graph){
		String answer = "";
		int maxFlow = 0;
		
		/* YOUR CODE GOES HERE */

		answer += maxFlow + "\n" + graph.toString();	
		return answer;
	}
	

	 public static void main(String[] args){
		 String file = args[0];
		 WGraph g = new WGraph(file);
		 System.out.println(fordfulkerson(g));
	 }
}

