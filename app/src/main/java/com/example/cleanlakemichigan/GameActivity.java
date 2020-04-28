package com.example.cleanlakemichigan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class GameActivity extends AppCompatActivity {

    public static int act = 0;
    public static int finish = 0;
    public static int Cchem = 0;
    public static int Cphos = 0;
    public static int Cship = 0;
    public static int Cfish = 0;
    public static int Cmussel = 0;
    public static int con = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_game);

        Button Bchemical = findViewById(R.id.Bchemical);
        Button Bphos = findViewById(R.id.Bphosphorus);
        Button Bfish = findViewById(R.id.Bfish);
        Button Bship = findViewById(R.id.Bship);
        Button Bmussel = findViewById(R.id.Bmussel);
        final ImageView Iact = findViewById(R.id.act);
        final Button Bact = findViewById(R.id.Bact);
        final Button close = findViewById(R.id.close);
        final ImageButton donate = findViewById(R.id.donate);
        final TextView text = findViewById(R.id.text);
        Button back = findViewById(R.id.back);

        String st = getString(R.string.intro);
        text.setText(st);
        text.setVisibility(View.VISIBLE);
        close.setVisibility(View.VISIBLE);

        Bchemical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (act == 0) {
                    String st = getString(R.string.chem);
                    text.setText(st);
                    text.setVisibility(View.VISIBLE);
                    close.setVisibility(View.VISIBLE);
                    if (Cchem == 0) {
                        finish++;
                    }
                    Cchem = 1;
                } else {
                    String st = getString(R.string.chemAct);
                    text.setText(st);
                    text.setVisibility(View.VISIBLE);
                    close.setVisibility(View.VISIBLE);
                    if (Cchem == 0) {
                        finish++;
                    }
                    Cchem = 1;
                }
            }
        });
        Bphos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (act == 0 ) {
                    String st = getString(R.string.phos);
                    text.setText(st);
                    text.setVisibility(View.VISIBLE);
                    close.setVisibility(View.VISIBLE);
                    if (Cphos == 0) {
                        finish++;
                    }
                    Cphos = 1;
                } else {
                    String st = getString(R.string.phosAct);
                    text.setText(st);
                    text.setVisibility(View.VISIBLE);
                    close.setVisibility(View.VISIBLE);
                    if (Cphos == 0) {
                        finish++;
                    }
                    Cphos = 1;
                }
            }
        });
        Bfish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (act == 0) {
                    String st = getString(R.string.habbitat);
                    text.setText(st);
                    text.setVisibility(View.VISIBLE);
                    close.setVisibility(View.VISIBLE);
                    if (Cfish == 0) {
                        finish++;
                    }
                    Cfish = 1;
                } else {
                    String st = getString(R.string.habbitatAct);
                    text.setText(st);
                    text.setVisibility(View.VISIBLE);
                    close.setVisibility(View.VISIBLE);
                    if (Cfish == 0) {
                        finish++;
                    }
                    Cfish = 1;
                }
            }
        });
        Bship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (act == 0) {
                    String st = getString(R.string.ballast);
                    text.setText(st);
                    text.setVisibility(View.VISIBLE);
                    close.setVisibility(View.VISIBLE);
                    if (Cship == 0) {
                        finish++;
                    }
                    Cship = 1;
                } else {
                    String st = getString(R.string.ballastAct);
                    text.setText(st);
                    text.setVisibility(View.VISIBLE);
                    close.setVisibility(View.VISIBLE);
                    if (Cship == 0) {
                        finish++;
                    }
                    Cship = 1;
                }
            }
        });
        Bmussel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (act == 0) {
                    String st = getString(R.string.Invasive);
                    text.setText(st);
                    text.setVisibility(View.VISIBLE);
                    close.setVisibility(View.VISIBLE);
                    if (Cmussel == 0) {
                        finish++;
                    }
                    Cmussel = 1;
                } else {
                    String st = getString(R.string.InvasiveAct);
                    text.setText(st);
                    text.setVisibility(View.VISIBLE);
                    close.setVisibility(View.VISIBLE);
                    if (Cmussel == 0) {
                        finish++;
                    }
                    Cmussel = 1;
                }
            }
        });
        donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String st = getString(R.string.Donate);
                text.setText(st);
                text.setVisibility(View.VISIBLE);
                close.setVisibility(View.VISIBLE);
            }
        });
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setVisibility(View.INVISIBLE);
                close.setVisibility(View.INVISIBLE);
                if (finish == 5 && act == 1) {
                    end();
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menu();
            }
        });
        Bact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (finish != 5) {
                    String st = getString(R.string.act1);
                    text.setText(st);
                    text.setVisibility(View.VISIBLE);
                    close.setVisibility(View.VISIBLE);
                } else {
                    String st = getString(R.string.introa);
                    text.setText(st);
                    text.setVisibility(View.VISIBLE);
                    close.setVisibility(View.VISIBLE);
                    act = 1;
                    finish = 0;
                    Cchem = 0;
                    Cphos = 0;
                    Cship = 0;
                    Cfish = 0;
                    Cmussel = 0;
                    Bact.setVisibility(View.INVISIBLE);
                    Iact.setVisibility(View.GONE);
                }
            }
        });
    }

    public void end() {
        con = 1;
        String st = getString(R.string.con);
        final TextView text = findViewById(R.id.text);
        //final Button close = findViewById(R.id.close);
        final ImageButton donate = findViewById(R.id.donate);
        final Button back = findViewById(R.id.back);
        Button Bchemical = findViewById(R.id.Bchemical);
        Button Bphos = findViewById(R.id.Bphosphorus);
        Button Bfish = findViewById(R.id.Bfish);
        Button Bship = findViewById(R.id.Bship);
        Button Bmussel = findViewById(R.id.Bmussel);
        Bchemical.setVisibility(View.INVISIBLE);
        Bphos.setVisibility(View.INVISIBLE);
        Bfish.setVisibility(View.INVISIBLE);
        Bship.setVisibility(View.INVISIBLE);
        Bmussel.setVisibility(View.INVISIBLE);
        text.setText(st);
        text.setVisibility(View.VISIBLE);
        back.setVisibility(View.VISIBLE);
        donate.setVisibility(View.VISIBLE);
    }

    public void menu() {
        act = 0;
        finish = 0;
        Cchem = 0;
        Cphos = 0;
        Cship = 0;
        Cfish = 0;
        Cmussel = 0;
        con = 0;
        Intent start = new Intent(this, MainActivity.class);
        startActivity(start);
    }



}
