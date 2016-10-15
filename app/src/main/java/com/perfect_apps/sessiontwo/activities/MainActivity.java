package com.perfect_apps.sessiontwo.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.perfect_apps.sessiontwo.R;
import com.perfect_apps.sessiontwo.fragments.ItemsFaragment;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    public static boolean twoPan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (findViewById(R.id.detailConainer) != null)
            twoPan = true;


        ItemsFaragment itemsFaragment =
                new ItemsFaragment();
        getSupportFragmentManager().
                beginTransaction()
                .add(R.id.item_container,
                        itemsFaragment).commit();





    }

}
