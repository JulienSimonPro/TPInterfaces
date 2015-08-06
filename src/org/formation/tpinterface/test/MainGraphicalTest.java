package org.formation.tpinterface.test;

import org.formation.tpinterface.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainGraphicalTest extends Application {

	@Override
	public void start(Stage args) throws Exception {
		Circle cercle = new Circle(100);

		Pane pane = new Pane();
		pane.getChildren().add(cercle.getShape());
		Scene scene = new Scene(pane, 250, 250);
		args.setScene(scene);
		args.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
