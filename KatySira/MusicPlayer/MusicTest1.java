package KatySira.MusicPlayer;
import javax.sound.midi.*;
public class MusicTest1 {
    public void play(){
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Ми отримали синтезатор");
        }catch (MidiUnavailableException ex){
            System.out.println("Невдача");
        }
    }

    public static void main(String[] args) {
        MusicTest1 mt = new MusicTest1();
        mt.play();
    }
}
