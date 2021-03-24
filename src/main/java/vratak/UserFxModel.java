package vratak;

import javafx.beans.InvalidationListener;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class UserFxModel {

	StringProperty chipId = new SimpleStringProperty() ;
	StringProperty name = new SimpleStringProperty(); 
	
	public String getChipId() {
		return chipId.get();
	}
	public void setChipId(String chipId) {
		this.setChipId(chipId);
	}
	public StringProperty chipIdProperty() {
		return chipId;
	}
	
	public String getName() {
		return name.get();
	}
	public void setName(String name) {
		this.setName(name);
	}
	public StringProperty nameProperty() {
		return name;
	}
	
	//generator Usera pre model
	public User getUser() {
		User user = new User(); 
		user.setChipId(getChipId());
		user.setMeno(getName());
		return user;
	}
	
}