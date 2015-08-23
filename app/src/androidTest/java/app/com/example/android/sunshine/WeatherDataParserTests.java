package app.com.example.android.sunshine;

import junit.framework.TestCase;

import org.json.JSONException;

/**
 * Created by kkrause on 8/21/2015.
 */
public class WeatherDataParserTests extends TestCase {
    final private String _weatherJson = "{\"city\":{\"id\":5095211,\"name\":\"Annandale\",\"coord\":{\"lon\":-74.881279,\"lat\":40.64093},\"country\":\"US\",\"population\":0},\"cod\":\"200\",\"message\":0.0089,\"cnt\":7,\"list\":[{\"dt\":1440090000,\"temp\":{\"day\":23.43,\"min\":21.94,\"max\":23.43,\"night\":21.94,\"eve\":23.43,\"morn\":23.43},\"pressure\":984.93,\"humidity\":97,\"weather\":[{\"id\":502,\"main\":\"Rain\",\"description\":\"heavy intensity rain\",\"icon\":\"10d\"}],\"speed\":3.31,\"deg\":154,\"clouds\":100,\"rain\":26.42},{\"dt\":1440176400,\"temp\":{\"day\":25.58,\"min\":17.87,\"max\":25.58,\"night\":17.87,\"eve\":21.52,\"morn\":20.84},\"pressure\":988.1,\"humidity\":62,\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"sky is clear\",\"icon\":\"01d\"}],\"speed\":1.46,\"deg\":309,\"clouds\":0},{\"dt\":1440262800,\"temp\":{\"day\":23.73,\"min\":16.29,\"max\":23.73,\"night\":16.29,\"eve\":20.56,\"morn\":18.17},\"pressure\":990.61,\"humidity\":63,\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"sky is clear\",\"icon\":\"02d\"}],\"speed\":1.41,\"deg\":347,\"clouds\":8},{\"dt\":1440349200,\"temp\":{\"day\":24.85,\"min\":17.67,\"max\":25.32,\"night\":19.14,\"eve\":21.59,\"morn\":17.67},\"pressure\":986.29,\"humidity\":58,\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10d\"}],\"speed\":1.4,\"deg\":80,\"clouds\":0,\"rain\":1.1},{\"dt\":1440435600,\"temp\":{\"day\":24.93,\"min\":16.95,\"max\":24.93,\"night\":16.95,\"eve\":21.03,\"morn\":19.94},\"pressure\":993.78,\"humidity\":0,\"weather\":[{\"id\":501,\"main\":\"Rain\",\"description\":\"moderate rain\",\"icon\":\"10d\"}],\"speed\":1.59,\"deg\":274,\"clouds\":23,\"rain\":3.45},{\"dt\":1440522000,\"temp\":{\"day\":22.38,\"min\":16.66,\"max\":22.38,\"night\":16.8,\"eve\":20.24,\"morn\":16.66},\"pressure\":996.08,\"humidity\":0,\"weather\":[{\"id\":800,\"main\":\"Clear\",\"description\":\"sky is clear\",\"icon\":\"01d\"}],\"speed\":2.45,\"deg\":256,\"clouds\":0},{\"dt\":1440608400,\"temp\":{\"day\":21.27,\"min\":14.87,\"max\":21.27,\"night\":14.87,\"eve\":19.28,\"morn\":15.65},\"pressure\":1000.05,\"humidity\":0,\"weather\":[{\"id\":500,\"main\":\"Rain\",\"description\":\"light rain\",\"icon\":\"10d\"}],\"speed\":2.12,\"deg\":268,\"clouds\":20,\"rain\":0.53}]}";

    public void able_to_get_max_temperature_for_first_day()  {
        double actual = 0;

        try {
            actual = WeatherDataParser.getMaxTemperatureForDay(_weatherJson, 0);
        } catch (JSONException ex) {
            fail(ex.getMessage());
        }

        assertEquals(23.43, actual);
    }

    public void able_to_get_max_temperature_for_last_day()  {
        double actual = 0;

        try {
            actual = WeatherDataParser.getMaxTemperatureForDay(_weatherJson, 6);
        } catch (JSONException ex) {
            fail(ex.getMessage());
        }

        assertEquals(21.28, actual);
    }
}