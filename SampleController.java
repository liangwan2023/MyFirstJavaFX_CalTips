import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class SampleController {

    @FXML 
    private Text actiontarget;

    @FXML
    private TextField payBill;

    // @FXML
    // private TextField tips;
    @FXML
    private TextField payTips;
    @FXML
    private Label tipsOutput;
    
     @FXML
    private Label billOutput;
    @FXML
    private Label calculate;

    
    
    @FXML 
   
  protected void handleSubmitButtonAction(ActionEvent event) {
     
        billOutput.setText("Bill amount:" + payBill.getText());
         double billValue = Double.parseDouble(payBill.getText());
         double tipsValue = (Double.parseDouble(payTips.getText())*billValue)/100;
        //tipsOutput.setText("tips amount:" + (Double.parseDouble(payTips.getText())*billValue)/100);
        tipsOutput.setText("tips amount:" + tipsValue);
    
        double result = billValue + tipsValue;

        calculate.setText("Sum is "+ result);
      
    }
}