package debug;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.himi.model_video.R;
import com.himi.model_video.databinding.ActivityMainBinding;

/**
*
* @ProjectName:
* @Package: debug
* @ClassName: MainActivity
* @Description: debug下 video模块的MainActivity
* @Author: 奔跑的土掉渣
* @CreateDate: 2020/5/19 10:56
* @UpdateUser:
* @UpdateDate: 2020/5/19 10:56
* @UpdateRemark:
* @Version: 1.0
*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        activityMainBinding.tvVideoDebugActivity.setText("Debug Activity");
    }
}
