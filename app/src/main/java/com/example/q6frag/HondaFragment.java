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

public class HondaFragment extends Fragment {
    ImageView im3;
    ListView l3;
    TextView t3;
    FragmentManager fm;
    FragmentTransaction ft;
    String[] sl3={"City","WRV","Jazz"};
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
        View v=inflater.inflate(R.layout.fragment_honda, container, false);
        l3=v.findViewById(R.id.lv3);
        return v;
    }
   @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        l3=view.findViewById(R.id.lv3);
        ArrayAdapter<String> c=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,sl3);
        Bundle b=new Bundle();
        b.putString("imgs","img_4");
        b.putString("details","Colour:Blue Car  \n Price: 15 lakhs \nThe Honda City has 1 Petrol Engine on offer.\nThe Petrol engine is 1498 cc .\nIt is available with Manual & Automatic transmission.Depending upon the variant and fuel type the City has a mileage of 17.8 to 18.4 kmpl.");
        Fragment det=new DetailsFragment();
        det.setArguments(b);
        fm= getActivity().getSupportFragmentManager();
        ft=fm.beginTransaction();
        ft.replace(R.id.frame2,det);
        ft.commit();
        l3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String d=sl3[i];
                if(d.equals("City")){
                    Bundle b=new Bundle();
                    b.putString("imgs","img_4");
                    b.putString("details","Colour:Blue Car  \n Price: 15 lakhs \nThe Honda City has 1 Petrol Engine on offer.\nThe Petrol engine is 1498 cc .\nIt is available with Manual & Automatic transmission.Depending upon the variant and fuel type the City has a mileage of 17.8 to 18.4 kmpl.");
                    Fragment det=new DetailsFragment();
                    det.setArguments(b);
                    fm= getActivity().getSupportFragmentManager();
                    ft=fm.beginTransaction();
                    ft.replace(R.id.frame2,det);
                    ft.commit();
                    Toast.makeText(getActivity(),"City is picked",Toast.LENGTH_SHORT).show();
                }
                if(d.equals("WRV")){
                    Bundle b=new Bundle();
                    b.putString("imgs","wrv");
                    b.putString("details","Colour:Dark Red Car  \n Price: 10 lakhs\nThe Honda WR-V has 1 Diesel Engine and 1 Petrol Engine on offer.\nThe Diesel engine is 1498 cc while the Petrol engine is 1199 cc .\nIt is available with Manual transmission.\nDepending upon the variant and fuel type the WR-V has a mileage of 16.5 to 23.7 kmpl");
                    Fragment det=new DetailsFragment();
                    det.setArguments(b);
                    fm= getActivity().getSupportFragmentManager();
                    ft=fm.beginTransaction();
                    ft.replace(R.id.frame2,det);
                    ft.commit();
                    Toast.makeText(getActivity(),"WRV is picked",Toast.LENGTH_SHORT).show();
                }
                if(d.equals("Jazz")){
                    Bundle b=new Bundle();
                    b.putString("imgs","img_5");
                    b.putString("details","Colour:Red Car  \n Price: 10 lakhs\nThe Honda Jazz has 1 Petrol Engine on offer.\nThe Petrol engine is 1199 cc.\nIt is available with Manual & Automatic transmission.Depending upon the variant and fuel type the Jazz has a mileage of 17.1 kmpl");
                    Fragment det=new DetailsFragment();
                    det.setArguments(b);
                    fm= getActivity().getSupportFragmentManager();
                    ft=fm.beginTransaction();
                    ft.replace(R.id.frame2,det);
                    ft.commit();
                    Toast.makeText(getActivity(),"Jazz is picked",Toast.LENGTH_SHORT).show();
                }
            }
        });
        l3.setAdapter(c);
    }
}