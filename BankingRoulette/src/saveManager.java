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
            String line;
            int field = 0;
            Player p = new Player();
            
            // Assign csv fields to our player object
            while ((line = reader.readLine()) != null){
                switch(field){
                    case 0:
                        p.setName(line);
                        break;
                    case 1:
                        p.setLevel(line) // needs to parse into integer
                        break;
                    case 2:
                        p.setWealth(line) // needs to parse into double
                        break;
                }
            } 
            reader.close();
        } 
        catch (IOException e) {
            System.out.println("An error occured while reading file: " + e.getMessage());
        }
    }

    public void save(Player p){

    }
}
