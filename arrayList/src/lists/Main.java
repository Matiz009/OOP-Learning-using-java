package lists;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	 ArrayList<String> lists = new ArrayList<>(2);
	 lists.add("Ali Ahmad");
	 lists.add("Mark");
	 lists.add("Peter");
	 for(String list:lists){
         System.out.println("Elements is :"+ list);
     }
     lists.remove(2);

		System.out.println("After removing element");

		for(String list:lists){
			System.out.println("Elements is :"+ list);
		}

      /* Referenced Type ArrayList*/
		Books book1 = new Books("ALto",12);//making objects
		Books book2 = new Books("JAVA",1212);
		Books book3 = new Books("C#",11);
		ArrayList<Books> books = new ArrayList<>(3);//making arraylist of type Books
		books.add(book1);
		books.add(book2);
		books.add(book3);
		for(Books b:books){//getting values
			System.out.println("IBAN NUMBER OF BOOK-1 IS :"+book1.getIban());
			System.out.println("TITLE OF ALL BOOK-3 : "+book3.getTitle());
		}
    }
}
