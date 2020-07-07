package com.example.kok_checklist;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class PopUp extends Activity {

    TextView popUpTextView;

    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        setContentView(R.layout.popup_window);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout(((int)(width*.6)),((int)(height*.6)));

        popUpTextView = findViewById(R.id.popUpTextView);

        Bundle myData = getIntent().getExtras();

        if(myData == null)
            return;

        String myString = myData.getString("popUpData");

        popUpTextView.setText(myString);
    }
}
