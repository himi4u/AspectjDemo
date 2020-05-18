package com.himi.module_lib_common;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @ProjectName: AspectjDemo
 * @Package: com.himi.module_lib_common
 * @ClassName: BaseApplication
 * @Description:
 * @Author: 奔跑的土掉渣
 * @CreateDate: 2020/5/18 17:45
 * @UpdateUser:
 * @UpdateDate: 2020/5/18 17:45
 * @UpdateRemark:
 * @Version: 1.0
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(this);
    }
}
