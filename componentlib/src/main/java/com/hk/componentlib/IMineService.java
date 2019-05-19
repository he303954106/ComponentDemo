package com.hk.componentlib;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by hk on 2019/5/19.
 */
public interface IMineService {

    void launch(Context context);

    Fragment newMineFragment(FragmentManager fragmentManager, int viewId, Bundle bundle);
}
