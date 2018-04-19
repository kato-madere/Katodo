package com.example.kato.katodo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//04/18~
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
//~04/18

public class TodoInputActivity extends AppCompatActivity {
    //Boolean saveFlag = false;
    TodoSaveActivity tsa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.todo_input_activity);

        //04/18~
        cancelButton();

        saveButton();
        //~04/18
    }

    private void cancelButton(){ //04/18
        Button cancelButton = findViewById(R.id.cancel_button);
        cancelButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(TodoInputActivity.this, TodoListActivity.class);
                startActivity(intent);
            }
        });
    }

    private void saveButton(){ //04/18
        Button saveButton = findViewById(R.id.save_button);
        saveButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText editText = findViewById(R.id.text_box);
                tsa = (TodoSaveActivity) getApplication();
                String todo = editText.getText().toString();


                tsa.todos.add(todo);
                tsa.arrayAdapter.notifyDataSetChanged();
                //TodoListActivity.saveFlag = true;

                Intent intent = new Intent(TodoInputActivity.this, TodoListActivity.class);
                startActivity(intent);
            }
        });
    }


    /*
    @Override
    protected void onStop(){ //04/19
        super.onStop();

        EditText editText = findViewById(R.id.text_box);
        String todo = editText.getText().toString();

        TodoListActivity.todo = todo;
        TodoListActivity.saveFlag = true;
    }
    */
}
