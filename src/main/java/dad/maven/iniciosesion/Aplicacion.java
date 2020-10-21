package dad.maven.iniciosesion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aplicacion extends Application {

	private Controlador controlador = new Controlador();

	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene escena = new Scene(controlador.getView(), 335, 150);

		primaryStage.setScene(escena);
		primaryStage.setTitle("Iniciar sesión");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
