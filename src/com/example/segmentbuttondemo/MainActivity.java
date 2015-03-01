package com.example.segmentbuttondemo;


import com.example.segmentbuttondemo.SegmentView.OnSegmentViewClickListener;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity{

	SegmentView mSegmentView;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initView();
        setListener();
    }

    private void initView(){
    	mSegmentView = (SegmentView)findViewById(R.id.segment_view);
    }
    
    private void setListener(){
    	mSegmentView.setOnSegmentViewClickListener(new OnSegmentViewClickListener() {
			
			@Override
			public void onSegmentViewClick(View v, int position) {
				if(position == 0){
					System.out.println("left");
				}
				if(position == 1){
					System.out.println("right");
				}
			}
		});
    }
	
}
