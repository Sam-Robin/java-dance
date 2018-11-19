import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * 
 */

/**
 * A controller for the dance show programme generator system.
 * This controller includes the 4 features that the intended
 * prototype system is expected to have.
 * 
 * @author Sylvia Wong
 * @version 29/10/2018
 */
public class Controller {
	
	private
		List<String> dances;
		List<String> danceGroups;
		List<String> runningOrder;
	
	public Controller() {
		//instantiate fields
		this.dances = new ArrayList<>();
		this.danceGroups = new ArrayList<>();
		this.runningOrder = new ArrayList<>();
		
		//set the lists
		//use a relative path to find the files
		String pathToProject = new File("").getAbsolutePath();
		String filePath = pathToProject + "\\Coursework\\bin\\danceShowData_dances.csv";
		dances = 		readFromFiles(dances, filePath);
		filePath = pathToProject + "\\Coursework\\bin\\danceShowData_danceGroups.csv";
		danceGroups = 	readFromFiles(danceGroups, filePath);
		filePath = pathToProject + "\\Coursework\\bin\\danceShowData_runningOrder.csv";
		runningOrder = 	readFromFiles(runningOrder, filePath);
		
		//output lists to the console
		System.out.println("--DANCES--");
		for (int x = 0; x < dances.size(); x++) {
			System.out.println(dances.get(x));
		}
		
		System.out.println("--DANCE GROUPS--");
		for (int x = 0; x < danceGroups.size(); x++) {
			System.out.println(danceGroups.get(x));
		}
		
		System.out.println("--RUNNING ORDER--");
		for (int x = 0; x < runningOrder.size(); x++) {
			System.out.println(runningOrder.get(x));
		}
	}
	
	/**
	 * Lists the names of all performers in a specified dance.
	 * @param dance	a specified dance in the dance show
	 * @return the name of all performers that are in the specified dance. 
	 */
	public String listAllDancersIn(String dance) {
		return null;
	}
	
	/**
	 * Lists all dance numbers and the name of the respective performers in alphabetical order.
	 * @return	a String representation of dance numbers 
	 * 			and the name of the respective performers in alphabetical order
	 */
	public String listAllDancesAndPerformers() {
		return null;
	}

	/**
	 * Checks feasibility of a given running order.
	 * @param filename	the name of a tab-separated CSV file containing a proposed running order
	 * @return	a String representation of potential issues
	 */
	public String checkFeasibilityOfRunningOrder(String filename) {
		return null;
	}
	
	/**
	 * Generates a running order of the dances for the dance show.
	 * @return	a String representation of the generate running order
	 */
	public String generateRunningOrder() {
		return null;
	}
	
	/**
	 * Converts data from a csv file into a List object
	 * @param list 	the List<> to add data to
	 * @param path	the path to the list on the file system
	 * @return 		a list with all data from the csv file
	 */
	private List<String> readFromFiles(List<String> list, String path) {
		//read from the dances csv file
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line = null;
			
			//set each element in the ArrayList to a line from the csv
			while ((line = br.readLine()) != null) {
				list.add(line);
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return list;
	}
}
