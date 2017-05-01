import java.util.Optional;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
/**
 * 
 * @author SM Nazibullah Touhid
 * Prof. Tanes Kanchanawanchai
 * CSC 200
 * May 1, 2017
 * License: GMU
 * 
 *Purpose of the program:
 *To understand use class
 *To understand use methods
 */
public class DayMain extends Application {
	public void start(Stage primaryStage) {
		Day day = new Day();
		String days[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		ChoiceDialog<String> dialog = new ChoiceDialog<>(days[0], days[1], days[2], days[3], days[4], days[5], days[6]);
		dialog.setHeaderText("Choose Current Day");
		dialog.setTitle("Current Day");
		Optional<String> result = dialog.showAndWait();
		day.setDay(dialog.getResult());
		if (result.isPresent()) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Curreny Day");
			alert.setHeaderText("The Current Day is");
			alert.setContentText(day.toString());
			alert.showAndWait();

			alert.setTitle("Next Day");
			alert.setHeaderText("The Next Day is");
			alert.setContentText(day.getNextDay(day.getDay()) + "!");
			alert.showAndWait();

			alert.setTitle("Previous Day");
			alert.setHeaderText("The Previous Day is");
			alert.setContentText(day.getPreviousDay(day.getDay()) + "!");
			alert.showAndWait();

			TextInputDialog input = new TextInputDialog();
			input.setTitle("Add Days");
			input.setHeaderText("How many days You want to add to the current Day?");
			input.showAndWait();
			int numofDay = Integer.parseInt(input.getResult());

			alert.setTitle("Added Day");
			alert.setHeaderText(numofDay + " days after Today is ");
			alert.setContentText(day.getAddedDay(day.getDay(), numofDay) + "!");
			alert.showAndWait();

		}

	}

}