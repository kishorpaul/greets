package com.example.nestedscrollview.utility;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;

import com.example.nestedscrollview.R;

public class CustomProgress extends Dialog {
    public CustomProgress(Context context){
        super(context);

        WindowManager.LayoutParams windows = getWindow().getAttributes();

        windows.gravity = Gravity.CENTER_HORIZONTAL;
        getWindow().setAttributes(windows);

        setTitle(null);
        setCancelable(false);
        setOnCancelListener(null);
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        View view = LayoutInflater.from(context).inflate(R.layout.custom_progress, null);
        setContentView(view);
    }
}
