package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {
	
	@FXML
	private MenuItem menuItemContatos;
	
	
	@FXML
	private MenuItem menuItemPratos;
	
	
	@FXML
	private MenuItem menuItemSobre;
	
	@FXML
	public void onMenuItemContatosAction() {
		System.out.println("onMenuItemContatosAction");
	}
	
	@FXML
	public void onMenuItemPratosAction() {
		System.out.println("onMenuItemPratosAction");
	}
	
	@FXML
	public void onMenuItemSobreAction() {
		System.out.println("onMenuItemSobreAction");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}

}
