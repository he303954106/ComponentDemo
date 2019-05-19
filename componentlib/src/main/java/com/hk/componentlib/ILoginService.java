package com.hk.componentlib;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by hk on 2019/5/19.
 */
public interface ILoginService {

    void launch(Context context);

    Fragment newUserInfoFragment(FragmentManager fragmentManager, int viewId, Bundle bundle);
}
