package com.example.exercise1task;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
* <h2>SOLUTION for exercise 1 <em>(10 minutes)</em>:</h1>
 * <ul>
 * <li>a) Add an <code>EditText</code> to your layout.</li>
 * <li>b) Add a <code>Button</code> that, when clicked, will make your
 * app log the text input givená by the user using <code>Log.v()</code>.</li>
 * <li>c) Show the result in a <code>TextView</code>.</li>
 * </ul>
 * */
public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String text = editText.getText().toString();


                Log.v("GDG", "Text from TextEdit: " + text);
                textView.setText(text);
            }
        });
    }

}