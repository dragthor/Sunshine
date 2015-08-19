package app.com.example.android.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> _forecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        
        String[] forecastArray = {
                "Today - Sunny - 85/63",
                "Tomorrow - Partly Cloudy - 84/64",
                "Tuesday - Rain 80/75",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68",
                "Wednesday - Foggy 79/68"
        };

        List<String> weeklyForecast = new ArrayList<String>(Arrays.asList(forecastArray));

        _forecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview, weeklyForecast);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(_forecastAdapter);

        return rootView;
    }
}
