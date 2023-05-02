import javax.sound.sampled.*;
import java.io.IOException;

public class MuzikCal {
    public void muzikOynat(){

        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(MuzikCal.class.getResource("Safe And Sound.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            Thread.sleep(500000);
            clip.stop();
            clip.close();
        } catch (UnsupportedAudioFileException | InterruptedException | IOException | LineUnavailableException e) {
            throw new RuntimeException(e);
        }
    }

    public void muzikOynat2(){

        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(MuzikCal.class.getResource("Take Me Home, Country Roads.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            Thread.sleep(500000);
            clip.stop();
            clip.close();
        } catch (UnsupportedAudioFileException | InterruptedException | IOException | LineUnavailableException e) {
            throw new RuntimeException(e);
        }

    }
}