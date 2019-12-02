package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "Weather Activity";
    private ViewPager viewPager;
    private Adapter adapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("Create", "Call Create");
        viewPager = findViewById(R.id.pager);
        adapter = new Adapter(getSupportFragmentManager(), this.getApplicationContext());
        viewPager.setAdapter(adapter);
        tabLayout = findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Abc", "Def");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i("bac", "edf");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i("acb", "Dfe");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("BCA", "EDF");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Cab", "fDe");
    }
}