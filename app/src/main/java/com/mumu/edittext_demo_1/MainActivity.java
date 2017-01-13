package com.mumu.edittext_demo_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button_1;
    private EditText editText_1;
    private TextView textView_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_1 = (Button) findViewById(R.id.Button_1);
        editText_1 = (EditText) findViewById(R.id.ET_1);
        textView_1 = (TextView) findViewById(R.id.textView);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String edittextinfo = editText_1.getText().toString();
                textView_1.setText(edittextinfo);
                Toast.makeText(MainActivity.this, "获取完成！", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
