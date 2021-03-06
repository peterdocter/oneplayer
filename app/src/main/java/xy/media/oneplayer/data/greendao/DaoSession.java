package xy.media.oneplayer.data.greendao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import xy.media.oneplayer.data.greendao.BaseFile;
import xy.media.oneplayer.data.greendao.CenterFile;
import xy.media.oneplayer.data.greendao.VideoPlayRecord;
import xy.media.oneplayer.data.greendao.VideoPosition;
import xy.media.oneplayer.data.greendao.VideoGroupEncrypt;

import xy.media.oneplayer.data.greendao.BaseFileDao;
import xy.media.oneplayer.data.greendao.CenterFileDao;
import xy.media.oneplayer.data.greendao.VideoPlayRecordDao;
import xy.media.oneplayer.data.greendao.VideoPositionDao;
import xy.media.oneplayer.data.greendao.VideoGroupEncryptDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig baseFileDaoConfig;
    private final DaoConfig centerFileDaoConfig;
    private final DaoConfig videoPlayRecordDaoConfig;
    private final DaoConfig videoPositionDaoConfig;
    private final DaoConfig videoGroupEncryptDaoConfig;

    private final BaseFileDao baseFileDao;
    private final CenterFileDao centerFileDao;
    private final VideoPlayRecordDao videoPlayRecordDao;
    private final VideoPositionDao videoPositionDao;
    private final VideoGroupEncryptDao videoGroupEncryptDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        baseFileDaoConfig = daoConfigMap.get(BaseFileDao.class).clone();
        baseFileDaoConfig.initIdentityScope(type);

        centerFileDaoConfig = daoConfigMap.get(CenterFileDao.class).clone();
        centerFileDaoConfig.initIdentityScope(type);

        videoPlayRecordDaoConfig = daoConfigMap.get(VideoPlayRecordDao.class).clone();
        videoPlayRecordDaoConfig.initIdentityScope(type);

        videoPositionDaoConfig = daoConfigMap.get(VideoPositionDao.class).clone();
        videoPositionDaoConfig.initIdentityScope(type);

        videoGroupEncryptDaoConfig = daoConfigMap.get(VideoGroupEncryptDao.class).clone();
        videoGroupEncryptDaoConfig.initIdentityScope(type);

        baseFileDao = new BaseFileDao(baseFileDaoConfig, this);
        centerFileDao = new CenterFileDao(centerFileDaoConfig, this);
        videoPlayRecordDao = new VideoPlayRecordDao(videoPlayRecordDaoConfig, this);
        videoPositionDao = new VideoPositionDao(videoPositionDaoConfig, this);
        videoGroupEncryptDao = new VideoGroupEncryptDao(videoGroupEncryptDaoConfig, this);

        registerDao(BaseFile.class, baseFileDao);
        registerDao(CenterFile.class, centerFileDao);
        registerDao(VideoPlayRecord.class, videoPlayRecordDao);
        registerDao(VideoPosition.class, videoPositionDao);
        registerDao(VideoGroupEncrypt.class, videoGroupEncryptDao);
    }
    
    public void clear() {
        baseFileDaoConfig.getIdentityScope().clear();
        centerFileDaoConfig.getIdentityScope().clear();
        videoPlayRecordDaoConfig.getIdentityScope().clear();
        videoPositionDaoConfig.getIdentityScope().clear();
        videoGroupEncryptDaoConfig.getIdentityScope().clear();
    }

    public BaseFileDao getBaseFileDao() {
        return baseFileDao;
    }

    public CenterFileDao getCenterFileDao() {
        return centerFileDao;
    }

    public VideoPlayRecordDao getVideoPlayRecordDao() {
        return videoPlayRecordDao;
    }

    public VideoPositionDao getVideoPositionDao() {
        return videoPositionDao;
    }

    public VideoGroupEncryptDao getVideoGroupEncryptDao() {
        return videoGroupEncryptDao;
    }

}
