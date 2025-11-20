import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    private saveManager saveManager = new saveManager();

    public void start() {
        if (!saveManager.saveExists()) {
            handleNoSave();
        } else {
            showMainMenu();
        }
    }
    
    private void handleNoSave() {
        
    }

    private void showMainMenu() {

    }
}
