package edu.madappsdevlopers.kidz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SliderView sliderView;
    List<ImageSliderModel> imageSliderModelList;



    private Button storyButton;
    private Button poemButton;
    private Button worksheetButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        storyButton = (Button)findViewById(R.id.story);
        poemButton = (Button) findViewById(R.id.poem);
        worksheetButton = (Button) findViewById(R.id.worksheet);

        storyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                functionStories();
            }
        });
        poemButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                functionPoems();
            }
        });

        worksheetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                functionWorksheet();
            }
        });







        imageSliderModelList = new ArrayList<>();
        sliderView = findViewById(R.id.imageSlider);

        imageSliderModelList.add(new ImageSliderModel(R.drawable.story1));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.story7));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.story8));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.story18));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.story11));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.poem19));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.story9));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.story6));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.story5));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.story2));


        sliderView.setSliderAdapter(new ImageSliderAdapter(this,imageSliderModelList));


        sliderView.setIndicatorAnimation(IndicatorAnimations.THIN_WORM); //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        //sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_RIGHT);
        sliderView.setIndicatorSelectedColor(Color.WHITE);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(3); //set scroll delay in seconds :
        sliderView.startAutoCycle();





    }
    public void functionStories() {
        Intent intent = new Intent(this,Stories.class);
        startActivity(intent);
    }
    public void functionPoems() {
        Intent intent = new Intent(this,Poems.class);
        startActivity(intent);
    }
    public void functionWorksheet(){
        Intent intent = new Intent(this,Worksheets.class);
        startActivity(intent);
    }


}

