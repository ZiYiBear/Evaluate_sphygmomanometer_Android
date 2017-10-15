package com.hw.osirisgekkou.u0224052_20170930;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button convertBtm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        convertBtm = (Button)findViewById(R.id.convert_btm);
        convertBtm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                BloodPressureCondition tempCondition = BloodPressureCondition.BloodPressureConditionMeasure((EditText)findViewById(R.id.edit_Diastolic), (EditText)findViewById(R.id.edit_Systolic));
                Log.d("判斷結果為:", tempCondition.toString());
                ((TextView)findViewById(R.id.text_Ans)).setText(tempCondition.toString());
            }
        });
    }
}
