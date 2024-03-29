package KatySira.MusicPlayer;

import javax.sound.midi.*;

public class MiniMiniMusicApp {
    public static void main(String[] args) {
        MiniMiniMusicApp mini = new MiniMiniMusicApp();
    }

    public void play() {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();
            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteon = new MidiEvent(a, 1);
            track.add(noteon);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44, 100);
            MidiEvent noteoff = new MidiEvent(b, 16);
            track.add(noteoff);

            player.setSequence(seq);
            player.start();
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
}
