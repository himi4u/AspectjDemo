package com.himi.model_video.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.himi.model_video.R;
import com.himi.model_video.custom.MyJzvdStd;
import com.himi.model_video.databinding.FragmentVideoBinding;

/**
 * @ProjectName:
 * @Package: com.himi.model_video.fragment
 * @ClassName: VideoFragment
 * @Description:
 * @Author: 奔跑的土掉渣
 * @CreateDate: 2020/5/18 17:50
 * @UpdateUser:
 * @UpdateDate: 2020/5/18 17:50
 * @UpdateRemark:
 * @Version: 1.0
 */
public class VideoFragment extends Fragment {

    private FragmentVideoBinding videoBinding;

    public VideoFragment() {
        // Required empty public constructor
    }
    public static Fragment getInstance(){
        VideoFragment videoFragment = new VideoFragment();
        return videoFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_video, container, false);
        videoBinding = FragmentVideoBinding.bind(view);
        initView();
        return view;
    }

    private void initView() {
        MyJzvdStd myJzVideo = videoBinding.myJzVideo;
        myJzVideo.setUp("http://jzvd.nathen.cn/342a5f7ef6124a4a8faf00e738b8bee4/cf6d9db0bd4d41f59d09ea0a81e918fd-5287d2089db37e62345123a1be272f8b.mp4"
                , "title");
        Glide.with(this).load("http://jzvd-pic.nathen.cn/jzvd-pic/1bb2ebbe-140d-4e2e-abd2-9e7e564f71ac.png").into(myJzVideo.posterImageView);
    }
}
