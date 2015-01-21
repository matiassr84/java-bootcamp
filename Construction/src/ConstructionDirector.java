
public class ConstructionDirector {

	private ConstructionBuilder constructionbuilder = null;

	public ConstructionDirector(ConstructionBuilder constructionbuilder){
		this.constructionbuilder=constructionbuilder;
	}
	
	public void constructConstruction(){
		constructionbuilder.buildRooms();
		constructionbuilder.buildFloors();
		constructionbuilder.buildLocation();
		constructionbuilder.buildLotsize();
	}
	
	public Construction getConstruction(){
		return constructionbuilder.getConstruction();
	}
}
