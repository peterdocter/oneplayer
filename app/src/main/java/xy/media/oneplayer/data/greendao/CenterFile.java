package xy.media.oneplayer.data.greendao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "CENTER_FILE".
 */
public class CenterFile {

    private String path;
    private String name;
    private String type;
    private java.util.Date create_date;
    private Long duration;
    private Integer video_type;
    private String sha1;
    private Boolean isgodapfile;

    public CenterFile() {
    }

    public CenterFile(String path) {
        this.path = path;
    }

    public CenterFile(String path, String name, String type, java.util.Date create_date, Long duration, Integer video_type, String sha1, Boolean isgodapfile) {
        this.path = path;
        this.name = name;
        this.type = type;
        this.create_date = create_date;
        this.duration = duration;
        this.video_type = video_type;
        this.sha1 = sha1;
        this.isgodapfile = isgodapfile;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public java.util.Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(java.util.Date create_date) {
        this.create_date = create_date;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Integer getVideo_type() {
        return video_type;
    }

    public void setVideo_type(Integer video_type) {
        this.video_type = video_type;
    }

    public String getSha1() {
        return sha1;
    }

    public void setSha1(String sha1) {
        this.sha1 = sha1;
    }

    public Boolean getIsgodapfile() {
        return isgodapfile;
    }

    public void setIsgodapfile(Boolean isgodapfile) {
        this.isgodapfile = isgodapfile;
    }

}