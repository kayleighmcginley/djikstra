package tmpp;

public class djikstrasMain {

	public static void main(String [] args) {
		int size = 8;
		djikstra djikstrasAl = new djikstra(size);
		djikstrasAl.initLists(size);		
		// 0 represents 50000, 1 represents 50001 etc.
		djikstrasAl.friends(0,1);
		djikstrasAl.friends(0,4);
		djikstrasAl.friends(1,4);
		djikstrasAl.friends(1,6);
		djikstrasAl.friends(1,5);
		djikstrasAl.friends(1,2);
		djikstrasAl.friends(2,4);
		djikstrasAl.friends(2,3);
		djikstrasAl.friends(2,7);
		djikstrasAl.friends(3,4);
		djikstrasAl.friends(4,5);
		djikstrasAl.friends(5,6);
		
		
		int [][][] table = new int[size][size][3];	// nodes x nodes-1 x {destination, next, hops}
		djikstrasAl.initDjikstras(table);
		
		
		
		/*number of direct connections for each node (length of each ArrayList)
		for(int i = 0; i < size; i++) {
			int x = fbCircles.listOfLists.get(i).size();
			System.out.println(x);
		}*/
		
		/*list of who they can send to (elements in each array list)
		for(int i = 0; i < size; i++) {
			System.out.print(i + ": ");
			for(int j = 0; j < fbCircles.listOfLists.get(i).size(); j++) {
				System.out.print(fbCircles.listOfLists.get(i).get(j));
				if(j != fbCircles.listOfLists.get(i).size()-1) 	System.out.print(", ");
				else System.out.println();
			}
		}*/
	
	}
	
}
