package com.example.segmentbuttondemo;


import com.example.segmentbuttondemo.SegmentView.OnSegmentViewClickListener;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity{

	SegmentView mSegmentView;
	TextView mTextView;
	Button mButton;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initView();
        setListener();
    }

    private void initView(){
    	mSegmentView = (SegmentView)findViewById(R.id.segment_view);
    	mTextView = (TextView)findViewById(R.id.tv);
    	mButton = (Button)findViewById(R.id.btn);
    	mSegmentView.setSegmentText("left", 0);
    	mSegmentView.setSegmentText("right", 1);
    }
    
    private void setListener(){
    	mSegmentView.setOnSegmentViewClickListener(new OnSegmentViewClickListener() {
			
			@Override
			public void onSegmentViewClick(View v, int position) {
				if(position == 0){
					mTextView.setText("left");
				}
				if(position == 1){
					mTextView.setText("right");
				}
			}
		});
    	
    	mButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				mSegmentView.setLeftSelected();
			}
		});
    }
	
}
