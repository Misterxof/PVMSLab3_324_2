package com.mistcorp.bckgroundchange;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buttonC;
    Button buttonP;
    RelativeLayout relativeLayout;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonC = (Button)findViewById(R.id.button);
        buttonP = (Button)findViewById(R.id.button2);
        relativeLayout = (RelativeLayout)findViewById(R.id.relativeLayout);
        context = MainActivity.this;
    }

    public void onClick(View v) {
        final CharSequence[] items = {getText(R.string.red) ,
                getText(R.string.pink),getText(R.string.green)
        };
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                switch (item) {
                    case 0: { relativeLayout.setBackgroundResource(R.color.redColor);
                        Toast.makeText(context, R.string.red, Toast.LENGTH_LONG).show();
                        break;}
                    case 1:
                    {relativeLayout.setBackgroundResource(R.color.pinkColor);
                        Toast.makeText(context, R.string.pink,
                                Toast.LENGTH_LONG).show();
                        break;}
                    case 2:
                    {relativeLayout.setBackgroundResource(R.color.greenColor);
                        Toast.makeText(context, R.string.green, Toast.LENGTH_LONG).show();
                        break;}
                }
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void onClickBac(View v) {
        final CharSequence[] items = {getText(R.string.space) ,
                getText(R.string.android),getText(R.string.lines)
        };
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                switch (item) {
                    case 0: { relativeLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.space));
                        Toast.makeText(context, R.string.space, Toast.LENGTH_LONG).show();
                        break;}
                    case 1:
                    {relativeLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.android));
                        Toast.makeText(context, R.string.android, Toast.LENGTH_LONG).show();
                        break;}
                    case 2:
                    {relativeLayout.setBackgroundDrawable(getResources().getDrawable(R.drawable.lines));
                        Toast.makeText(context, R.string.lines, Toast.LENGTH_LONG).show();
                        break;}
                }
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }

}
