package javaintroduction;

public class LibraryBook {
	static String libraryName = "abc";
	static String librarianName ="Vinod";
	
	int bookId;
	String bookName;
	String authorName;
	int availableBooks;
	
	static void libraryDetails() {
		System.out.println("Library Name: "+ libraryName);
		System.out.println("Librarian Name: "+ librarianName);
			
		
	}
	static void changelibrarian() {
		librarianName = "hemanth";
		System.out.println("Updated Librarian Name: "+librarianName);
	}
	
	void displayBookdetails() {
		System.out.println("BookId: "+bookId);
		System.out.println("BookName: "+bookName);
		System.out.println("Author Name: "+authorName);
		System.out.println("Available Books: "+availableBooks);
		}
	void issueBook() {
		availableBooks--;
		System.out.println("Available Books: "+availableBooks);
	}
	public static void main(String[] args) {
		LibraryBook v = new LibraryBook();
		v.bookId =123;
		v.bookName = "heaven";
		v.authorName = "pqr";
		v.availableBooks = 10;
		
		libraryDetails();
		v.displayBookdetails();
		v.issueBook();
		
		System.out.println("----------------------------------------------------------------");
		
		LibraryBook v2 = new LibraryBook();
		v2.bookId =133;
		v2.bookName = "hell";
		v2.authorName = "rst";
		v2.availableBooks = 10;
		
		changelibrarian();

		v2.displayBookdetails();
		v2.issueBook();

		
		

	}

}
