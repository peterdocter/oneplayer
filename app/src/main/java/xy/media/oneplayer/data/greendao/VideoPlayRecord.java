package xy.media.oneplayer.data.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "VIDEO_PLAY_RECORD".
 */
public class VideoPlayRecord {

    private String path;
    private Long play_time;
    private Long total_time;
    private Integer left_time;
    private Boolean have_complete_watch_once;

    public VideoPlayRecord() {
    }

    public VideoPlayRecord(String path) {
        this.path = path;
    }

    public VideoPlayRecord(String path, Long play_time, Long total_time, Integer left_time, Boolean have_complete_watch_once) {
        this.path = path;
        this.play_time = play_time;
        this.total_time = total_time;
        this.left_time = left_time;
        this.have_complete_watch_once = have_complete_watch_once;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Long getPlay_time() {
        return play_time;
    }

    public void setPlay_time(Long play_time) {
        this.play_time = play_time;
    }

    public Long getTotal_time() {
        return total_time;
    }

    public void setTotal_time(Long total_time) {
        this.total_time = total_time;
    }

    public Integer getLeft_time() {
        return left_time;
    }

    public void setLeft_time(Integer left_time) {
        this.left_time = left_time;
    }

    public Boolean getHave_complete_watch_once() {
        return have_complete_watch_once;
    }

    public void setHave_complete_watch_once(Boolean have_complete_watch_once) {
        this.have_complete_watch_once = have_complete_watch_once;
    }

}
