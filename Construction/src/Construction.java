
// Our product is a construction
public class Construction {

		private int rooms;
		private String location;
		private int floors;
		private double lotsize;
		
		public int getRooms(){
			return rooms;
		}
		
		public void setRooms(int rooms){
			this.rooms=rooms;
		}
		
		public String getLocation(){
			return location;
		}
		
		public void setLocation(String location){
			this.location=location;
		}
		
		public int getFloors(){
			return floors;
		}
		
		public void setFloors(int floors){
			this.floors=floors;
		}
		
		public double getLotsize(){
			return lotsize;
		}
		
		public void setLotsize(double lotsize){
			this.lotsize=lotsize;
		}

		public String toString(){
			return "floors: " + floors + ",rooms: " + rooms + ", location: " 
		+ location + ",size: " + lotsize + " m2";
		}
}
