package com.example.likhit.memegen;

/**
 * Created by LIKHIT on 27-12-2017.
 */

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Activity;
import android.content.Context;
import android.widget.EditText;
import android.widget.Button;

public class TopFragment extends Fragment{

    private static EditText topTextInput;
    private static EditText bottomTextInput;

    TopSectionListner actionCommander;

    public interface TopSectionListner{
        public void createMeme(String top, String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Activity activity;
        if(context instanceof Activity){
            activity=(Activity)context;
            try{
                actionCommander=(TopSectionListner) activity;
            }catch (Exception e){
                throw new ClassCastException(activity.toString());
            }
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.topfragment, container,false);

        topTextInput=(EditText)view.findViewById(R.id.topTextInput);
        bottomTextInput=(EditText)view.findViewById(R.id.bottomTextInput);
        final Button button=(Button)view.findViewById(R.id.button);

        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        buttonClicked(view);
                    }
                }
        );

                return view;
    }

    public void buttonClicked(View v){
        actionCommander.createMeme(topTextInput.getText().toString(),bottomTextInput.getText().toString());
    }
}
