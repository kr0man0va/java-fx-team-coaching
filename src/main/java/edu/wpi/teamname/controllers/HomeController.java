package edu.wpi.teamname.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class HomeController {

  final String SECRET_PASSWORD = "team coaching";

  /** Initialize controller by FXML Loader. */
  @FXML
  public void initialize() {
    System.out.println("I am from HomeController.");

//    submit.setOnMouseClicked(event -> {});
  }

  /**
   * FXML Injected Method that handles the submit button.
   *
   * @param event The event that triggered the method.
   */
    @FXML
    private void handleButtonPress(ActionEvent event) {
      /*
       1. Get the text the user input
       2. Validate it against the correct information
       3. Display to the user whether their input was correct or not
      */

    }

  /**
   * Checks if a user's password is correct.
   *
   * @param input The user's password.
   * @return True if the password is correct.
   */
  private boolean validate(final String input) {
    return input.equals(SECRET_PASSWORD);
  }
}
