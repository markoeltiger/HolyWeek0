 package com.mark.holyweek;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.mark.holyweek.timeline.ItemFragment;
import com.mark.holyweek.timeline.activityoffragment;

public class MainActivity extends AppCompatActivity {
Button SunDay,Monday,Tuesday,Wednsday,Thursday,Friday,Saturday,Abouy;

    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String First = "firestime";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog ad=new AlertDialog.Builder(MainActivity.this).setTitle("رحلة القيامة").setMessage("يفضل البدأ في أستخدام البرنامج يوم أحد الزعف لتجربة أفضل")
                .setIcon(R.drawable.cross)    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).show();


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        MobileAds.initialize(this, "ca-app-pub-3100950110733504~4019923606");
        Abouy=(Button)findViewById(R.id.About);
        Monday=(Button)findViewById(R.id.monday);
        SunDay=(Button)findViewById(R.id.sunday);
        Tuesday=(Button) findViewById(R.id.tuseday);
        Wednsday=(Button)findViewById(R.id.Wednsday) ;
        Thursday=(Button)findViewById(R.id.thursday);
        Friday=(Button)findViewById(R.id.Friday);
        Saturday=(Button)findViewById(R.id.Saturday);
        SunDay.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent fa=new Intent(MainActivity.this, Sunday.class);
        startActivity(fa);
    }
});
Monday.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent se=new Intent(MainActivity.this,Monday.class);
        startActivity(se);
    }
});
Tuesday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent se=new Intent(MainActivity.this,Tuesday.class);
                startActivity(se);
            }
        });

        Wednsday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent se=new Intent(MainActivity.this,wednsday.class);
                startActivity(se);
            }
        });
        Thursday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent se=new Intent(MainActivity.this,Thursday.class);
                startActivity(se);
            }
        });
        Friday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent se=new Intent(MainActivity.this,Friday.class);
                startActivity(se);
            }
        });
        Saturday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent se=new Intent(MainActivity.this,Saturday.class);
                startActivity(se);
            }
        });
        Abouy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent se=new Intent(MainActivity.this,About.class);
                startActivity(se);
            }
        });
    }
}
