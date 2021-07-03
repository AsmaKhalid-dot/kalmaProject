package com.example.kalma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity2 extends AppCompatActivity {
    PDFView pdfView;
    //MediaPlayer med;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //int md=getResources().getIdentifier("name","raw",getPackageName());
        //med=MediaPlayer.create(getApplicationContext(),md);
        //med.start();
        pdfView=(PDFView)findViewById(R.id.opener);
        String getitem=getIntent().getStringExtra("filename");
        if(getitem.equals("Pehla Kalma"))
        {
            pdfView.fromAsset("1 kalima.pdf").load();
        }
        else if(getitem.equals("Dusra Kalma"))
        {
            pdfView.fromAsset("2 kalima.pdf").load();
        }
        else if(getitem.equals("Teesra Kalma"))
        {
            pdfView.fromAsset("3 kalima.pdf").load();
        }
        else if(getitem.equals("Chotha Kalma"))
        {
            pdfView.fromAsset("4 kalima.pdf").load();
        }
        else if(getitem.equals("Panchwa Kalma"))
        {
            pdfView.fromAsset("5 kalima.pdf").load();
        }
        else if(getitem.equals("Chata Kalma")) {
            pdfView.fromAsset("6 kalima.pdf").load();
        }
    }
}