package com.jmarkstar.greendaocrud;

import android.app.Application;
import com.jmarkstar.greendaocrud.model.DaoMaster;
import com.jmarkstar.greendaocrud.model.DaoSession;
import org.greenrobot.greendao.database.Database;

/**
 * Created by jmarkstar on 19/05/2017.
 */

public class GreenDaoCrudApplication extends Application {

    public static final boolean ENCRYPTED = true;

    private DaoSession daoSession;

    @Override public void onCreate() {
        super.onCreate();
        String nombreBaseDeDatos = ENCRYPTED ? "notas-db-encriptado" : "notas-db";
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, nombreBaseDeDatos);
        Database db = ENCRYPTED ? helper.getEncryptedWritableDb("mi_clave_secreta") : helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();
    }

    public DaoSession getDaoSession() {
        return daoSession;
    }
}
