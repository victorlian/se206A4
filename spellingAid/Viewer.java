package spellingAid;


/**
 * This interface has all the methods that needs to be
 * implemented in the mainGUI class so that the 
 * functionality classes can update the GUI classes.
 * (The GUI class is developed by Daniel)
 * 
 * @author victor
 *
 */
public interface Viewer {
	/**
	 * This method will allow instructions/words to be
	 * appended to the JTextArea.
	 * @param text
	 */
	public void appendText(String text);
	
	/**
	 * Methods manipulating Buttons.
	 */
	public void disableStartButton();
	public void enableStartButton();
	//submission buttons include: repeat+submit.
	public void disableSubmissionButtons();
	public void enableSubmissionButton();
	
	/**
	 * This method will pop up a message as a Dialogue/Option Pane.
	 * Types of message include:
	 * "Error", "Warning", "Info"
	 */
	public void popMessage(String msg, MessageType typeOfMessage);
	
	/**
	 * This method will be called when a quiz has finished.
	 */
	public void displayMainMenu();
	
	/**
	 * This method will be called when the user can have a video reward.
	 * It should pop up an option pane to allow the user to select if they
	 * want to play the video.
	 * 
	 * @return
	 * Should return a boolean indicate whether or not to play the video.
	 */
	public boolean videoOption();
	
	/**
	 * This method will be called when the user can be given the option to
	 * level up. 
	 * 
	 * @return
	 * Should return a boolean indicate whether or not to level up.
	 */
	public boolean levelUpOption();
	
}
