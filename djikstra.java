package tmpp;

import java.util.ArrayList;
import java.util.List;

public class djikstra {

	// based on fb circles program from ADS, each fb user is a device & friendship 
	// means they are connected i.e. can sent packets to them
	
	public int numCircles;
	public int userNum = 0;		//vertices
	public int connections;		//edges
	private int[] adjLists;
	private int[] size;
	
	public List<List<Integer>> listOfLists = new ArrayList<List<Integer>>();

	public djikstra(int numberOfNodes) {
		// TODO
		adjLists = new int[numberOfNodes];
		size = new int[numberOfNodes];
		for(int i = 0; i < adjLists.length; i++) {
			adjLists[i] = i;
			size[i] = 1;
		}
		numCircles = numberOfNodes;
	}

	public void initLists(int size) {
		for(int i = 0; i < size; i++)  {
			listOfLists.add(new ArrayList<Integer>());
	    }
	}
	
	public void initDjikstras(int [][][] table) {
		//int num = 0;
		for(int i = 0; i < table.length; i++) {
			for(int j = 0; j < table[0].length; j++) {
				//if(j != 0 && table[i][j-1][0] == -1 )	j--;
				table[i][j][0] = j;
				if(j == i) {
					table[i][j][2] = 0;
				}
				else {
					table[i][j][2] = Integer.MAX_VALUE;
				}
			}
		}
		
		for(int i = 0; i < table.length; i++) {
			System.out.print("{");
			for(int j = 0; j < table[0].length; j++) {
				System.out.print("[");
				for(int k = 0; k < table[0][0].length; k++) {
					System.out.print(table[i][j][k] + ", ");
				}
				System.out.print("]");
			}
			System.out.print("}\n");
		}
	}
	
	public void friends(int user1, int user2) {
		// TODO
		/*int rootP = find(user1);
        int rootQ = find(user2);
        //if (rootP == rootQ) return;

        // make smaller root point to larger one
        if (size[rootP] < size[rootQ]) {
            adjLists[rootP] = rootQ;
            size[rootQ] += size[rootP];
            size[rootP] = 0;
        }
        else {
            adjLists[rootQ] = rootP;
            size[rootP] += size[rootQ];
            size[rootQ] = 0;
        }*/
        //new
        listOfLists.get(user1).add(user2);
        listOfLists.get(user2).add(user1);
		numCircles--;
	}

	public int find(int p) {
        while (p != adjLists[p])
            p = adjLists[p];
        return p;
    }

	public void print() {
		for (int v = 0 ; v < adjLists.length; v++) {
			System.out.print(" - " + adjLists[v]);
			System.out.println("\nSize: " + size[v]);
		}
	}

}
