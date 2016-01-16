public class RTNode {
	public String destination;
	public int cost;
	public String nextHop;
	
	RTNode(String destination,int cost,String nextHop){
		this.destination=destination;
		this.cost=cost;
		this.nextHop=nextHop;
	}
	
}
