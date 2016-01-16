import java.util.ArrayList;
public class Network {
	public ArrayList<Laptop> laptops=new ArrayList<Laptop>();
	Network(){
		laptops.add(new Laptop("0.0.0.0"));
		laptops.add(new Laptop("0.0.0.1"));
		laptops.add(new Laptop("0.0.0.2"));
		laptops.add(new Laptop("0.0.0.3"));
		laptops.get(0).phones.add(new Smartphone("0.0.1.0"));
		laptops.get(0).phones.add(new Smartphone("0.0.1.1"));
		laptops.get(1).phones.add(new Smartphone("0.0.1.2"));
		laptops.get(1).phones.add(new Smartphone("0.0.1.4"));
		laptops.get(2).phones.add(new Smartphone("0.0.1.3"));
		laptops.get(2).phones.add(new Smartphone("0.0.1.5"));
		laptops.get(2).phones.add(new Smartphone("0.0.1.9"));
		laptops.get(3).phones.add(new Smartphone("0.0.1.6"));
		laptops.get(3).phones.add(new Smartphone("0.0.1.7"));
		laptops.get(3).phones.add(new Smartphone("0.0.1.8"));
		connect(laptops.get(0),laptops.get(2));
		connect(laptops.get(0),laptops.get(3));
		connect(laptops.get(1),laptops.get(2));
		connect(laptops.get(1),laptops.get(3));
		connect(laptops.get(2),laptops.get(3));
		laptops.get(0).createRT();
		laptops.get(1).createRT();
		laptops.get(2).createRT();
		laptops.get(3).createRT();
		
	}
	public void connect(Laptop l1, Laptop l2){
		if(l1.laptops.indexOf(l2)==-1){
			l1.laptops.add(l2);
			l2.laptops.add(l1);
		}
	}

}
