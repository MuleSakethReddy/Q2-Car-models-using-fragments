package com.example.q6frag;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailsFragment extends Fragment {
    ImageView im;
    TextView t;
    String imstr,detstr;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_details, container, false);
        Bundle d=getArguments();
        imstr=d.getString("imgs");
        detstr= d.getString("details");
        im=v.findViewById(R.id.imagev);
        t=v.findViewById(R.id.tv);
        String imagename=String.valueOf(imstr);
        im.setImageResource(getResources().getIdentifier(imagename, "drawable", getActivity().getPackageName()));
        t.setText(detstr);
        return v;
    }
}