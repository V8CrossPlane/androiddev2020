package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i("Create", "Call Create");
        //ForecastFragment forecastFragment = new ForecastFragment();
        //getSupportFragmentManager().beginTransaction().add(R.id.container, forecastFragment).commit();
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