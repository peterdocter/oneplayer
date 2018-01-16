package xy.media.oneplayer.data.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import xy.media.oneplayer.data.greendao.CenterFile;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CENTER_FILE".
*/
public class CenterFileDao extends AbstractDao<CenterFile, String> {

    public static final String TABLENAME = "CENTER_FILE";

    /**
     * Properties of entity CenterFile.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Path = new Property(0, String.class, "path", true, "PATH");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Type = new Property(2, String.class, "type", false, "TYPE");
        public final static Property Create_date = new Property(3, java.util.Date.class, "create_date", false, "CREATE_DATE");
        public final static Property Duration = new Property(4, Long.class, "duration", false, "DURATION");
        public final static Property Video_type = new Property(5, Integer.class, "video_type", false, "VIDEO_TYPE");
        public final static Property Sha1 = new Property(6, String.class, "sha1", false, "SHA1");
        public final static Property Isgodapfile = new Property(7, Boolean.class, "isgodapfile", false, "ISGODAPFILE");
    };


    public CenterFileDao(DaoConfig config) {
        super(config);
    }
    
    public CenterFileDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CENTER_FILE\" (" + //
                "\"PATH\" TEXT PRIMARY KEY NOT NULL ," + // 0: path
                "\"NAME\" TEXT," + // 1: name
                "\"TYPE\" TEXT," + // 2: type
                "\"CREATE_DATE\" INTEGER," + // 3: create_date
                "\"DURATION\" INTEGER," + // 4: duration
                "\"VIDEO_TYPE\" INTEGER," + // 5: video_type
                "\"SHA1\" TEXT," + // 6: sha1
                "\"ISGODAPFILE\" INTEGER);"); // 7: isgodapfile
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CENTER_FILE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, CenterFile entity) {
        stmt.clearBindings();
 
        String path = entity.getPath();
        if (path != null) {
            stmt.bindString(1, path);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(3, type);
        }
 
        java.util.Date create_date = entity.getCreate_date();
        if (create_date != null) {
            stmt.bindLong(4, create_date.getTime());
        }
 
        Long duration = entity.getDuration();
        if (duration != null) {
            stmt.bindLong(5, duration);
        }
 
        Integer video_type = entity.getVideo_type();
        if (video_type != null) {
            stmt.bindLong(6, video_type);
        }
 
        String sha1 = entity.getSha1();
        if (sha1 != null) {
            stmt.bindString(7, sha1);
        }
 
        Boolean isgodapfile = entity.getIsgodapfile();
        if (isgodapfile != null) {
            stmt.bindLong(8, isgodapfile ? 1L: 0L);
        }
    }

    /** @inheritdoc */
    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public CenterFile readEntity(Cursor cursor, int offset) {
        CenterFile entity = new CenterFile( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // path
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // type
            cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)), // create_date
            cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4), // duration
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // video_type
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // sha1
            cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0 // isgodapfile
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, CenterFile entity, int offset) {
        entity.setPath(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setType(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCreate_date(cursor.isNull(offset + 3) ? null : new java.util.Date(cursor.getLong(offset + 3)));
        entity.setDuration(cursor.isNull(offset + 4) ? null : cursor.getLong(offset + 4));
        entity.setVideo_type(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setSha1(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setIsgodapfile(cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(CenterFile entity, long rowId) {
        return entity.getPath();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(CenterFile entity) {
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
