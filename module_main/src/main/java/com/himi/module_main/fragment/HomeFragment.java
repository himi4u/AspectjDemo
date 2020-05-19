package com.himi.module_main.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.himi.module_lib_common.arouter.ARouterConstants;
import com.himi.module_main.R;
import com.himi.module_main.databinding.FragmentHomeBinding;

/**
*
* @ProjectName:
* @Package: com.himi.module_main.fragment
* @ClassName: HomeFragment
* @Description: 首页fragment
* @Author: 奔跑的土掉渣
* @CreateDate: 2020/5/19 10:11
* @UpdateUser:
* @UpdateDate: 2020/5/19 10:11
* @UpdateRemark:
* @Version: 1.0
*/
public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    public static Fragment getInstance(){
        HomeFragment homeFragment = new HomeFragment();
        return homeFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        FragmentHomeBinding fragmentHomeBinding = FragmentHomeBinding.bind(view);
        fragmentHomeBinding.btnHome.setText("首页");
        fragmentHomeBinding.btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homeButtonClick();
            }
        });
        return view;
    }

    public void homeButtonClick(){

    }
}
