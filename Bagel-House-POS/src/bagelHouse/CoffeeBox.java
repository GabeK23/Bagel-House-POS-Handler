package bagelHouse;

import javafx.scene.control.RadioButton;
import javafx.scene.control.TitledPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

    
    /**
     * This will be a VBox that contains a TitledPane which contains
     * another VBox that holds radio buttons for bagels
     * 
     * @author Gabriel Kroger
     *
     */
    public class CoffeeBox extends VBox {
        // The following constants are used to indicate
        // the cost of each type of toppings.
        public final double NONE = 0.00;
        public final double REGULAR_COFFEE = 1.25;
        public final double DECAF_COFFEE = 1.25;
        public final double CAPPUCCINO = 2.00;
        
    
        // The following variables will reference radio
        // buttons for white and whole wheat bagels.
        private RadioButton rdonone;
        private RadioButton rdoregularCoffee;
        private RadioButton rdodecafCoffee;
        private RadioButton rdocappuccino;
        
    
        // The following variable will reference a
        // ToggleGroup object to group the radio buttons.
        private ToggleGroup tg;
    
        /**
         *  Constructor
         */
        public CoffeeBox()  {
    
            // Create group for the radio buttons.
            tg = new ToggleGroup();
    
            // Create the radio buttons.
            rdonone = new RadioButton("None");
            rdoregularCoffee = new RadioButton("Regular Coffee");
            rdodecafCoffee = new RadioButton("Decaf Coffee");
            rdocappuccino= new RadioButton("Cappuccino");
    
            rdonone.setToggleGroup(tg);
            rdoregularCoffee.setToggleGroup(tg);
            rdodecafCoffee.setToggleGroup(tg);
            rdocappuccino.setToggleGroup(tg);
            rdonone.setSelected(true);
    
            // Make another VBox to hold the radio buttons.
            VBox vbox = new VBox(10);  // with 10 pixel spacing
            vbox.setStyle("-fx-background-color: BlanchedAlmond;");
            this.setStyle("-fx-background-color: BlanchedAlmond;");  // so outer VBox same color
            vbox.getChildren().add(rdonone);
            vbox.getChildren().add(rdoregularCoffee);
            vbox.getChildren().add(rdodecafCoffee);
            vbox.getChildren().add(rdocappuccino);
    
            // Make a TitledPane to hold the VBox of radio buttons
            TitledPane tp = new TitledPane("Coffee", vbox);
            tp.setCollapsible(false);
            this.getChildren().add(tp); // add the titled pane to this VBox
        }
    
        /**
         *  The getBagelCost method returns the cost of
         *  the selected coffee.
         */
        public double getCoffeeCost(){
        
            // The following variable will hold the cost
            // of the selected coffee.
            double coffeeCost = 0.0;
    
            // Determine which coffee is selected.
            if (rdonone.isSelected())
            coffeeCost = NONE;
            else if (rdoregularCoffee.isSelected())
            coffeeCost = REGULAR_COFFEE;
            else if (rdodecafCoffee.isSelected())
            coffeeCost = DECAF_COFFEE;
            else if (rdocappuccino.isSelected())
            coffeeCost = CAPPUCCINO;
            
            // Return the cost of the selected coffee.
            return coffeeCost;
        }
    }
    