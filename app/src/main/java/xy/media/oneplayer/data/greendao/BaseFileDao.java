package xy.media.oneplayer.data.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import xy.media.oneplayer.data.greendao.BaseFile;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BASE_FILE".
*/
public class BaseFileDao extends AbstractDao<BaseFile, Long> {

    public static final String TABLENAME = "BASE_FILE";

    /**
     * Properties of entity BaseFile.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Path = new Property(1, String.class, "path", false, "PATH");
        public final static Property Type = new Property(2, String.class, "type", false, "TYPE");
        public final static Property Name = new Property(3, String.class, "name", false, "NAME");
        public final static Property Selected = new Property(4, Boolean.class, "selected", false, "SELECTED");
        public final static Property Isdirectory = new Property(5, Boolean.class, "isdirectory", false, "ISDIRECTORY");
        public final static Property Size = new Property(6, String.class, "size", false, "SIZE");
        public final static Property Time = new Property(7, java.util.Date.class, "time", false, "TIME");
        public final static Property Parent_folder_name = new Property(8, String.class, "parent_folder_name", false, "PARENT_FOLDER_NAME");
        public final static Property Copyright = new Property(9, Boolean.class, "copyright", false, "COPYRIGHT");
    };


    public BaseFileDao(DaoConfig config) {
        super(config);
    }
    
    public BaseFileDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BASE_FILE\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"PATH\" TEXT," + // 1: path
                "\"TYPE\" TEXT," + // 2: type
                "\"NAME\" TEXT," + // 3: name
                "\"SELECTED\" INTEGER," + // 4: selected
                "\"ISDIRECTORY\" INTEGER," + // 5: isdirectory
                "\"SIZE\" TEXT," + // 6: size
                "\"TIME\" INTEGER," + // 7: time
                "\"PARENT_FOLDER_NAME\" TEXT," + // 8: parent_folder_name
                "\"COPYRIGHT\" INTEGER);"); // 9: copyright
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BASE_FILE\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, BaseFile entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String path = entity.getPath();
        if (path != null) {
            stmt.bindString(2, path);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(3, type);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
 
        Boolean selected = entity.getSelected();
        if (selected != null) {
            stmt.bindLong(5, selected ? 1L: 0L);
        }
 
        Boolean isdirectory = entity.getIsdirectory();
        if (isdirectory != null) {
            stmt.bindLong(6, isdirectory ? 1L: 0L);
        }
 
        String size = entity.getSize();
        if (size != null) {
            stmt.bindString(7, size);
        }
 
        java.util.Date time = entity.getTime();
        if (time != null) {
            stmt.bindLong(8, time.getTime());
        }
 
        String parent_folder_name = entity.getParent_folder_name();
        if (parent_folder_name != null) {
            stmt.bindString(9, parent_folder_name);
        }
 
        Boolean copyright = entity.getCopyright();
        if (copyright != null) {
            stmt.bindLong(10, copyright ? 1L: 0L);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public BaseFile readEntity(Cursor cursor, int offset) {
        BaseFile entity = new BaseFile( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // path
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // type
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // name
            cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0, // selected
            cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0, // isdirectory
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // size
            cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)), // time
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // parent_folder_name
            cursor.isNull(offset + 9) ? null : cursor.getShort(offset + 9) != 0 // copyright
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, BaseFile entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setPath(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setType(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSelected(cursor.isNull(offset + 4) ? null : cursor.getShort(offset + 4) != 0);
        entity.setIsdirectory(cursor.isNull(offset + 5) ? null : cursor.getShort(offset + 5) != 0);
        entity.setSize(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setTime(cursor.isNull(offset + 7) ? null : new java.util.Date(cursor.getLong(offset + 7)));
        entity.setParent_folder_name(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setCopyright(cursor.isNull(offset + 9) ? null : cursor.getShort(offset + 9) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(BaseFile entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(BaseFile entity) {
        if(entity != null) {
            return entity.getId();
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
