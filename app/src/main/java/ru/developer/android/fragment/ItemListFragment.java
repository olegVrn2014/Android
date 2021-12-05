package ru.developer.android.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import ru.developer.android.R;

public class ItemListFragment extends Fragment {

    String[] androidOs = new String[]{"Cupcake", "Donut", "Eclair","Froyo","Gingerbread","Honeycomb","Ice Cream Sandwich",
            "Jelly Bean","Kit Kat","Lollipop","Marshmallow","Nougat","Oreo"};
    ListView listView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_view,container,false);
        listView = view.findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1,androidOs);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextFragment textFragment = (TextFragment)getFragmentManager().findFragmentById(R.id.fragment2);
                textFragment.change("Android OS: " + androidOs[position]);
                listView.setSelection(android.R.color.holo_blue_bright);
            }
        });
        return view;
    }
}


