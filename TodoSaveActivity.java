package com.example.kato.katodo;

import android.app.Application;
import android.widget.ArrayAdapter;
import java.util.ArrayList;


public class TodoSaveActivity extends Application{
    ArrayList<String> todos = new ArrayList<String>();
    ArrayAdapter<String> arrayAdapter;
}
