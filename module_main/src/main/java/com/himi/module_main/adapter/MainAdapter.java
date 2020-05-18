package com.himi.module_main.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.alibaba.android.arouter.launcher.ARouter;
import com.himi.module_lib_common.arouter.ARouterConstants;
import com.himi.module_main.fragment.HomeFragment;

import java.util.List;

public class MainAdapter extends FragmentPagerAdapter {
    private List<String> mDataList;

    public MainAdapter(@NonNull FragmentManager fm, List<String> dataList) {
        super(fm);
        this.mDataList = dataList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return HomeFragment.getInstance();
        return (Fragment) ARouter.getInstance().build(ARouterConstants.PATH_VIDEO).navigation();
    }

    @Override
    public int getCount() {
        return mDataList == null ? 0 : mDataList.size();
    }
}
