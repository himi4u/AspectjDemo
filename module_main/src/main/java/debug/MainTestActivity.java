package debug;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.himi.module_main.R;
import com.himi.module_main.databinding.ActivityMainBinding;
import com.himi.module_main.databinding.ActivityMainTestBinding;

public class MainTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainTestBinding activityMainTestBinding = ActivityMainTestBinding.inflate(getLayoutInflater());
        setContentView(activityMainTestBinding.getRoot());
        activityMainTestBinding.tvMainDebugActivity.setText("MainTestActivity");
    }
}
