
public class Author {
	 // Private instance variable, not accessible from outside this class
	 private String name;
	 private String email;
	 private char gender;
	 
	 // Constructor which set name, email and gender
	 public Author(String name, String email, char gender){
		 this.name = name;
		 this.email = email;
		 this.gender = gender;
	 }
	 
	 public String getName(){
	  return name;
	 }
	 
	 public String getEmail(){
		 return email;
	 }
	 public char getGender(){
		 return gender;
	 }
	 
	 	 
	 public void setEmail(String email){
		 this.email = email;
	 }
 
	 public String toString(){
	 return "Author's name " + name + ", gender " + gender + ", email " + email ;
	 }
}
