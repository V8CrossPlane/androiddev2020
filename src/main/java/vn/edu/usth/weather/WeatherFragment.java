package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class WeatherFragment extends Fragment {


    public WeatherFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RelativeLayout weather_fragment = (RelativeLayout) inflater.inflate(R.layout.fragment_weather, container, false);

        TextView location = weather_fragment.findViewById(R.id.top_right);
        int pos = Integer.parseInt(getArguments().getString("position"));
        switch (pos){
            case 1:
                location.setText("HaNoi");
                break;
            case 2:
                location.setText("NewYork");
                break;
            case 3:
                location.setText("London");
                break;
        }

        return weather_fragment;
    }

}
