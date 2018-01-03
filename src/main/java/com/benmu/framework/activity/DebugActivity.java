package com.benmu.framework.activity;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.benmu.framework.R;
import com.benmu.framework.constant.Constant;
import com.benmu.framework.manager.ManagerFactory;
import com.benmu.framework.manager.impl.ParseManager;
import com.benmu.framework.model.JsVersionInfoBean;
import com.benmu.framework.utils.BaseCommonUtil;
import com.benmu.framework.utils.SharePreferenceUtil;

/**
 * Created by Carry on 2017/8/25.
 */

public class DebugActivity extends AppCompatActivity {
    private TextView tv_appversion;
    private TextView tv_jsverision;
    private CheckBox cb_inter;
    private CheckBox cb_debug;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debug);
        initView();
    }

    private void initView() {
        tv_appversion = (TextView) findViewById(R.id.tv_appversion);
        tv_jsverision = (TextView) findViewById(R.id.tv_jsverision);
        cb_inter = (CheckBox) findViewById(R.id.cb_inter);
        cb_debug = (CheckBox) findViewById(R.id.cb_debug);

        tv_appversion.setText(BaseCommonUtil.getVersionName(this));
        String activeState = SharePreferenceUtil.getInterceptorActive(this);
        if (Constant.INTERCEPTOR_ACTIVE.equals(activeState)) {
            ParseManager parseManager = ManagerFactory.getManagerService(ParseManager.class);
            String jsVersion = parseManager.parseObject(SharePreferenceUtil.getVersion
                    (this), JsVersionInfoBean.class).getJsVersion();
            tv_jsverision.setText(jsVersion);

        }
        cb_inter.setChecked(Constant.INTERCEPTOR_ACTIVE.equals(activeState));
        cb_inter.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                SharePreferenceUtil.setInterceptorActive(getBaseContext(), isChecked ? Constant
                        .INTERCEPTOR_ACTIVE : Constant.INTERCEPTOR_DEACTIVE);
            }
        });
        String debugActiveState = SharePreferenceUtil.getDebugActive(this);
        cb_debug.setChecked(Constant.DEBUG_ACTIVE.equals(debugActiveState));
        cb_debug.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                SharePreferenceUtil.setDebugActive(getBaseContext(), isChecked ? Constant
                        .DEBUG_ACTIVE : Constant.DEBUG_DEACTIVE);
            }
        });
    }
}
