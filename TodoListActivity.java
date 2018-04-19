package com.example.kato.katodo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//04/18~
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.ListView;
import android.widget.ArrayAdapter;
//import java.util.ArrayList;
//~04/18

public class TodoListActivity extends AppCompatActivity {
    //static ArrayList<String> todos;
    TodoSaveActivity tsa;
    static String todo = null;
    static Boolean saveFlag = false;

    private ListView listView;
    //static ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_list_activity);

        //04/19~
        //todos = new ArrayList<String>();
        tsa = (TodoSaveActivity) this.getApplication();

        listView = (ListView) findViewById(R.id.todo_list);
        tsa.arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tsa.todos);
        listView.setAdapter(tsa.arrayAdapter);

        Button button = findViewById(R.id.add_button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(TodoListActivity.this, TodoInputActivity.class);

                startActivity(intent);

                //if(saveFlag == true){
                    //todos.add(todo);
                    //arrayAdapter.notifyDataSetChanged();
                    //saveFlag = false;
                //}
            }
        });
        //~04/19
    }

    /*
    @Override
    protected void onStart(){ //04/19
        super.onStart();

        if(saveFlag == true){
            todos.add(todo);
            arrayAdapter.notifyDataSetChanged();
            saveFlag = false;
        }


        //arrayAdapter.add(todo);
        //arrayAdapter.notifyDataSetChanged();
        //listView.setAdapter(arrayAdapter);
    }
    */

}
