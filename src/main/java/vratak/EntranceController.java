package vratak;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class EntranceController {

	private List<User> users = new ArrayList<User>();
	
	public EntranceController() {
		User u = new User();
		u.setChipId("112345");
		u.setMeno("Kamil");
		users.add(u);
		u = new User();
		u.setChipId("985461");
		u.setMeno("Vlado");
		users.add(u);
	}
	
	    @FXML
	    private TextField chipIdTextField;

	    @FXML
	    private TextField nameTextField;

	    @FXML
	    private Button addButton;
	    
	    @FXML
	    private ListView<User> usersListView;
	    
	    private UserFxModel editedUser = new UserFxModel();
	    
	    @FXML
	    void initialize() {
	    	
			chipIdTextField.textProperty().bindBidirectional(editedUser.chipIdProperty());
			nameTextField.textProperty().bindBidirectional(editedUser.nameProperty());
			usersListView.setItems(FXCollections.observableArrayList(users));
			
			addButton.setOnAction(new EventHandler<ActionEvent>() {
				
				@Override
				public void handle(ActionEvent event) {
					// ulozit noveho pouzivatela
					usersListView.getItems().add(editedUser.getUser());
				}
			});
	    }

}
