package arisyrifki.app.uasmobpro;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by rfkchrl on 12/14/2018.
 */

public class SplashActivity extends AppCompatActivity {

    //set waktu loading splash berapa detik, 3000 = 3detik
    //tergantung programmer untuk waktu tunggu splashnya berapa detik
    private final static int TIGA_DETIK = 3000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        countDown();
    }

    private void countDown() {
        Handler handler = new Handler();

        Runnable menunggu = new Runnable() {
            @Override
            public void run() {
                //menambahkan method untuk pergi ke activity main
                gotoMain();
            }
        };
        //pada saat diSplash Activity, sebelum masuk ke main akan menunggu 3 detik
        handler.postDelayed(menunggu, TIGA_DETIK);
    }

    private void gotoMain() {
        //mengintent dari actiity ini menuju mainactivity
        Intent intentMain = new Intent(SplashActivity.this, MainActivity.class);
        //memulai perpindahan layout
        startActivity(intentMain);
        //jika  perpindahan berhasil maka selesai
        finish();
    }
}
