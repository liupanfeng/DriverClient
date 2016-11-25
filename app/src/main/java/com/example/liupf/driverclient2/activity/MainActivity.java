package com.example.liupf.driverclient2.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.liupf.driverclient2.App;
import com.example.liupf.driverclient2.R;
import com.example.liupf.driverclient2.util.SPUtil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button start_about_car;
    private EditText et_input_tel;
    private EditText et_input_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start_about_car=(Button)findViewById(R.id.start_about_car);
        start_about_car.setOnClickListener(this);
        et_input_tel=(EditText)findViewById(R.id.et_input_tel);
        et_input_name=(EditText)findViewById(R.id.et_input_name);

    }

    @Override
    public void onClick(View v) {
        if ("".equals(et_input_tel.getText().toString().trim())){
            App.getInstance().showSnackMessage(v, getString(R.string.input_tel_number));
            return;
        }
        if ("".equals(et_input_name.getText().toString().trim())){
            App.getInstance().showSnackMessage(v, getString(R.string.input_name));
            return;
        }

        SPUtil.getInstant().save(SPUtil.TEL_NUMBER,et_input_tel.getText().toString().trim());
        SPUtil.getInstant().save(SPUtil.USER_NAME,et_input_name.getText().toString().trim());
        startActivity(new Intent(this, ShowUserActivity.class));
    }
}
