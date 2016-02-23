package manu.densitytool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView density = (TextView)findViewById(R.id.density);
        if(density != null){

            StringBuffer densityText = new StringBuffer();
            densityText.append("Density = ");
            densityText.append(getDensity());
            densityText.append(" dpi");
            density.setText(densityText);
        }

        TextView densityStr = (TextView)findViewById(R.id.densityStr);
        if(densityStr != null){

            StringBuffer densityStrText = new StringBuffer();
            densityStrText.append("Folder : ");
            densityStrText.append(getDensityStr());
            densityStr.setText(densityStrText);
        }
    }

    private int getDensity(){
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        return metrics.densityDpi;
    }

    private String getDensityStr(){
        switch(getDensity()){
            case DisplayMetrics.DENSITY_LOW:
                return "LDPI";
            case DisplayMetrics.DENSITY_MEDIUM:
                return "MDPI";
            case DisplayMetrics.DENSITY_HIGH:
                return "HDPI";
            case DisplayMetrics.DENSITY_XHIGH:
                return "XHDPI";
            case DisplayMetrics.DENSITY_XXHIGH:
                return "XXHDPI";
            case DisplayMetrics.DENSITY_XXXHIGH:
                return "XXXHDPI";
            case DisplayMetrics.DENSITY_400:
                return "400";
            case DisplayMetrics.DENSITY_TV:
                return "TV";
            case DisplayMetrics.DENSITY_280:
                return "280";
            case DisplayMetrics.DENSITY_360:
                return "360";
            case DisplayMetrics.DENSITY_420:
                return "420";
            case DisplayMetrics.DENSITY_560:
                return "560";
            default:
                return "OTHER";
        }

    }
}
