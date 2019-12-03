package Composition;

import java.util.ArrayList;
import java.util.List;

public class Library
{
	
	private final List<Book> books;
	
	public Library(List<Book> bb)
	{
		this.books = bb;
	}
	
	public List<Book> getTotalBookInLibrary()
	{
		return books;
	}
	
	public static void main(String[] args)
	{
		Book b1 =new Book("romance","jk");
		Book b2 =new Book("hatred","og");
		
		List<Book> bks = new ArrayList<Book>();
		bks.add(b1);
		bks.add(b2);
		
		Library lb = new Library(bks);
		List<Book> ll=lb.getTotalBookInLibrary();
		{
			for(Book bb:ll)
			{
				System.out.println(bb.title+" : "+bb.author);
			}
		}
		
	}
	

}
