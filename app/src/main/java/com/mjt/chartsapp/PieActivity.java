package com.mjt.chartsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.WindowManager;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class PieActivity extends AppCompatActivity {

    PieChart pieChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        pieChart = findViewById(R.id.pieChart);

        ArrayList<PieEntry> records = new ArrayList<>();
        records.add(new PieEntry(32,"Quarter 1"));
        records.add(new PieEntry(25,"Quarter 2"));
        records.add(new PieEntry(31,"Quarter 3"));
        records.add(new PieEntry(33,"Quarter 4"));


        PieDataSet dataSet = new PieDataSet(records,"Pie Chart Report");
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        dataSet.setValueTextColor(Color.BLACK);
        dataSet.setValueTextSize(22f);

        PieData pieData = new PieData(dataSet);

        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(true);
        pieChart.setCenterText("Quarterly Revenue");
        pieChart.animate();

    }
}