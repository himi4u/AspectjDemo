package com.himi.module_lib_aop;

import android.util.Log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @ProjectName: AspectjDemo
 * @Package: com.himi.module_lib_aop
 * @ClassName: LogTrace
 * @Description:
 * @Author: 张顺运
 * @CreateDate: 2020/5/19 10:08
 * @UpdateUser:
 * @UpdateDate: 2020/5/19 10:08
 * @UpdateRemark:
 * @Version: 1.0
 */
@Aspect
public class LogTrace {
    @Before("execution(* com.himi.module_main.fragment.HomeFragment.homeButtonClick(..))")
    public void buttonClick(){
        Log.i("buttonClick","首页按钮点击");
    }
}
