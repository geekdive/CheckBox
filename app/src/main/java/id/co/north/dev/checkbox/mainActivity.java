package id.co.north.dev.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class mainActivity extends AppCompatActivity{

    CheckBox cb1, cb2, cb3, cb4, cb5, cb6;
    Button btn1, btn2;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        cb4 = (CheckBox) findViewById(R.id.cb4);
        cb5 = (CheckBox) findViewById(R.id.cb5);
        cb6 = (CheckBox) findViewById(R.id.cb6);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                methodSwow();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                methodUnChekBox();
            }
        });
    }

    public void methodUnChekBox(){
        if (cb1.isChecked()) {
            cb1.setChecked(false);
        }
        if (cb2.isChecked()) {
            cb2.setChecked(false);
        }
        if (cb3.isChecked()) {
            cb3.setChecked(false);
        }
        if (cb4.isChecked()) {
            cb4.setChecked(false);
        }
        if (cb5.isChecked()) {
            cb5.setChecked(false);
        }
        if (cb6.isChecked()) {
            cb6.setChecked(false);
        }
    }

    public void methodSwow() {
        String a = "";
        if (cb1.isChecked()) {
            a += "Bahasa Java\n";
        }
        if (cb2.isChecked()) {
            a += "Bahasa PHP\n";
        }
        if (cb3.isChecked()) {
            a += "Bahasa C++\n";
        }
        if (cb4.isChecked()) {
            a += "Bahasa Actionscript\n";
        }
        if (cb5.isChecked()) {
            a += "Bahasa Phyton\n";
        }
        if (cb6.isChecked()) {
            a += "Bahasa Javascript\n";
        }
        tv1 = (TextView)findViewById(R.id.textTampilkan);
        tv1.setText("Pilihan : \n" + a);
    }
}
