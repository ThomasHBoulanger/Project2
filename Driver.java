import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 * Project #2
 * CS 2334, Section 010 - Lab 13
 * Feb 19, 2016
 * <P>
 * This is the driver class for the program, contains the main method. It creates an 
 * ArrayList of Movie objects, an ArrayList of Series objects, and an ArrayList of Object 
 * objects. Uses inputStream to read input from the user. Contains methods to search the
 * ArrayLists of Series and Movie objects to see if user input matches any information of the
 * objects in the list. Contains numerous sort methods for sorting the ArrayLists in a variety
 * of ways, by title and by year. Contains a save method used to save sorted information into
 * a text file.
 * </P>
 * @version 1.0
 */
public class Driver {
	/** ArrayList of Movie objects, each element contains a Movie object containing
	 * information about the movie such as  movie title, year released along with a Roman numeral
	 * to indicate which movie it is if multiple movies with the same name were released during
	 * the year, whether it went to video, theaters or aired on TV, and the year that it was 
	 * released
	 */
	public ArrayList<Movie> movieList;
	
	/** ArrayList of Series objects, each element contains a Series object containing
	 * information about the series such as series title, year the series debutted, the year
	 * the episode was released, the title of the episode, the season the episode was in, and
	 * the episode number
	 */
	public ArrayList<Series> seriesList;
	
	/** ArrayList of Object objects, each element contains a Object object either being a Movie
	 * object or Series object, used when both want to be sorted and searched through at the same
	 * time
	 */
	public ArrayList<Object> bothMS;
	
	/* String used for user input, used to search for partial or complete matches in the lists*/
	private String userInput;
	
	/**
	 * Main method to run program. Reads information into String using inputStream so that the 
	 * user can search through the ArrayList for partial or complete matches. Asks the user a
	 * series of questions so that the program can determine which ArraysLists to sort, how
	 * to sort them, to use partial or complete matches
	 * @param args Program argument unused
	 */
	public static void main(String[] args) {
		
	}
	
	/**
	 * A method used to search the ArrayList of Movie objects for a movie with the title 
	 * that the user enters
	 * @param movieList An  ArrayList of Movie objects, each element contains a Movie object 
	 * containing information about the movie such as title, year released along with 
	 * a Roman numeral to indicate which movie it is if multiple movies with the same name
	 * were released, whether it went to video, theaters or aired on TV, and the year 
	 * that it was released
	 * @param userInput A variable used to store the value of a movie title the user wishes
	 * to search the ArrayList for
	 * @return The method has a void return type because the method searches if there are any
	 * matches (partial or complete) to the movie title the user entered in the ArrayList
	 * of Movie objects
	 * <dd>PRE - There must be an ArrayList of Movie objects and a String variable containing
	 * the title of a movie the user wishes to search for
	 * <dd>POST - The method searches through the ArrayList to see if any of the Movie objects
	 * have the same title that the user input to the method and prints out whether or not it
	 * does
	 */
	public static void searchMovie(ArrayList<Movie> movieList, String userInput) {
		
	}
	
	/**
	 * A method used to search the ArrayList of Series objects for a series with the information
	 * that the user enters
	 * @param movie An  ArrayList of Series objects, each element contains a Series object 
	 * containing information about the series such as title, debut year, episode release year,
	 * episode title, season number and episode number
	 * @param userInput A variable used to store the value of a String of series information
	 * the user wishes to search the ArrayList for
	 * @return The method has a void return type because the method searches if there are any
	 * matches (partial or complete) to the series the user entered in the ArrayList
	 * of Series objects
	 * <dd>PRE - There must be an ArrayList of Series objects and a String variable containing
	 * the series the user wishes to search for
	 * <dd>POST - The method searches through the ArrayList to see if any of the Series objects
	 * have the same information that the user input to the method and prints out whether or
	 * not it does
	 */
	public static void searchSeries(ArrayList<Series> seriesList, String userInput) {
		
	}
	

	/**
	 * A method used to sort the ArrayList of Movie objects by title in alphabetical order
	 * @param movieList An ArrayList of Movie objects, each a different movie from a text
	 * file
	 * @return The method has a void return type because the method just sorts the ArrayList
	 * of Movies by title in alphabetical order
	 * <dd>PRE - There must be an ArrayList of Movie objects to be sorted
	 * <dd>POST - The method sorts the ArrayList in alphabetical order using the using the 
	 * compareTo method
	 */
	public static void sortMovieTitle(ArrayList<Movie> movieList) {
		
	}
	
	/**
	 * A method used to sort the ArrayList of Series objects by title in alphabetical order
	 * @param seriesList An ArrayList of Series objects, each a different series from a text
	 * file
	 * @return The method has a void return type because the method just sorts the ArrayList
	 * of Series by title in alphabetical order
	 * <dd>PRE - There must be an ArrayList of Series objects to be sorted
	 * <dd>POST - The method sorts the ArrayList in alphabetical order using the using the 
	 * compareTo method
	 */
	public static void sortSeriesTitle(ArrayList<Series> seriesList) {
		
	}
	
	/**
	 * A method used to sort the ArrayList of Movie objects by year in normal numerical
	 * ordering
	 * @param movieList An ArrayList of Movie objects, each a different movie from a text
	 * file
	 * @return The method has a void return type because the method just sorts the ArrayList
	 * of Movies by the normal numerical ordering
	 * <dd>PRE - There must be an ArrayList of Movie objects to be sorted
	 * <dd>POST - The method sorts the ArrayList in numerical order by year using the using the 
	 * MOVIE_YEAR_COMPARATOR subclass in the Movie class
	 */
	public static void sortMovieYear(ArrayList<Movie> movieList) {
		
	}
	
	/**
	 * A method used to sort the ArrayList of Series objects by year in normal numerical
	 * ordering
	 * @param seriesList An ArrayList of Series objects, each a different series from a text
	 * file
	 * @return The method has a void return type because the method just sorts the ArrayList
	 * of Series objects by the normal numerical ordering
	 * <dd>PRE - There must be an ArrayList of Series objects to be sorted
	 * <dd>POST - The method sorts the ArrayList in numerical order by year using the using the 
	 * SERIES_YEAR_COMPARATOR subclass in the Series class
	 */
	public static void sortSeriesYear(ArrayList<Series> seriesList) {
		
	}

	/**
	 * Method used to save sorted information in an ArrayList of Object objects onto a text file,
	 * elements can be either Series or Movie objects sorted by either title or year depending
	 * on the choice of the user
	 * @param An ArayList of Object objects containing either Movie or Series objects in sorted
	 * order to be saved to a text file
	 */
	public static void save(ArrayList<Object> bothMS) {
		
	}
}
