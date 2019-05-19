package com.hk.minecomponent;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.hk.componentlib.IMineService;

/**
 * Created by hk on 2019/5/19.
 */
public class MineService implements IMineService {
    @Override
    public void launch(Context context) {
        context.startActivity(new Intent(context, MineActivity.class));
    }

    @Override
    public Fragment newMineFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        return null;
    }
}
