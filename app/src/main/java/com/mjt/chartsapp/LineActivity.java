package com.mjt.chartsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LineActivity extends AppCompatActivity {

    LineChart lineChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        lineChart = findViewById(R.id.lineChart);

        ArrayList<Entry> information = new ArrayList<>();

        information.add(new Entry(10,30));
        information.add(new Entry(15,60));
        information.add(new Entry(100,70));
        information.add(new Entry(150,80));
        information.add(new Entry(200,90));
        information.add(new Entry(500,110));

        LineDataSet dataSet = new LineDataSet(information,"Information");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        dataSet.setValueTextColor(Color.BLACK);
        dataSet.setValueTextSize(20f);


        LineData lineData = new LineData(dataSet);

        lineChart.setData(lineData);
        lineChart.animateY(2000);
    }
}