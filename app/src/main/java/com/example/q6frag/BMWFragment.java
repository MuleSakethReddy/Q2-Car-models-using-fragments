package com.example.q6frag;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class BMWFragment extends Fragment {
    ImageView im2;
    ListView l2;
    TextView t2;
    FragmentManager fm;
    FragmentTransaction ft;
    String[] sl2={"X1","Series","X5"};
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_b_m_w, container, false);
        l2=v.findViewById(R.id.lv2);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        l2=view.findViewById(R.id.lv2);
        Bundle b=new Bundle();
        b.putString("imgs","x1");
        b.putString("details","Colour:White Car  \n Price: 47.5 lakhs\nThe BMW X1 has 1 Diesel Engine and 1 Petrol Engine on offer.\nThe Diesel engine is 1995 cc while the Petrol engine is 1499 cc .\nIt is available with Automatic transmission.Depending upon the variant and fuel type the X1 has a mileage of 16.35 to 20.37 kmpl .\nThe X1 is a 5 seater 4 cylinder car.");
        Fragment det=new DetailsFragment();
        det.setArguments(b);
        fm= getActivity().getSupportFragmentManager();
        ft=fm.beginTransaction();
        ft.replace(R.id.frame2,det);
        ft.commit();
        ArrayAdapter<String> c=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,sl2);
        l2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String d=sl2[i];
                if(d.equals("X1")){
                    Bundle b=new Bundle();
                    b.putString("imgs","x1");
                    b.putString("details","Colour:White Car  \n Price: 47.5 lakhs\nThe BMW X1 has 1 Diesel Engine and 1 Petrol Engine on offer.\nThe Diesel engine is 1995 cc while the Petrol engine is 1499 cc .\nIt is available with Automatic transmission.Depending upon the variant and fuel type the X1 has a mileage of 16.35 to 20.37 kmpl .\nThe X1 is a 5 seater 4 cylinder car");
                    Fragment det=new DetailsFragment();
                    det.setArguments(b);
                    fm= getActivity().getSupportFragmentManager();
                    ft=fm.beginTransaction();
                    ft.replace(R.id.frame2,det);
                    ft.commit();
                    Toast.makeText(getActivity(),"X1 is picked",Toast.LENGTH_SHORT).show();
                }
                if(d.equals("Series")){
                    Bundle b=new Bundle();
                    b.putString("imgs","series");
                    b.putString("details","Colour:Grey Car  \n Price: 85 lakhs\nThe BMW 3 Series has 1 Petrol Engine on offer.\nThe Petrol engine is 2998 cc .\nIt is available with Automatic transmission.Depending upon the variant and fuel type the 3 Series has a mileage of 13.02 kmpl .\nThe 3 Series is a 5 seater 6 cylinder car");
                    Fragment det=new DetailsFragment();
                    det.setArguments(b);
                    fm= getActivity().getSupportFragmentManager();
                    ft=fm.beginTransaction();
                    ft.replace(R.id.frame2,det);
                    ft.commit();
                    Toast.makeText(getActivity(),"Series is picked",Toast.LENGTH_SHORT).show();
                }
                if(d.equals("X5")){
                     Bundle b=new Bundle();
                    b.putString("imgs","x5");
                    b.putString("details","Colour:Blue Car  \n Price: 85 lakhs\nThe BMW X5 has 1 Diesel Engine and 1 Petrol Engine on offer.\nThe Diesel engine is 2993 cc while the Petrol engine is 2998 cc.\nIt is available with Automatic transmission.Depending upon the variant and fuel type the X5 has a mileage of 11.24 to 13.38 kmpl.");
                    Fragment det=new DetailsFragment();
                    det.setArguments(b);
                    fm= getActivity().getSupportFragmentManager();
                    ft=fm.beginTransaction();
                    ft.replace(R.id.frame2,det);
                    ft.commit();
                    Toast.makeText(getActivity(),"X5 is picked",Toast.LENGTH_SHORT).show();
                }
            }
        });
        l2.setAdapter(c);
    }
}