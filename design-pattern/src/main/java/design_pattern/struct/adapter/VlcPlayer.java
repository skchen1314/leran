package design_pattern.struct.adapter;

/**
 * Created by chensk on 2016/12/20.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing here
    }
}
