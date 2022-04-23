package com.example.dogapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Doctor_Time_Picking_data_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_time_picking_data_page);

        ActionBar DocActionBar5 = getSupportActionBar();
        DocActionBar5.setTitle("Appointment Details");
        DocActionBar5.setDisplayShowHomeEnabled(true);
        DocActionBar5.setDisplayHomeAsUpEnabled(true);

        Button Button1a = findViewById(R.id.doc_page4_btn1);
        Button Button2a = findViewById(R.id.doc_page4_btn2);
        Button Button3a = findViewById(R.id.doc_page4_btn3);
        Dialog nDialog = new Dialog(this);

        //#####
             Intent intent = getIntent();
             String date = getIntent().getStringExtra ("date");
           // String extraText = intent.getStringExtra(Doctor_Time_Picking_page.TEXT_TO_SEND);
            TextView textV = findViewById(R.id.doc_page4_text2a);
            textV.setText(date);
        //######
        Button1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Doctor_Time_Picking_data_page.this,Doctor_Appoinment_payment.class);
                startActivity(intent);
            }
        });

        Button2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Doctor_Time_Picking_data_page.this,Doctor_Time_Picking_page.class);
                startActivity(intent);
            }
        });

        Button3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nDialog.setContentView(R.layout.activity_doctor_delete_popup_msg);
                nDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                Intent intent = new Intent(Doctor_Time_Picking_data_page.this,Doctor_delete_popup_msg.class);
                startActivity(intent);
            }
        });

    }
}