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

public class KiaFragment extends Fragment {
    ImageView im4;
    ListView l4;
    TextView t4;
    FragmentManager fm;
    FragmentTransaction ft;
    String[] sl4={"Seltos","EV6","Sonet"};
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
        View v=inflater.inflate(R.layout.fragment_kia, container, false);
        l4=v.findViewById(R.id.lv4);
        return v;
    }

   @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        l4=view.findViewById(R.id.lv4);
        Bundle b=new Bundle();
        b.putString("imgs","img_6");
        b.putString("details","Colour:Blue Car  \n Price: 25 lakhs\nThe Kia Seltos has 2 Diesel Engine and 1 Petrol Engine on offer.\nThe Diesel engine is 1497 cc and 1493 cc while the Petrol engine is 1497 cc .\nIt is available with Automatic & Manual transmission.\nDepending upon the variant and fuel type the Seltos has a mileage of 20.8 kmpl ");
        Fragment det=new DetailsFragment();
        det.setArguments(b);
        fm= getActivity().getSupportFragmentManager();
        ft=fm.beginTransaction();
        ft.replace(R.id.frame2,det);
        ft.commit();
        ArrayAdapter<String> c=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,sl4);
        l4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String d=sl4[i];
                if(d.equals("Seltos")){
                    Bundle b=new Bundle();
                    b.putString("imgs","img_6");
                    b.putString("details","Colour:Blue Car  \n Price: 25 lakhs\nThe Kia Seltos has 2 Diesel Engine and 1 Petrol Engine on offer.\nThe Diesel engine is 1497 cc and 1493 cc while the Petrol engine is 1497 cc .\nIt is available with Automatic & Manual transmission.\nDepending upon the variant and fuel type the Seltos has a mileage of 20.8 kmpl ");
                    Fragment det=new DetailsFragment();
                    det.setArguments(b);
                    fm= getActivity().getSupportFragmentManager();
                    ft=fm.beginTransaction();
                    ft.replace(R.id.frame2,det);
                    ft.commit();
                    Toast.makeText(getActivity(),"Seltos is picked",Toast.LENGTH_SHORT).show();
                }
                if(d.equals("EV6")){
                    Bundle b=new Bundle();
                    b.putString("imgs","ev6");
                    b.putString("details","Colour:Grey Car  \n Price: 60.5 lakhs\nThe Kia EV6 has 1 Electric Engine on offer.\nIt is available with the Automatic transmission.\nThe EV6 is a 5 seater and has length of 4695mm, width of 1890mm and a wheelbase of 2900mm");
                    Fragment det=new DetailsFragment();
                    det.setArguments(b);
                    fm= getActivity().getSupportFragmentManager();
                    ft=fm.beginTransaction();
                    ft.replace(R.id.frame2,det);
                    ft.commit();
                    Toast.makeText(getActivity(),"EV6 is picked",Toast.LENGTH_SHORT).show();
                }
                if(d.equals("Sonet")){
                    Bundle b=new Bundle();
                    b.putString("imgs","img_7");
                    b.putString("details","Colour:Red Car  \n Price: 15 lakhs\nThe Kia Sonet has 1 Diesel Engine and 2 Petrol Engine on offer.\nThe Diesel engine is 1493 cc while the Petrol engine is 1197 cc and 998 cc .\nIt is available with Automatic & Manual transmission.\nDepending upon the variant and fuel type the Sonet has a mileage of 18.4 kmpl");
                    Fragment det=new DetailsFragment();
                    det.setArguments(b);
                    fm= getActivity().getSupportFragmentManager();
                    ft=fm.beginTransaction();
                    ft.replace(R.id.frame2,det);
                    ft.commit();
                    Toast.makeText(getActivity(),"Sonet is picked",Toast.LENGTH_SHORT).show();
                }
            }
        });
        l4.setAdapter(c);
    }
}