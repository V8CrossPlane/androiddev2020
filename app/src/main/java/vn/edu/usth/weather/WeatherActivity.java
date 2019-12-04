package vn.edu.usth.weather;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.material.tabs.TabLayout;
import android.media.MediaPlayer;

import android.content.Intent;
import android.view.Menu;

import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;




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

        ForecastFragment forecastFragment = new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, forecastFragment).commit();

        MediaPlayer mediaPlayer = MediaPlayer.create(WeatherActivity.this, R.raw.thoitiet);
        mediaPlayer.start();
    }
        public boolean onCreateOptionsMenu(Menu menu){
            getMenuInflater().inflate(R.menu.app_bar_menu, menu);
            return super.onCreateOptionsMenu(menu);
        }

        public boolean onOptionsItemSelected(MenuItem item){
            switch (item.getItemId()){
                case R.id.refresh_button:
                    this.recreate();
                    break;
                case R.id.triple_dots_button:
                    View triple_dot_view = findViewById(R.id.triple_dots_button);
                    PopupMenu popupMenu = new PopupMenu(this, triple_dot_view);
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                        @Override
                        public boolean onMenuItemClick(MenuItem item) {
                            switch (item.getItemId()){
                                case R.id.settings:
                                    Intent intent = new Intent(getApplicationContext(), PrefActivity.class);
                                    startActivity(intent);
                                    return true;
                                case R.id.something:
                                    Toast.makeText(getApplicationContext(), "something is something is doing something here", Toast.LENGTH_LONG).show();
                                    return true;
                                default:
                                    return false;
                            }
                        }

                    });
                    popupMenu.inflate(R.menu.popup_menu);
                    popupMenu.show();
                    break;
            }
            return super.onOptionsItemSelected(item);
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