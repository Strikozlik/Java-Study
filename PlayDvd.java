public class PlayDvd {
    boolean canRecord = false;
    void playTape(){
        System.out.println("плівка програється");
    }
    void recordTape(){
        System.out.println("йде запис на плывку");
    }
}
class TapeDeskTestDrive{
    public static void main(String[] args) {
        PlayDvd t = new PlayDvd();
        t.canRecord = true;
        t.playTape();

        if(t.canRecord == true){
            t.recordTape();
        }
    }
}