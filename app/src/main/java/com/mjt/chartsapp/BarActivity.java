package com.mjt.chartsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarActivity extends AppCompatActivity {

    BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bar);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        barChart = findViewById(R.id.barChart);

        ArrayList<BarEntry> information = new ArrayList<>();
        information.add(new BarEntry(2010,1000));
        information.add(new BarEntry(2011,1200));
        information.add(new BarEntry(2012,1400));
        information.add(new BarEntry(2013,1700));
        information.add(new BarEntry(2014,1300));
        information.add(new BarEntry(2015,1000));
        information.add(new BarEntry(2016,1700));
        information.add(new BarEntry(2018,1900));
        information.add(new BarEntry(2019,2200));

        BarDataSet dataSet = new BarDataSet(information,"Report");
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        dataSet.setValueTextColor(Color.BLACK);
        dataSet.setValueTextSize(20f);

        BarData barData = new BarData(dataSet);
        barChart.setFitBars(true);
        barChart.setData(barData);barChart.getDescription().setText("Bar Report Dome");
        barChart.animateY(2000);


    }
}