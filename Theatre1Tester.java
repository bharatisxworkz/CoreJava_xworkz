class Theatre1Tester{

public static void main( String movie[])
{
System.out.println( " Main started ");
System.out.println( " Movie names are added ");

Theatre1.addMovieName( " Yajamana ");
Theatre1.addMovieName( " KGF ");
Theatre1.addMovieName( " Kranthi ");
Theatre1.addMovieName( " Kantara ");
Theatre1.addMovieName( " RRR ");
Theatre1.addMovieName( " Vamshi ");
Theatre1.addMovieName( " Mungaru Male ");
Theatre1.addMovieName( " Galipata ");
Theatre1.addMovieName( " Bhajarangi ");
Theatre1.addMovieName( " Suryavamshi ");


Theatre1.getMovieNames();
System.out.println( " updated movie name is:");
Theatre1.updateMovieName( " Vamshi ", " Milana ");
Theatre1.getMovieNames();


System.out.println( " Main ended ");
}
}