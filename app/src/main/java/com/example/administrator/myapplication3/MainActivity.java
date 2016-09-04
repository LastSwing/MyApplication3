package com.example.administrator.myapplication3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String a="我";
    String b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView zaoju=(TextView)findViewById(R.id.editText);
        final CheckBox xiaoming=(CheckBox)findViewById(R.id.checkBox);
        final CheckBox xiaohong=(CheckBox)findViewById(R.id.checkBox2);
        final RadioButton chun=(RadioButton)findViewById(R.id.radioButton);
        final RadioButton qiu=(RadioButton)findViewById(R.id.radioButton2);
        final RadioButton xia=(RadioButton)findViewById(R.id.radioButton3);
        final RadioButton dong=(RadioButton)findViewById(R.id.radioButton4);
        Button zao=(Button)findViewById(R.id.button);
        xiaoming.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                a+="和小明";
                 }
        });
        xiaohong.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    a+="和小红";
            }
        });
        chun.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                b="去春游";
            }
        });
        qiu.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    b="去秋游";
            }
        });
        xia.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    b="去夏游";
            }
        });
        dong.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    b= "去冬游";
            }
        });
        zao.setOnClickListener(new View.OnClickListener() {
            // 实现事件处理方法
            public void onClick(View v) {
                zaoju.setText(a+b);
                a="我";
                b="";
                xiaoming.setChecked(false);
                xiaohong.setChecked(false);
                chun.setChecked(false);
                xia.setChecked(false);
                qiu.setChecked(false);
                dong.setChecked(false);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
