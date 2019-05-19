package com.hk.componentdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hk.componentlib.ServiceFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtLogin;
    private Button mBtMine;
    private Button mBtGetLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtLogin = (Button) findViewById(R.id.bt_login);
        mBtMine = (Button) findViewById(R.id.bt_mine);
        mBtGetLogin = (Button) findViewById(R.id.bt_get_login);

        mBtLogin.setOnClickListener(this);
        mBtMine.setOnClickListener(this);
        mBtGetLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_login:
                ServiceFactory.getInstance().getLoginService().launch(this);
                break;
            case R.id.bt_mine:
                ServiceFactory.getInstance().getMineService().launch(this);
                break;
            case R.id.bt_get_login:
                ServiceFactory.getInstance().getLoginService().newUserInfoFragment(getSupportFragmentManager(), R.id.container, new Bundle());
                break;
        }
    }
}
