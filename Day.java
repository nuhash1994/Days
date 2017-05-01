/**
 * 
 * @author SM Nazibullah Touhid
 * Prof. Tanes Kanchanawanchai
 * CSC 200
 * May 1, 2017
 * License: GMU
 */
public class Day {
	public String[] day = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
	public String currentDay;

	// sets the user input as the current day
	public void setDay(String currentDay) {
		this.currentDay = currentDay;
	}

	// gets the current day
	public String getDay() {
		return currentDay;
	}

	// returns the current day as String
	public String toString() {
		return "Current Day is " + this.currentDay + "!";
	}

	// gets the nextDay
	public String getNextDay(String currentDay) {
		String nextDay = "";
		for (int i = 0; i < day.length; i++) {
			if (currentDay.equals(day[i])) {
				nextDay = day[(i + 1) % 7];
				break;
			}
		}

		return nextDay;
	}

	// gets the previous day
	public String getPreviousDay(String currentDay) {
		String previousDay = "";
		for (int i = 1; i < day.length; i++) {
			if (currentDay.equals(day[i])) {
				previousDay = day[(i - 1)];
				break;
			} else if (currentDay.equals(day[0])) {
				previousDay = day[6];
				break;
			}
		}

		return previousDay;
	}

	// gets the added days
	public String getAddedDay(String currentDay, int numofDay) {
		String addedDay = "";
		for (int i = 0; i < day.length; i++) {
			if (currentDay.equals(day[i])) {
				addedDay = day[(i + numofDay) % 7];
				break;
			}

		}

		return addedDay;
	}

}
