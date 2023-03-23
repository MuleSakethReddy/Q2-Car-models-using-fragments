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

public class SuzukiFragment extends Fragment {
    ImageView im1;
    ListView l1;
    TextView t1;
    String[] sl1={"Celerio","Swift","Grand Vitara"};
    FragmentManager fm;
    FragmentTransaction ft;
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
        View v=inflater.inflate(R.layout.fragment_suzuki, container, false);
        l1=v.findViewById(R.id.lv1);
        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        l1=view.findViewById(R.id.lv1);
        Bundle b=new Bundle();
        b.putString("imgs","img_1");
        b.putString("details","Colour:Red Car  \n Price: 5 lakhs \nThe Maruti Celerio has 1 Petrol Engine and 1 CNG Engine on offer.\\nThe Petrol engine is 998 cc while the CNG engine is 998 cc .\\nIt is available with Manual & Automatic transmission.Depending upon the variant and fuel type the Celerio has a mileage of 24.97 kmpl to 35.6 km/kg");
        Fragment det=new DetailsFragment();
        det.setArguments(b);
        fm= getActivity().getSupportFragmentManager();
        ft=fm.beginTransaction();
        ft.add(R.id.frame2,det);
        ft.commit();
        ArrayAdapter<String> c=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,sl1);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String d=sl1[i];
                if(d.equals("Celerio")){
                    Bundle b=new Bundle();
                    b.putString("imgs","img_1");
                    b.putString("details","Colour:Red Car  \n Price: 5 lakhs \nThe Maruti Celerio has 1 Petrol Engine and 1 CNG Engine on offer.\\nThe Petrol engine is 998 cc while the CNG engine is 998 cc .\\nIt is available with Manual & Automatic transmission.Depending upon the variant and fuel type the Celerio has a mileage of 24.97 kmpl to 35.6 km/kg");
                    Fragment det=new DetailsFragment();
                    det.setArguments(b);
                    fm= getActivity().getSupportFragmentManager();
                    ft=fm.beginTransaction();
                    ft.replace(R.id.frame2,det);
                    ft.commit();
                    Toast.makeText(getActivity(),"Celerio is picked",Toast.LENGTH_SHORT).show();
                }
                if(d.equals("Swift")){
                    Bundle b=new Bundle();
                    b.putString("imgs","img");
                    b.putString("details","Colour:White Car  \n Price: 6 lakhs \nSwift has 1 Petrol Engine and 1 CNG Engine on offer.\nThe Petrol engine is 1197 cc while the CNG engine is 1197 cc.");
                    Fragment det=new DetailsFragment();
                    det.setArguments(b);
                    fm= getActivity().getSupportFragmentManager();
                    ft=fm.beginTransaction();
                    ft.replace(R.id.frame2,det);
                    ft.commit();
                    Toast.makeText(getActivity(),"Swift is picked",Toast.LENGTH_SHORT).show();
                }
                if(d.equals("Grand Vitara")){
                    Bundle b=new Bundle();
                    b.putString("imgs","img_9");
                    b.putString("details","Colour:Black Car  \n Price: 10.45 lakhs \nThe Maruti Grand Vitara has 2 Petrol Engine and 1 CNG Engine on offer.\nThe Petrol engine is 1462 cc and 1490 cc while the CNG engine is 1462 cc .\nIt is available with Manual & Automatic transmission.");
                    Fragment det=new DetailsFragment();
                    det.setArguments(b);
                    fm= getActivity().getSupportFragmentManager();
                    ft=fm.beginTransaction();
                    ft.replace(R.id.frame2,det);
                    ft.commit();
                    Toast.makeText(getActivity(),"Grand Vitara is picked",Toast.LENGTH_SHORT).show();
                }
            }
        });
        l1.setAdapter(c);
    }
}