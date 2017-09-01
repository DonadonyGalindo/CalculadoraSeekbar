package com.example.donadonydonaji.calculadoratexto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener{
    TextView txtTitulo;
    TextView txtRes;
    SeekBar skBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitulo = (TextView) findViewById(R.id.txt_title);
        txtRes= (TextView) findViewById(R.id.text_View);
        skBar = (SeekBar) findViewById(R.id.seekBar);

        skBar.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
        int num= Integer.parseInt(String.valueOf(progress));

        String cad = num +"\n";

        for(int i=1;i<=10;i++){
            cad+=(num + "*" + i + "=" + (num*i)+"\n");

        }

        txtRes.setText(cad);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
