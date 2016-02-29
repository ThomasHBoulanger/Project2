import java.util.Arrays;
import java.util.Comparator;
import java.io.IOException;

/**
 * Project #2
 * CS 2334, Section 010 - Lab 13
 * Feb 19, 2016
 * <P>
 * This is a class that contains constructors for Movie objects. Contains a method to read in
 * from a text file. Contains a method to parse Strings into separate String variable used to
 * construct objects. Contains get methods to return variable values. Contains a compareTo
 * method since it implements Comparable to compare objects. Contains a subclass to compare
 * Movie objects by year instead of title.
 * </P>
 * @version 1.0
 */
public class Movie implements Comparable<Movie>{
	private String movieTitle;
	private String year;
	private String releaseType;
	private String[] movieInfo;
	
	/**
	 * Constructor for Movie object when all three components are present in the title
	 * @param movieTitle The title of the movie
	 * @param releaseType Whether the movie aired on TV or went straight to video
	 * @param year The year the movie was released, with a roman numeral if two movies have the 
	 * same name on the same year
	 */
	public Movie(String movieTitle, String year, String releaseType) {
		this.movieTitle = movieTitle;
		this.year = year;
		this.releaseType = releaseType;
	}

	
	/**
	 * Returns the value stored in movieTitle 
	 * @return Returns the value stored in a String variable
	 * <dd>PRE - a String variable movieTitle exists
	 * <dd>POST - Returns the String stored in the variable movieTitle
	 */
	public String getMovieTitle() {
		return movieTitle;
	}
	
	/**
	 * Returns the value stored in year 
	 * @return Returns the value stored in a String variable
	 * <dd>PRE - a String variable year exists
	 * <dd>POST - Returns the String stored in the variable year
	 */
	public String getYear() {
		return year;
	}
	
	/**
	 * Returns the value stored in releaseType 
	 * @return Returns the value stored in a String variable
	 * <dd>PRE - a String variable releaseType exists
	 * <dd>POST - Returns the String stored in the variable releaseType
	 */
	public String getReleaseType() {
		return releaseType;
	}
	
	/**
	 * Reads information in file into an Array of Strings as one per line in document
	 * as a solid string using FileReader and BufferedReader
	 * @param movieInfo - an Array of Strings used to store contents of the text file
	 * @return The method has a void return type because the method just reads the text file 
	 * and stores its contents in an Array of Strings, one movie per array element
	 * @exception IOException must be thrown by any method that does input/output,
	 * this method does input using FileReader and BufferedReader
	 * <dd>PRE - There must be an Array of Strings so that the method will have a place to
	 * store input
	 * <dd>POST - The method reads information from a text file and stores the 
	 * information in it into an Array of Strings, one line per element, which is to later be
	 * parsed into separate variables
	 */
	public static void readFile(String[] movieInfo) throws IOException {
		
	}
	
	/**
	 * Parses a String Array of movie information one element at a time into different
	 * information to be stored in variables. These variables are then used to construct
	 * Movie objects to be stored in an ArrayList. Parses using substring.
	 * @param movieInfo - A String Array containing the movie information held on a single line
	 * for a movie from the text file 
	 * @return The method has a void return type because the method just parses elements of a
	 * String Array into Strings and assigns them to variables, each a different 
	 * component of the movie
	 * <dd>PRE - There must be an Array of Movie information, the elements of this Array are 
	 * set to a String variable, one per line in the text file
	 * <dd>POST - The method parses the elements of a String Array into String variables, one
	 * for each of the components a movie in the text file may have so that they can be 
	 * used to construct a Movie object
	 */
	public void parseMovie(String[] movieInfo) {
		
	}
	
	/**
	 * This method from the comparable interface will compare the Movie object
	 * titles and see if there is a partial or complete match
	 * @param movie - This is a Movie object that this method will use for comparison
	 * @return int - a negative integer, zero, or a positive integer as this object
	 * is less than, equal to, or greater than the specified object
	 * <dt><b>Conditions:</b>
	 * <dd>PRE - Receives Movie object to compare
	 * <dd>POST - Returns an integer number to say if the titles match
	 */
	@Override
	public int compareTo(Movie movie) {
		return 0;
	}
	
	/**
	 * This is a subclass that compares Movie objects' year values and a returns a 
	 * negative integer, zero, or a positive integer as the first argument is less 
	 * than, equal to, or greater than the second. Used to sort movieList by year.
	 */
	public static final Comparator<Movie> MOVIE_YEAR_COMPARATOR = new Comparator<Movie>() {
		public int compare(Movie movie, Movie anotherMovie) {
			return 0;
		}
	};
}
