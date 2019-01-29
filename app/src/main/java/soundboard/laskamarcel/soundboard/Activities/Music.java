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

public class Music extends AppCompatActivity {

    private Button familiarfaces, kalinka, nyancat, run, wiigamingmusic, curbYourEnthusiasm, allstar,
    anotheronedjkhaled, tinggoesskrrra, boombigshaq, theyseemerolling, heemanheyeyey, nantsingonyamabagithibaba;
    private MediaPlayer mediaPlayer;
    private boolean isMediaPlayerRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        initializeComponents();
        setListeners();
        initializeAdBanner();
    }

    public void initializeComponents(){
        familiarfaces = findViewById(R.id.button_familiarfaces);
        kalinka = findViewById(R.id.button_kalinka);
        nyancat = findViewById(R.id.button_nyancat);
        run = findViewById(R.id.button_run);
        wiigamingmusic = findViewById(R.id.button_wiigamingmusic);
        curbYourEnthusiasm = findViewById(R.id.button_curbyourenthiusiasm);
        allstar = findViewById(R.id.button_allstar);
        anotheronedjkhaled = findViewById(R.id.button_anotherone);
        tinggoesskrrra = findViewById(R.id.button_tinggoesskrrra);
        boombigshaq = findViewById(R.id.button_boombigshaq);
        theyseemerolling = findViewById(R.id.button_theyseemerolling);
        heemanheyeyey = findViewById(R.id.button_heeman);
        nantsingonyamabagithibaba = findViewById(R.id.button_nantsingonyamabagithibaba);
    }

    public void setListeners(){
        familiarfaces.setOnClickListener(new ButtonListener());
        kalinka.setOnClickListener(new ButtonListener());
        nyancat.setOnClickListener(new ButtonListener());
        run.setOnClickListener(new ButtonListener());
        wiigamingmusic.setOnClickListener(new ButtonListener());
        curbYourEnthusiasm.setOnClickListener(new ButtonListener());
        allstar.setOnClickListener(new ButtonListener());
        anotheronedjkhaled.setOnClickListener(new ButtonListener());
        tinggoesskrrra.setOnClickListener(new ButtonListener());
        boombigshaq.setOnClickListener(new ButtonListener());
        theyseemerolling.setOnClickListener(new ButtonListener());
        heemanheyeyey.setOnClickListener(new ButtonListener());
        nantsingonyamabagithibaba.setOnClickListener(new ButtonListener());
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

    public class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (v.equals(familiarfaces)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.familiarfaces);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(kalinka)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.kalllinka);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(nyancat)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.njyancat);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(run)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.run);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(wiigamingmusic)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wiigamingmusic);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(curbYourEnthusiasm)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.curbmemetheme);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(anotheronedjkhaled)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.anotheronedjkhaled);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(allstar)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.allstar);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(tinggoesskrrra)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tinggoeskrrrra);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(boombigshaq)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.boombigshaq);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(theyseemerolling)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.theyseemeerolling);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;


            } else if (v.equals(heemanheyeyey)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.heyeyeyayaya);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(nantsingonyamabagithibaba)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.nantsingonyamabagithibaba);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;
            }
        }
    }
}
