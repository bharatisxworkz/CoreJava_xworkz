class LibraryTester{

public static void main( String bookName[])
{
System.out.println( " Main started ");
System.out.println( " Book names are added ");
 

Library.addBookName( " American Gods ");
Library.addBookName( " Thirteen reasons why  ");
Library.addBookName( " Ready player one ");
Library.addBookName( " Romeo and juliet ");
Library.addBookName( " Lord of the flies ");
Library.addBookName( " Wonder ");
Library.addBookName( " The Alienist ");
Library.addBookName( " Beauty and the Beast ");
Library.addBookName( " A Tale of Two Cities");
Library.addBookName( " The Little Prince ");
Library.addBookName( " Dream of the Red Chamber ");
Library.addBookName( " The Hobbit ");
Library.addBookName( " A Message to Garcia ");
Library.addBookName( " Angels & Demons");
Library.addBookName( " Gone with the Wind");

Library.getBookNames();
System.out.println( " updated book name is : ");

		boolean isUpdated = Library.updateBookName( " Gone with the Wind ", " The Purpose Driven Life ");
System.out.println( " is book name is updated :" + isUpdated);
Library.getBookNames();

System.out.println( " Main ended ");
}
}