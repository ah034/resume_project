package com.example.movie1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    ImageView kgf,kantara,kabzaa,kirik,vr,shivaji,war,dangal,sulthan,bramhasthra,avatar1,avatar2,avengers,thor;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        kgf=findViewById(R.id.kgf);
        kantara=findViewById(R.id.kantara);
        kabzaa=findViewById(R.id.kabza);
        vr=findViewById(R.id.vr);
        kirik=findViewById(R.id.kirik);
        shivaji=findViewById(R.id.shivaji);
        war=findViewById(R.id.war);
        dangal=findViewById(R.id.dangal);
        sulthan=findViewById(R.id.sulthan);
        bramhasthra=findViewById(R.id.bramhastra);
        avatar1=findViewById(R.id.avatar1);
        avatar2=findViewById(R.id.avatar2);
        avengers=findViewById(R.id.avengers);
        thor=findViewById(R.id.thor);


        kgf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://firebasestorage.googleapis.com/v0/b/movie-18d80.appspot.com/o/KGF.mp4?alt=media&token=71ff259b-8245-4b9c-ab64-962377e03be1";
                String title="KGF";
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("url",url);
                intent.putExtra("title",title);
                startActivity(intent);
            }
        });

        kantara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://firebasestorage.googleapis.com/v0/b/movie-18d80.appspot.com/o/KANTARA.mp4?alt=media&token=d0a75fae-64aa-4365-b271-342f88635efa";
                String title="KANTARA";
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("url",url);
                intent.putExtra("title",title);
                startActivity(intent);
            }
        });

        kabzaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://firebasestorage.googleapis.com/v0/b/movie-18d80.appspot.com/o/KABZAA.mp4?alt=media&token=a71bfa32-4289-4254-b717-93c386b5b0b4";
                String title="KANBZAA";
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("url",url);
                intent.putExtra("title",title);
                startActivity(intent);
            }
        });

        vr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://firebasestorage.googleapis.com/v0/b/movie-18d80.appspot.com/o/VIKRANT_RONA.mp4?alt=media&token=c7be8755-78a1-44ea-b3cb-f68752abc75c";
                String title="VIKRANTH RONA";
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("url",url);
                intent.putExtra("title",title);
                startActivity(intent);
            }
        });

        kirik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://firebasestorage.googleapis.com/v0/b/movie-18d80.appspot.com/o/KIRIK_PARTY.mp4?alt=media&token=934586bf-8880-4927-a158-cacef639d2f9";
                String title="KIRIK PARTY";
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("url",url);
                intent.putExtra("title",title);
                startActivity(intent);
            }
        });

        shivaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://firebasestorage.googleapis.com/v0/b/movie-18d80.appspot.com/o/SHIVAJI_SURATHKAL.mp4?alt=media&token=1fd9aee8-d773-4e42-837d-b7198a2c5d20";
                String title="SHIVAJI SURATHKAL";
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("url",url);
                intent.putExtra("title",title);
                startActivity(intent);
            }
        });

        war.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://firebasestorage.googleapis.com/v0/b/movie-18d80.appspot.com/o/WAR.mp4?alt=media&token=d4485ec2-f510-48c0-b5eb-0ae00fcd97de";
                String title="WAR";
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("url",url);
                intent.putExtra("title",title);
                startActivity(intent);
            }
        });

        dangal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://firebasestorage.googleapis.com/v0/b/movie-18d80.appspot.com/o/DANGAL.mp4?alt=media&token=89c8436d-c6c4-4d5d-bed5-db2f4f6b4ed0";
                String title="DANGAL";
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("url",url);
                intent.putExtra("title",title);
                startActivity(intent);
            }
        });

        sulthan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://firebasestorage.googleapis.com/v0/b/movie-18d80.appspot.com/o/SULTHAN.mp4?alt=media&token=d9f43868-fb54-4ed8-a915-633344131605";
                String title="SULTHAN";
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("url",url);
                intent.putExtra("title",title);
                startActivity(intent);
            }
        });

        bramhasthra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://firebasestorage.googleapis.com/v0/b/movie-18d80.appspot.com/o/BRAHMASTRA.mp4?alt=media&token=b8b979b8-028e-4e64-ad77-504518fabc4b";
                String title="BRAMHASTHRA";
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("url",url);
                intent.putExtra("title",title);
                startActivity(intent);
            }
        });

        avatar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://firebasestorage.googleapis.com/v0/b/movie-18d80.appspot.com/o/AVATAR.mp4?alt=media&token=5b9fd693-902a-4672-8df7-549759850b06";
                String title="AVATAR 1";
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("url",url);
                intent.putExtra("title",title);
                startActivity(intent);
            }
        });

        avatar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://firebasestorage.googleapis.com/v0/b/movie-18d80.appspot.com/o/AVATAR.mp4?alt=media&token=5b9fd693-902a-4672-8df7-549759850b06";
                String title="AVATAR 2";
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("url",url);
                intent.putExtra("title",title);
                startActivity(intent);
            }
        });

        avengers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://firebasestorage.googleapis.com/v0/b/movie-18d80.appspot.com/o/AVENGERS_ENDGAME.mp4?alt=media&token=922ceacb-69db-45eb-ae72-b665bcb5ff45";
                String title="AVENGERS";
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("url",url);
                intent.putExtra("title",title);
                startActivity(intent);
            }
        });

        thor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url="https://firebasestorage.googleapis.com/v0/b/movie-18d80.appspot.com/o/THOR_LOVE.mp4?alt=media&token=81d975c8-8ead-47e8-a42f-3dbaacd10215";
                String title="THOR LOVE AND THUNDER";
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                intent.putExtra("url",url);
                intent.putExtra("title",title);
                startActivity(intent);
            }
        });

    }
}