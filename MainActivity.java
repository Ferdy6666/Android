package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    public EditText nama, nim, nohp, email;
    public RadioButton radioButton;
    public RadioGroup radioGroup;
    public CheckBox setuju;
    public Button daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.nama);
        nim = findViewById(R.id.nim);
        nohp = findViewById(R.id.noHP);
        email = findViewById(R.id.email);
        radioGroup = findViewById(R.id.radioGroup);
        setuju = findViewById(R.id.checkBox);
        daftar = findViewById(R.id.daftar);
    }

    public void Daftar(View view){
        Intent intent = new Intent(MainActivity.this, ActivityKedua.class);
        intent.putExtra("nama", nama.getText().toString());
        intent.putExtra("nim", nim.getText().toString());
        intent.putExtra("nohp", nohp.getText().toString());
        intent.putExtra("email", email.getText().toString());
        intent.putExtra("radio", radioButton.getText().toString());
        intent.putExtra("setuju", setuju.getText().toString());
        startActivity(intent);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch (view.getId()) {
            case R.id.checkBox:
                if (checked)
                    setuju.setText("Ya");
                else
                    setuju.setText("Tidak");
                break;
        }
    }

    public void onRadioButtonClicked(View view) {
        int radioId = radioGroup.getCheckedRadioButtonId();

        radioButton = findViewById(radioId);
    }


}