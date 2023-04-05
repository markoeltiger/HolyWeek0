package com.mark.holyweek.timeline;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class activityoffragment extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState==null){getSupportFragmentManager().beginTransaction()
        .add(android.R.id.content ,new ItemFragment()).commit();}
    }
}
