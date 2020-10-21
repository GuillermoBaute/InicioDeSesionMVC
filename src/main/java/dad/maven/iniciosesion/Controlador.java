package dad.maven.iniciosesion;

public class Controlador {

	private Vista view = new Vista();

	public Controlador() {
	}

	public Vista getView() {
		return view;
	}

	public void setView(Vista view) {
		this.view = view;
	}

}
