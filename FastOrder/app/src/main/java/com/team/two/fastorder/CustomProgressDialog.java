package com.team.two.fastorder;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;

/**
 * Created by user on 2015-12-11.
 */
public class CustomProgressDialog extends Dialog {
    public CustomProgressDialog(Context context) {
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //
        setContentView(R.layout.custom_progress_dialog);
    }
}
