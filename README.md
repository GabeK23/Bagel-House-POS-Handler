BagelPOSHandler
A JavaFX-based point-of-sale (POS) desktop application simulating a bagel shop ordering system.

Features:

Customizable order options including bagels, coffee, and toppings with single-selection radio buttons.

Dynamic price calculation with subtotal, tax, and total displayed in real time.

Modular UI design using JavaFX containers (VBox, HBox, TitledPane, BorderPane) for clean layout and ease of maintenance.

Interactive buttons to calculate totals and exit the application gracefully.

Input validation and event-driven programming for smooth user experience.

Components:

BagelBox: Select bagel type and price.

CoffeeBox: Choose coffee options with associated costs.

ToppingsBox: Pick one topping per order with pricing.

CostBox: Displays subtotal, tax, total, and contains Calculate/Exit buttons.

GreetingBox: Displays a welcome message at the top of the app.

BagelGUI: Main application class that ties all components together and handles event logic.

Technologies Used
Java 11+

JavaFX

Maven (optional for build management)

How to Run:

Clone the repository:
git clone https://github.com/GabeK23/Bagel-House-POS-Handler.git

Make sure you have the JavaFX SDK downloaded and extracted on your C:\ drive (for example, C:\javafx-sdk-21).

Update your launch.json file to point to the correct JavaFX SDK path. For example:

"vmArgs": "--module-path C:/javafx-sdk-21/lib --add-modules javafx.controls,javafx.fxml"
Open the project in your preferred Java IDE (Eclipse, VS Code, IntelliJ).

Run the BagelGUI class as a JavaFX application.

Interact with the UI to select bagels, coffee, toppings, and calculate order totals.