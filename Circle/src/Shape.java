
public class Shape {
	public String color;
	public boolean filled;
	
	public Shape(){
		color="green";
		filled=true;
	}
	public Shape(String color, boolean filled){
		this.color=color;
		this.filled=filled;
	}
		
	public String getColor(){
		return color;
	}
	
	public boolean filled(){
	return filled;
	}
	
	public void setColor(String color){
		this.color=color;
	}
	
	public void setFilled(boolean filled){
		this.filled=filled;
	}
	
	public String toString(){
		return "Color: " + getColor();
	}
}
