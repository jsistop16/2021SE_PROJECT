package com.example.se_demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class FragmentHanger extends Fragment implements View.OnClickListener{

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cloth_info_complete, container, false);

        Button addbtn = (Button)view.findViewById(R.id.AddBtn);
        Button savebtn = (Button)view.findViewById(R.id.SaveBtn);
        Button windbtn = (Button)view.findViewById(R.id.wind);
        Button stylerbtn = (Button)view.findViewById(R.id.styler);

        addbtn.setOnClickListener(this);
        savebtn.setOnClickListener(this);
        windbtn.setOnClickListener(this);
        stylerbtn.setOnClickListener(this);

        return view;
    }
    Intent intent;
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.AddBtn:
                intent = new Intent(getActivity(), Top_Bottom.class);
                startActivity(intent);
                break;
            case R.id.SaveBtn:
                intent = new Intent(getActivity(), Cloth_search.class);
                startActivity(intent);
                break;
            case R.id.wind:
                intent = new Intent(getActivity(), WindSystem.class);
                startActivity(intent);
                break;
            case R.id.styler:
                intent = new Intent(getActivity(), Styler.class);
                startActivity(intent);
                break;
        }
    }
}