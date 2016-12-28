package cc.cloudist.acpsample;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import cc.cloudist.widget.ProgressConstant;
import cc.cloudist.widget.ProgressDialog;

public class MainActivity extends Activity implements View.OnClickListener {

    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_1).setOnClickListener(this);
        findViewById(R.id.button_2).setOnClickListener(this);
        findViewById(R.id.button_3).setOnClickListener(this);
        findViewById(R.id.button_4).setOnClickListener(this);
        findViewById(R.id.button_5).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1: {
                dialog = new ProgressDialog.Builder(this, R.style.NonDimACProgressDialog)
                        .direction(ProgressConstant.DIRECT_CLOCKWISE)
                        .themeColor(Color.WHITE)
                        .fadeColor(Color.DKGRAY).build();
                dialog.setCanceledOnTouchOutside(true);
                dialog.show();
            }
            break;
            case R.id.button_2: {
                ProgressDialog dialog = new ProgressDialog.Builder(this)
                        .direction(ProgressConstant.DIRECT_ANTI_CLOCKWISE)
                        .themeColor(Color.GREEN)
                        .fadeColor(Color.RED).build();
                dialog.setCanceledOnTouchOutside(true);
                dialog.show();
            }
            break;
            case R.id.button_3: {
                ProgressDialog dialog = new ProgressDialog.Builder(this)
                        .text("Text is here")
                        .build();
                dialog.setCanceledOnTouchOutside(true);
                dialog.show();
            }
            break;
            case R.id.button_5: {
                dialog.dismiss();
            }
            break;
        }
    }
}
