
public class testAuthor {        // save as "TestAuthor.java"
   public static void main(String[] args) {
	   Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
	   System.out.println(anAuthor);   // call toString()
	   anAuthor.setEmail("paul@nowhere.com");
	   System.out.println(anAuthor);
	   
	   Book aBook=new Book("Java for dummy", anAuthor, 19.95, 1000);
	   Book anotherBook = new Book("more Java for dummy", new Author("Arthur Conan Doyle" , "arthur@somewhere.com",'m'), 29.95, 888);
	   System.out.println(aBook);
	   System.out.println(anotherBook);
   		}
   }
