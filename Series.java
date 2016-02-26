import java.util.Arrays;
import java.util.Comparator;
import java.io.IOException;

/**
 * Project #2
 * CS 2334, Section 010 - Lab 13
 * Feb 19, 2016
 * <P>
 * This is a class that contains constructors for Series objects. Contains a method to read in
 * from a text file. Contains a method to parse Strings into separate String variable used to
 * construct objects. Contains get methods to return variable values. Contains a compareTo
 * method since it implements Comparable to compare objects. Contains a subclass to compare
 * Series objects by year instead of title.
 * </P>
 * @version 1.0
 */
public class Series implements Comparable<Series> {
	private String seriesTitle;
	private String seriesStartYear;
	private String seriesEndYear;
	private String episodeYear;
	private String episodeTitle;
	private String seasonNum;
	private String episodeNum;
	private String[] seriesInfo;
	
	/**
	 * Constructor for Series object when only two of the components are present in the title
	 * @param seriesTitle The title of the series
	 * @param seriesYear The year the series debutted
	 */
	public Series(String seriesTitle, String seriesYear) {
		
	}
	
	/**
	 *Constructor for Series object when all of the components are present in the title
	 * @param seriesTitle The title of the series
	 * @param seriesYear The year the series debutted
	 * @param episodeYear The year the episode debutted
	 * @param episodeTitle The title of the episode
	 * @param seasonNum The number of which season the episode is in
	 * @param episodeNum The number of the episode
	 */
	public Series(String seriesTitle, String seriesYear, String episodeYear, 
			String episodeTitle, String seasonNum, String episodeNum) {
		
	}
	

	/**
	 * Returns the value stored in seriesTitle 
	 * @return Returns the value stored in a String variable
	 * <dd>PRE - a String variable seriesTitle exists
	 * <dd>POST - Returns the String stored in the variable seriesTitle
	 */
	public String getSeriesTitle() {
		return seriesTitle;
	}
	

	/**
	 * Returns the value stored in seriesYear 
	 * @return Returns the value stored in a String variable
	 * <dd>PRE - a String variable seriesYear exists
	 * <dd>POST - Returns the String stored in the variable seriesYear
	 */
	public String getSeriesStartYear() {
		return seriesStartYear;
	}
	
	/**
	 * Returns the value stored in seriesYear 
	 * @return Returns the value stored in a String variable
	 * <dd>PRE - a String variable seriesYear exists
	 * <dd>POST - Returns the String stored in the variable seriesYear
	 */
	public String getSeriesEndYear() {
		return seriesEndYear;
	}

	/**
	 * Returns the value stored in episodeYear 
	 * @return Returns the value stored in a String variable
	 * <dd>PRE - a String variable episodeYeare exists
	 * <dd>POST - Returns the String stored in the variable episodeYear
	 */
	public String getEpisodeYear() {
		return episodeYear;
	}
	

	/**
	 * Returns the value stored in episodeTitle 
	 * @return Returns the value stored in a String variable
	 * <dd>PRE - a String variable episodeTitle exists
	 * <dd>POST - Returns the String stored in the variable episodeTitle
	 */
	public String getEpisodeTitle() {
		return episodeTitle;
	}
	

	/**
	 * Returns the value stored in seasonNum 
	 * @return Returns the value stored in a String variable
	 * <dd>PRE - a String variable seasonNum exists
	 * <dd>POST - Returns the String stored in the variable seasonNum
	 */
	public String getSeasonNum() {
		return seasonNum;
	}
	

	/**
	 * Returns the value stored in episodeNum 
	 * @return Returns the value stored in a String variable
	 * <dd>PRE - a String variable episodeNum exists
	 * <dd>POST - Returns the String stored in the variable episodeNum
	 */
	public String getEpisodeNum() {
		return episodeNum;
	}
	
	/**
	 * Reads information in file into an Array of Strings as one per line in document
	 * as a solid string using FileReader and BufferedReader
	 * @param seriesInfo - an Array of Strings used to store contents of the text file
	 * @return The method has a void return type because the method just reads the text file 
	 * and stores its contents in an Array of Strings, one series per array element
	 * @exception IOException must be thrown by any method that does input/output,
	 * this method does input using FileReader and BufferedReader
	 * <dd>PRE - There must be an Array of Strings so that the method will have a place to
	 * store input
	 * <dd>POST - The method reads information from a text file and stores the 
	 * information in it into an Array of Strings, one line per element, which is to later be
	 * parsed into separate variables
	 */
	public static void readFile(String[] seriesInfo) throws IOException {
		
	}
	
	/**
	 * Parses a String Array of series information one element at a time into different
	 * information to be stored in variables. These variables are then used to construct
	 * Series objects to be stored in an ArrayList. Parses using substring.
	 * @param seriesInfo - A String Array containing the series information held on a single line
	 * for a series from the text file 
	 * @return The method has a void return type because the method just parses elements of a
	 * String Array into Strings and assigns them to variables, each a different 
	 * component of the series
	 * <dd>PRE - There must be an Array of series information, the elements of this Array are 
	 * set to a String variable, one per line in the text file
	 * <dd>POST - The method parses the elements of a String Array into String variables, one
	 * for each of the components a series in the text file may have so that they can be 
	 * used to construct a Series object
	 */
	public void parseSeries(String[] seriesInfo) {
		
	}
	
	/**
	 * This method from the comparable interface will compare the Series object
	 * titles and see if there is a partial or complete match
	 * @param movie - This is a Series object that this method will use for comparison
	 * @return int - a negative integer, zero, or a positive integer as this object
	 * is less than, equal to, or greater than the specified object
	 * <dt><b>Conditions:</b>
	 * <dd>PRE - Receives Series object to compare
	 * <dd>POST - Returns an integer number to say if the titles match
	 */
	@Override
	public int compareTo(Series series) {
		return 0;
	}
	
	/**
	 * This is a subclass that compares Series objects' year values and a returns a 
	 * negative integer, zero, or a positive integer as the first argument is less 
	 * than, equal to, or greater than the second. Used to sort seriesList by year.
	 */
	public static final Comparator<Series> SERIES_YEAR_COMPARATOR = new Comparator<Series>() {
		public int compare(Series series, Series anotherSeries) {
			return 0;
		}
	};
}
