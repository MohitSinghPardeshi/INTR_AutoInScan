package com.mohitsprojects.intr_one_2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  Context context;
    Button nextButton;
    ImageView imageView;
    PopupWindow pw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         initFun();
    }

    private void initFun() {

        nextButton = findViewById(R.id.btNext);
        imageView = findViewById(R.id.closeIv);
        LinearLayout layout = new LinearLayout(MainActivity.this);



        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               initiatePopupWindow();
            }
        });


    }

    private void initiatePopupWindow() {

        LayoutInflater inflater = (LayoutInflater) MainActivity.this
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup,
                findViewById(R.id.closeIv));
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        pw = new PopupWindow(layout, 500, 400, true);
        pw.showAtLocation(layout, Gravity.CENTER_VERTICAL, 0, -200);


        ImageView btncancel =  layout.findViewById(R.id.closeIv);

        btncancel.setOnClickListener(cancel_click);

    }

    private View.OnClickListener cancel_click = new View.OnClickListener() {
        public void onClick(View v) {
            pw.dismiss();

        }
    };


    public Context getContext() {
        return context;
    }
}