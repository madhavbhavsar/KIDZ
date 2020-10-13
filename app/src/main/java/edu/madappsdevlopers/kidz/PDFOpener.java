package edu.madappsdevlopers.kidz;

import androidx.appcompat.app.AppCompatActivity;
import com.github.barteksc.pdfviewer.PDFView;

import android.os.Bundle;


public class PDFOpener extends AppCompatActivity {

    PDFView myPDFViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfopener);

        myPDFViewer=(PDFView) findViewById(R.id.pdfViewer);

        String getItem = getIntent().getStringExtra("pdfFileName");

        if(getItem.equals("Grade 1")){
            myPDFViewer.fromAsset("class1.pdf").load();

        }
        if(getItem.equals("Grade 2")){
            myPDFViewer.fromAsset("class2.pdf").load();

        }
        if(getItem.equals("Grade 3")){
            myPDFViewer.fromAsset("class3.pdf").load();

        }
        if(getItem.equals("Grade 4")){
            myPDFViewer.fromAsset("class4.pdf").load();

        }
        if(getItem.equals("Grade 5")){
            myPDFViewer.fromAsset("class5.pdf").load();

        }
        if(getItem.equals("Grade 6")){
            myPDFViewer.fromAsset("class6.pdf").load();

        }
        if(getItem.equals("Grade 7")){
            myPDFViewer.fromAsset("class7.pdf").load();

        }


    }
}
