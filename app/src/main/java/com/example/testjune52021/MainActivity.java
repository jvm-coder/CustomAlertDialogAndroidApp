package com.example.testjune52021;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private String alertText = "";
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText = (TextView) findViewById(R.id.textView);
    }

    public void launch(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Input")
                .setIcon(R.drawable.i1);

        final View v = getLayoutInflater().inflate(R.layout.check_dialog, null);
        final EditText inputName = (EditText) v.findViewById(R.id.username);

        builder.setView(v);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                EditText editText = v.findViewById(R.id.username);
                mText.setText(editText.getText().toString());
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}