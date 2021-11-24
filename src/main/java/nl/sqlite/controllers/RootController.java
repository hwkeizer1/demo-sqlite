package nl.sqlite.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import net.rgielen.fxweaver.core.FxWeaver;
import net.rgielen.fxweaver.core.FxmlView;

@Controller
@FxmlView("root.fxml")
public class RootController implements Initializable {

	private final FxWeaver fxWeaver;
	
	@FXML
	private BorderPane rootWindow;
	
	public RootController(FxWeaver fxWeaver) {
		this.fxWeaver = fxWeaver;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	@FXML
	public void openAddAuthorForm(ActionEvent actionEvent) {
		fxWeaver.loadController(AuthorDialogController.class).show();
	}
}
