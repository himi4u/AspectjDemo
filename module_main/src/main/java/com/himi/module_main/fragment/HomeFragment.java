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
        fragmentHomeBinding.tvHomeText.setText("首页");
        return view;
    }
}
