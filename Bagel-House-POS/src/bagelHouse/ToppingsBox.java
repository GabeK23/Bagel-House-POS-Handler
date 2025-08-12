package bagelHouse;

import javafx.scene.control.RadioButton;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

    
    /**
     * This will be a VBox that contains a TitledPane which contains
     * another VBox that holds radio buttons for toppingss
     * 
     * @author Gabriel Kroger
     *
     */
    public class ToppingsBox extends VBox {
        // The following constants are used to indicate
        // the cost of each type of toppings.
        public final double CREAM_CHEESE = 0.50;
        public final double BUTTER = 0.25;
        public final double PEACH_JELLY = 0.75;
        public final double BLUEBERRY_JAM = 0.75;
        
    
        // The following variables will reference radio
        // buttons for white and whole wheat toppingss.
        private RadioButton rdocreamCheese;
        private RadioButton rdobutter;
        private RadioButton rdopeachJelly;
        private RadioButton rdoblueberryJam;
        
    
        // The following variable will reference a
        // ToggleGroup object to group the radio buttons.
        private ToggleGroup tg;
    
        /**
         *  Constructor
         */
        public ToppingsBox()  {
    
            // Create group for the radio buttons.
            tg = new ToggleGroup();
    
            // Create the radio buttons.
            rdocreamCheese = new RadioButton("Cream Cheese");
            rdobutter = new RadioButton("Butter");
            rdopeachJelly = new RadioButton("Peach Jelly");
            rdoblueberryJam = new RadioButton("Blueberry Jam");
    
            rdocreamCheese.setToggleGroup(tg);
            rdobutter.setToggleGroup(tg);
            rdopeachJelly.setToggleGroup(tg);
            rdoblueberryJam.setToggleGroup(tg);
            rdobutter.setSelected(true);
    
            // Make another VBox to hold the radio buttons.
            VBox vbox = new VBox(10);  // with 10 pixel spacing
            vbox.setStyle("-fx-background-color: BlanchedAlmond;");
            this.setStyle("-fx-background-color: BlanchedAlmond;");  // so outer VBox same color
            vbox.getChildren().add(rdocreamCheese);
            vbox.getChildren().add(rdobutter);
            vbox.getChildren().add(rdopeachJelly);
            vbox.getChildren().add(rdoblueberryJam);
    
            // Make a TitledPane to hold the VBox of radio buttons
            TitledPane tp = new TitledPane("Toppings", vbox);
            tp.setCollapsible(false);
            this.getChildren().add(tp); // add the titled pane to this VBox
        }
    
        /**
         *  The gettoppingsCost method returns the cost of
         *  the selected toppings.
         */
        public double getToppingsCost(){
        
            // The following variable will hold the cost
            // of the selected toppings.
            double toppingsCost = 0.0;
    
            // Determine which toppings is selected.
            if (rdocreamCheese.isSelected())
            toppingsCost = CREAM_CHEESE;
            else if (rdobutter.isSelected())
            toppingsCost = BUTTER;
            else if (rdopeachJelly.isSelected())
            toppingsCost = PEACH_JELLY;
            else if (rdoblueberryJam.isSelected())
            toppingsCost = BLUEBERRY_JAM;
            
            // Return the cost of the selected toppings.
            return toppingsCost;
        }
    }
    