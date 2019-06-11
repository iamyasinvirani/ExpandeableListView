package com.iamyasinvirani.iyasinvirani.expandablelistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHashMap;
    private ExpandableListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = (ExpandableListView) findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpandableListAdapter(MainActivity.this, listDataHeader, listHashMap);
        listView.setAdapter(listAdapter);
    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listHashMap = new HashMap<>();

        listDataHeader.add("DEMO 1");
        listDataHeader.add("DEMO 2");
        listDataHeader.add("DEMO 3");
        listDataHeader.add("DEMO 4");
        listDataHeader.add("DEMO 5");

        List<String> demo1 = new ArrayList<>();
        demo1.add("This is demo 1 expandable listview");

        List<String> demo2 = new ArrayList<>();
        demo2.add("Child demo 1");
        demo2.add("Child demo 2");
        demo2.add("Child demo 3");
        demo2.add("Child demo 4");
        demo2.add("Child demo 5");
        demo2.add("Child demo 6");
        demo2.add("Child demo 7");

        List<String> demo3 = new ArrayList<>();
        demo3.add("Child demo 1");
        demo3.add("Child demo 2");
        demo3.add("Child demo 3");
        demo3.add("Child demo 4");
        demo3.add("Child demo 5");

        List<String> demo4 = new ArrayList<>();
        demo4.add("Child demo 1");
        demo4.add("Child demo 2");

        List<String> demo5 = new ArrayList<>();
        demo5.add("Child demo 1");
        demo5.add("Child demo 2");
        demo5.add("Child demo 3");

        listHashMap.put(listDataHeader.get(0),demo1);
        listHashMap.put(listDataHeader.get(1),demo2);
        listHashMap.put(listDataHeader.get(2),demo3);
        listHashMap.put(listDataHeader.get(3),demo4);
        listHashMap.put(listDataHeader.get(4),demo5);



    }
}
