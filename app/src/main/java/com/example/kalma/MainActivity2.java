package com.example.kalma;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity2 extends AppCompatActivity {
    PDFView pdfView;
    MediaPlayer med;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pdfView=(PDFView)findViewById(R.id.opener);
        String getitem=getIntent().getStringExtra("pdfFileNames");
        if(getitem.equals("Pehla Kalma"))
        {
            pdfView.fromAsset("1 kalima.pdf").load();
            med=MediaPlayer.create(this,R.raw.pehla);
        }
        else if(getitem.equals("Dusra Kalma"))
        {
            pdfView.fromAsset("2 kalima.pdf").load();
            med=MediaPlayer.create(this,R.raw.dusra);
        }
        else if(getitem.equals("Teesra Kalma"))
        {
            pdfView.fromAsset("3 kalima.pdf").load();
            med=MediaPlayer.create(this,R.raw.teesra);
        }
        else if(getitem.equals("Chotha Kalma"))
        {
            pdfView.fromAsset("4 kalima.pdf").load();
            med=MediaPlayer.create(this,R.raw.chotha);
        }
        else if(getitem.equals("Panchwa Kalma"))
        {
            pdfView.fromAsset("5 kalima.pdf").load();
            med=MediaPlayer.create(this,R.raw.panchwa);
        }
        else if(getitem.equals("Chata Kalma")) {
            pdfView.fromAsset("6 kalima.pdf").load();
            med=MediaPlayer.create(this,R.raw.chata);
        }
    }


    public void Play(View view) {
        med.start();
    }

    public void Pause(View view) {
        med.pause();
    }
}