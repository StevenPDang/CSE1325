import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class saveManager {

    private File saveFile = new File("save.txt");

    public boolean saveExists() {
        return saveFile.exists();
    }
    
    public Player load(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("save.txt"));
            Player p = new Player();
            
            // Assign csv fields to our player object
            String[] parts = reader.readLine().split(",");
            p.setName(parts[0]);
            p.setLevel(Integer.parseInt(parts[1]));
            p.setWealth(Double.parseDouble(parts[2]));
            p.setDay(Integer.parseInt(parts[3]));
            reader.close();
            return p;
        } 
        catch (IOException e) {
            System.out.println("An error occured while reading file: " + e.getMessage());
            return null;
        }
    }

    public void save(Player p){

    }
}
