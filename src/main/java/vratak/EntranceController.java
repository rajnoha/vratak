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
     
	//private List<User> users = new ArrayList<User>();
	//tu vytvorim instancnu premennu
	private UserDao userDao  = new UserDao();
	
//	public EntranceController() {
//		User u = new User();
//		u.setChipId("112345");
//		u.setMeno("Kamil");
//		userDao.addUser(u);
//		u = new User();
//		u.setChipId("985461");
//		u.setMeno("Vlado");
//		userDao.addUser(u);
//	}
	    @FXML
	    private ListView<User> usersListView;
	    
	    @FXML
	    private TextField chipIdTextField;

	    @FXML
	    private TextField nameTextField;

	    @FXML
	    private Button addButton;
	   	       
	    private UserFxModel editedUser = new UserFxModel();
	    
	    @FXML
	    void initialize() {
	    	System.out.println("inicializujem");
	    	
			chipIdTextField.textProperty().bindBidirectional(editedUser.chipIdProperty());
			 nameTextField.textProperty().bindBidirectional(editedUser.nameProperty());
			// usersListView.setItems(FXCollections.observableArrayList(userDao.getAll()));

			 addButton.setOnAction(new EventHandler<ActionEvent>() {

			 @Override
			 public void handle(ActionEvent event) {
			// ulozit noveho pouzivatela
		    //System.out.println("Hura, podarilo sa");
			 userDao.addUser(editedUser.getUser());
			 
			 System.out.println("Hura, podarilo sa1");
			 usersListView.setItems(FXCollections.observableArrayList(userDao.getAll()));
			 System.out.println("Hura, podarilo sa2");
			 usersListView.getItems().add(editedUser.getUser());
			 }

//			addButton.setOnAction(new EventHandler<ActionEvent>() {
//
//				@Override
//				public void handle(ActionEvent event) {
//					System.out.println("Hura, podarilo sa");
//					usersListView.getItems().add(editedUser.getUser());
//				}

		});
		}
}