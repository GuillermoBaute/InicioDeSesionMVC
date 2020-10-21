package dad.maven.iniciosesion;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class Vista extends BorderPane {

	private TextField tfUsuario, tfContraseña;
	private Button btAcceder, btCancelar;

	public Vista() {
		super();

		GridPane izquierda = new GridPane();
		izquierda.setPadding(new Insets(5));
		izquierda.setHgap(5);
		izquierda.setVgap(5);

		
		//Letras
		Label lbUsuario = new Label("Usuario:  ");
		Label lbContraseña = new Label("Contraseña:  ");
		//TextFields
		tfUsuario = new TextField();
		tfUsuario.setPromptText("Usuario");
		tfContraseña = new TextField();
		tfContraseña.setPromptText("Contraseña");

		izquierda.addRow(0, lbUsuario, tfUsuario);
		
		izquierda.addRow(1, lbContraseña, tfContraseña);

		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints(), };

		cols[0].setHalignment(HPos.CENTER);

		
		//Buttons Bajo
		btAcceder = new Button("Acceder");
		btCancelar = new Button("Cancelar");

		btAcceder.setMaxWidth(Double.MAX_VALUE);
		btCancelar.setMaxWidth(Double.MAX_VALUE);

		HBox bajo = new HBox();
		bajo.getChildren().addAll(btAcceder, btCancelar);
		bajo.setSpacing(5);
		bajo.setPadding(new Insets(5, 10, 0, 10));

		this.setTop(izquierda);
		this.setCenter(bajo);
	}

	public TextField getTfUsuario() {
		return tfUsuario;
	}

	public void setTfUsuario(TextField tfUsuario) {
		this.tfUsuario = tfUsuario;
	}

	public TextField getTfContraseña() {
		return tfContraseña;
	}

	public void setTfContraseña(TextField tfContraseña) {
		this.tfContraseña = tfContraseña;
	}

	public Button getBtAcceder() {
		return btAcceder;
	}

	public void setBtAcceder(Button btAcceder) {
		this.btAcceder = btAcceder;
	}

	public Button getBtCancelar() {
		return btCancelar;
	}

	public void setBtCancelar(Button btCancelar) {
		this.btCancelar = btCancelar;
	}
	
	
	
}
