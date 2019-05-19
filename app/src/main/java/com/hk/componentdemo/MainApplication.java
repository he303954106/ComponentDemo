package com.hk.componentdemo;

import android.app.Application;

import com.hk.componentlib.AppConfig;
import com.hk.componentlib.IAppComponent;

/**
 * Created by hk on 2019/5/19.
 */
public class MainApplication extends Application implements IAppComponent {

    private static MainApplication application;

    public static MainApplication getInstance() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initial(this);
    }

    @Override
    public void initial(Application app) {
        for (String component : AppConfig.COMPONENTS) {
            try {
                Class<?> clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if (object instanceof IAppComponent) {
                    ((IAppComponent) object).initial(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
