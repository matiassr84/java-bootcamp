package MP3payer;
// javazoom.jl.player.advanced.* library for the mp3 player
import javazoom.jl.player.advanced.*;
import javax.swing.JFileChooser;
import java.io.File;

public class MP3manager {
	public static void main(String[] args){
		AdvancedPlayer player;
		JFileChooser  fileselector= new JFileChooser();
	int a=fileselector.showOpenDialog(null);
	if(a==JFileChooser.APPROVE_OPTION){
		File file= fileselector.getSelectedFile();
		try{
			player = new AdvancedPlayer(new FileImputStream(file));
			player.play();
		}
		catch(Exception e){
			System.out.println("Error");
		}
	}
	}

}
