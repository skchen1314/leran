package design_pattern.struct.adapter;

/**
 * Created by chensk on 2016/12/20.
 */
public class MediaAdapter implements MediaPlayer {
    private  AdvancedMediaPlayer mediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")){
            mediaPlayer = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            mediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            mediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            mediaPlayer.playMp4(fileName);
        }
    }
}
