
public class Trial {
	public static void main(String[] args){
		
		ConstructionBuilder constructionbuilder = new HouseBuilder();
		ConstructionDirector constructiondirector = new ConstructionDirector(constructionbuilder);
		constructiondirector.constructConstruction();
		Construction construction=constructiondirector.getConstruction();
		System.out.print("Construction is: " + construction);
	}
}
