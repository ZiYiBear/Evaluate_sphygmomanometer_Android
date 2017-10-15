package com.hw.osirisgekkou.u0224052_20170930;

import android.util.Log;
import android.widget.EditText;

/**
 * 血壓狀況檢測
 * Created by osirisgekkou on 2017/9/30.
 */

public enum BloodPressureCondition {
    Excellent優良,
    Good正常,
    Bad不太樂觀;

    //Diastolic舒張壓, Systolic收縮壓
    static public BloodPressureCondition BloodPressureConditionMeasure(EditText targetDiastolic, EditText targetSystolic){
        String string_Diastolic = targetDiastolic.getText().toString();
        Log.d("string_Diastolic", "BloodPressureConditionMeasure:"+string_Diastolic);
        String string_Systolic = targetSystolic.getText().toString();
        Log.d("string_Systolic", "BloodPressureConditionMeasure:"+string_Systolic);
        if (checkDiastolic(string_Diastolic) && chcekSystolic(string_Systolic)) return Excellent優良;
        else if (chcekSystolic(string_Systolic) || checkDiastolic(string_Diastolic)) return Good正常;
        else return Bad不太樂觀;
    }

    //收縮壓檢查(高)
    static private boolean checkDiastolic(String targetDiastolic){
        int tempDiastolic = Integer.parseInt(targetDiastolic);
        if (tempDiastolic > 90 && tempDiastolic < 120) return true;
        else return false;
    }

    //舒張壓檢查(低)
    static private  boolean chcekSystolic(String targetSystolic){
        int tempSystolic = Integer.parseInt(targetSystolic);
        if (tempSystolic > 70 && tempSystolic < 90) return true;
        else return false;
    }
}


