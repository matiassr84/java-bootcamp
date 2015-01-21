
public class HouseBuilder implements ConstructionBuilder {
	
	private Construction construction;
	
	public HouseBuilder(){
		construction= new Construction();
	}	
	
	@Override
	public void buildRooms(){
		construction.setRooms(6);
	}
	
	@Override
	public void buildFloors(){
		construction.setFloors(2);
	}
	
	@Override
	public void buildLocation(){
		construction.setLocation("New York");
	}
	@Override
	public void buildLotsize(){
		construction.setLotsize(350.0);
	}
	
	public Construction getConstruction(){
		return construction;
	}
}
