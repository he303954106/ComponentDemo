package com.hk.minecomponent;

import android.app.Application;

import com.hk.componentlib.IAppComponent;
import com.hk.componentlib.ServiceFactory;

/**
 * Created by hk on 2019/5/19.
 */
public class MineApplication extends Application implements IAppComponent {

    private static Application application;

    public static Application getApplication() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initial(this);
    }

    @Override
    public void initial(Application app) {
        application = app;
        ServiceFactory.getInstance().setMineService(new MineService());
    }
}
