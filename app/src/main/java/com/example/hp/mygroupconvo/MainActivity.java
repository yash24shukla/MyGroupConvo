package com.example.hp.mygroupconvo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void sendItem(View view){
        ListView ChatsName = (ListView) findViewById(R.id.ChatsName);
        ListView ChatsMsg = (ListView) findViewById(R.id.ChatsMsg);
        ArrayList Name = new ArrayList();
        ArrayList msg = new ArrayList();
        EditText Nm = (EditText) findViewById(R.id.Name);
        EditText ms = (EditText) findViewById(R.id.msg);
        Name.add(Nm.getText().toString());
        msg.add(ms.getText().toString());
        int lastIndex  = Name.size() -1 ;
        ArrayAdapter ad1 = new ArrayAdapter(getApplicationContext() , android.R.layout.simple_list_item_1 , Name);
        ChatsName.setAdapter(ad1);

        ArrayAdapter ad2 = new ArrayAdapter(getApplicationContext() , android.R.layout.simple_list_item_1 , msg);
        ChatsMsg.setAdapter(ad2);



    }
}
