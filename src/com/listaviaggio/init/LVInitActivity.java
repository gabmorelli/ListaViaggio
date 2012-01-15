package com.listaviaggio.init;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class LVInitActivity extends Activity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("Lista Viaggio");
        setContentView(tv);
    }
}