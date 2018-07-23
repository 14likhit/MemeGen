package com.example.likhit.memegen;

/**
 * Created by LIKHIT on 28-12-2017.
 */
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;

public class BottomFragment extends Fragment{

    private static TextView upparwala;
    private static TextView nichewala;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.bottomfragment, container,false);

        upparwala=(TextView)view.findViewById(R.id.upparwala);
        nichewala=(TextView)view.findViewById(R.id.nichewala);
        return view;
    }

    public void setMemeText(String top,String bottom){
        upparwala.setText(top);
        nichewala.setText(bottom);
    }
}
