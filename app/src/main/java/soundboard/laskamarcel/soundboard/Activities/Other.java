package soundboard.laskamarcel.soundboard.Activities;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import soundboard.laskamarcel.soundboard.R;

public class Other extends AppCompatActivity {

    private Button akwardcrickets, bassboost, cykablyat, dundunduunnn, ruskirage,
            sadtrombone, shutyourfuckingmouth, earrape, knowledgetailopez, windowsxploggingoff, fusrodah;
    private MediaPlayer mediaPlayer;
    private boolean isMediaPlayerRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        initializeComponents();
        setListeners();
        initializeAdBanner();
    }

    public void initializeComponents() {
        akwardcrickets = findViewById(R.id.button_akwardcrickets);
        bassboost = findViewById(R.id.button_bassboost);
        cykablyat = findViewById(R.id.button_cykablyat);
        dundunduunnn = findViewById(R.id.button_dunduunnduuuunnn);
        ruskirage = findViewById(R.id.button_ruskirage);
        sadtrombone = findViewById(R.id.button_sadtrombone);
        shutyourfuckingmouth = findViewById(R.id.button_shutyourfuckingmouth);
        earrape = findViewById(R.id.button_earrape);
        knowledgetailopez = findViewById(R.id.button_knowledgetailopez);
        windowsxploggingoff = findViewById(R.id.button_windowsxploggingoff);
        fusrodah = findViewById(R.id.button_fusrodah);
    }

    public void initializeAdBanner() {
        MobileAds.initialize(this, "ca-app-pub-9597544663912601~5019259712");
        AdView adView2 = new AdView(this);
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView2.setAdSize(AdSize.BANNER);

        adView.setAdUnitId("ca-app-pub-9597544663912601/6641255158");
        adView2.setAdUnitId("ca-app-pub-9597544663912601/6641255158");
        adView = findViewById(R.id.adView);
        adView2 = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        AdRequest adRequest2 = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
        adView2.loadAd(adRequest2);
    }

    public void stopAndRelease() {
        if (isMediaPlayerRunning == true) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }

    public void setListeners() {
        akwardcrickets.setOnClickListener(new ButtonListener());
        bassboost.setOnClickListener(new ButtonListener());
        cykablyat.setOnClickListener(new ButtonListener());
        dundunduunnn.setOnClickListener(new ButtonListener());
        ruskirage.setOnClickListener(new ButtonListener());
        sadtrombone.setOnClickListener(new ButtonListener());
        shutyourfuckingmouth.setOnClickListener(new ButtonListener());
        earrape.setOnClickListener(new ButtonListener());
        knowledgetailopez.setOnClickListener(new ButtonListener());
        windowsxploggingoff.setOnClickListener(new ButtonListener());
        fusrodah.setOnClickListener(new ButtonListener());
    }

    private class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (v.equals(akwardcrickets)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.akwardcrickets);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(bassboost)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bassboost);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(cykablyat)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cykablyat);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(dundunduunnn)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dundunduuun);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(ruskirage)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ruskirage);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(sadtrombone)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sadtrombone);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(shutyourfuckingmouth)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.shutttyourfuckingmauht);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(earrape)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.earrape);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(knowledgetailopez)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.knowledgetailopezparody);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(windowsxploggingoff)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.windowsxploggingoff);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(fusrodah)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.fusrodah);
                mediaPlayer.start();
                isMediaPlayerRunning = true;
            }
        }
    }
}
