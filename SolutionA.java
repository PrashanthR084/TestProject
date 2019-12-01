import java.util.Arrays;
import java.util.Stack;

public class PartA {

	// Initializing new Stack
	private static Stack<String> history = new Stack<String>();

	// Return true if Stack empty, else false
	public static Boolean isBrowsingHistoryEmpty() {
		boolean variable = true;
		if (history.empty()) {
			variable = true;
		} else
			variable = false;
		return variable;
	}

	// Return top of Stack. (Peek)
	public static String mostRecentlyVisitedSite() {
		String historyOfSite = history.peek();
		return historyOfSite;
	}

	// Add to Stack (Push)
	public static void addSiteToHistory(String url) {
		history.push(url);
	}

	// Pop Stack, to remove items
	public static void goBackInTime(int n) {
		for (int i = 0; i < n; i++) {
			history.pop();
		}
	}

	// Easy method to print elements of Stack
	public static void printBrowsingHistory() {
		System.out.println(Arrays.toString(history.toArray()));
	}

	public static void main(String[] args) {
		System.out.println(isBrowsingHistoryEmpty()); // Checking if Browsing History is Empty
		addSiteToHistory("www.google.co.in"); // Navigating to Google
		addSiteToHistory("www.facebook.com"); // Navigating to Facebook
		addSiteToHistory("www.upgrad.com"); // Navigating to UpGrad
		System.out.println(isBrowsingHistoryEmpty()); // Checking if Browsing History is Empty
		System.out.println(mostRecentlyVisitedSite()); // Fetching most recently visited site (UpGrad)
		addSiteToHistory("www.youtube.com"); // Navigating to Youtube
		goBackInTime(2); // Going back by 2 sites
		addSiteToHistory("www.yahoo.com"); // Navigating to UpGrad platform site
		System.out.println(mostRecentlyVisitedSite()); // Fetching most recently visited site (UpGrad Learn Platform)
		printBrowsingHistory(); // Printing browsing history

	}

}