package xy.media.oneplayer.data.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import xy.media.oneplayer.data.greendao.VideoPlayRecord;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "VIDEO_PLAY_RECORD".
*/
public class VideoPlayRecordDao extends AbstractDao<VideoPlayRecord, String> {

    public static final String TABLENAME = "VIDEO_PLAY_RECORD";

    /**
     * Properties of entity VideoPlayRecord.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Path = new Property(0, String.class, "path", true, "PATH");
        public final static Property Play_time = new Property(1, Long.class, "play_time", false, "PLAY_TIME");
        public final static Property Total_time = new Property(2, Long.class, "total_time", false, "TOTAL_TIME");
        public final static Property Left_time = new Property(3, Integer.class, "left_time", false, "LEFT_TIME");
        public final static Property Have_complete_watch_once = new Property(4, Boolean.class, "have_complete_watch_once", false, "HAVE_COMPLETE_WATCH_ONCE");
    };


    public VideoPlayRecordDao(DaoConfig config) {
        super(config);
    }
    
    public VideoPlayRecordDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"VIDEO_PLAY_RECORD\" (" + //
                "\"PATH\" TEXT PRIMARY KEY NOT NULL ," + // 0: path
                "\"PLAY_TIME\" INTEGER," + // 1: play_time
                "\"TOTAL_TIME\" INTEGER," + // 2: total_time
                "\"LEFT_TIME\" INTEGER," + // 3: left_time
                "\"HAVE_COMPLETE_WATCH_ONCE\" INTEGER);"); // 4: have_complete_watch_once
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"VIDEO_PLAY_RECORD\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, VideoPlayRecord entity) {
        stmt.clearBindings();
 
        String path = entity.getPath();
        if (path != null) {
            stmt.bindString(1, path);
        }
 
        Long play_time = entity.getPlay_time();
        if (play_time != null) {
            stmt.bindLong(2, play_time);
        }
 
        Long total_time = entity.getTotal_time();
        if (total_time != null) {
            stmt.bindLong(3, total_time);
        }
 
        Integer left_time = entity.getLeft_time();
        if (left_time != null) {
            stmt.bindLong(4, left_time);
        }
 
        Boolean have_complete_watch_once = entity.getHave_complete_watch_once();
        if (have_complete_watch_once != null) {
            stmt.bindLong(5, have_complete_watch_once ? 1L: 0L);
        }
    }

    /** @inheritdoc */
    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public VideoPlayRecord readEntity(Cursor cursor, int offset) {
        VideoPlayRecord entity = new VideoPlayRecord( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // path
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // play_time
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // total_time
            cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3), // left_time
            cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0 // have_complete_watch_once
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, VideoPlayRecord entity, int offset) {
        entity.setPath(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setPlay_time(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setTotal_time(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setLeft_time(cursor.isNull(offset + 3) ? null : cursor.getInt(offset + 3));
        entity.setHave_complete_watch_once(cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(VideoPlayRecord entity, long rowId) {
        return entity.getPath();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(VideoPlayRecord entity) {
        if(entity != null) {
            return entity.getPath();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
