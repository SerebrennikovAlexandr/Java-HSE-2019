package graphical_interface;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

//The controller class for Main scene
public class MainController {

    /*
     * Fields
     */

    @FXML
    private Button buttonStart;

    @FXML
    private Button buttonRules;

    /*
     * METHODS
     */

    /**
     * Method, that is invoked by pressing or clicking Rules button.
     * Changes the Main scene to Rule scene.
     * @param event
     * @throws Exception
     */
    public void onButtonRulesClicked(ActionEvent event) throws Exception {
        Parent rulesRoot = FXMLLoader.load(getClass().getResource("fxml/rules.fxml"));
        Scene rulesScene = new Scene(rulesRoot, 720, 480);
        rulesScene.getStylesheets().add("rules.css");

        Stage currentStage = (Stage)((Node)event.getSource()).getScene().getWindow();

        currentStage.setScene(rulesScene);
        currentStage.show();
    }

    /**
     * Method, that is invoked by pressing or clicking Start game button.
     * Changes the Main scene to Game scene and starts game.
     * @param event
     * @throws Exception
     */
    public void onButtonStartClicked(ActionEvent event) throws Exception {
        Parent rulesRoot = FXMLLoader.load(getClass().getResource("fxml/game.fxml"));
        Scene rulesScene = new Scene(rulesRoot, 720, 480);
        rulesScene.getStylesheets().add("game.css");

        Stage currentStage = (Stage)((Node)event.getSource()).getScene().getWindow();

        currentStage.setScene(rulesScene);
        currentStage.show();
    }
}
