package com.hk.logincomponent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.hk.componentlib.ILoginService;

/**
 * Created by hk on 2019/5/19.
 */
public class LoginService implements ILoginService {
    @Override
    public void launch(Context context) {
        context.startActivity(new Intent(context, LoginActivity.class));
    }

    @Override
    public Fragment newUserInfoFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        UserInfoFragment infoFragment = new UserInfoFragment();
        infoFragment.setArguments(bundle);
        fragmentManager.beginTransaction().add(viewId,infoFragment).commit();
        return infoFragment;
    }
}
