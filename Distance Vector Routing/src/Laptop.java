import java.util.ArrayList;
public class Laptop {
	public ArrayList<Laptop> laptops=new ArrayList<Laptop>();
	public ArrayList<Smartphone> phones=new ArrayList<Smartphone>();
	public RoutingTable table=new RoutingTable();
	public String address;
	Laptop(String address){
		this.address=address;
	}
	public void createRT(){
		for(int i=0;i<phones.size();i++){
			table.nodes.add(new RTNode(phones.get(i).address,0,null));
		}
	}

}
