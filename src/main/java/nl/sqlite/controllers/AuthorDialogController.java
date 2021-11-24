package nl.sqlite.controllers;

import org.springframework.stereotype.Controller;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import net.rgielen.fxweaver.core.FxmlView;
import nl.sqlite.domain.Author;
import nl.sqlite.services.AuthorService;

@Slf4j
@Controller
@FxmlView("authorFormDialog.fxml")
public class AuthorDialogController {

	private final AuthorService authorService;

	public AuthorDialogController(AuthorService authorService) {
		this.authorService = authorService;
	}

	private Stage stage;

	@FXML
	private AnchorPane anchorPane;

	@FXML
	private TextField name;


	@FXML
	private Button okButton;

	@FXML
	private Button cancelButton;

	@FXML
	public void initialize() {
		this.stage = new Stage();
		stage.setScene(new Scene(anchorPane));
		stage.setTitle("Add author");
		name.requestFocus();
	}

	public void show() {
		stage.show();

	}

	@FXML
	public void okButtonAction() {
		Author author = new Author();
		author.setName(name.getText());
		
		authorService.save(author);
		stage.close();
	}

	@FXML
	public void cancelButtonAction() {
		stage.close();
	}
}
