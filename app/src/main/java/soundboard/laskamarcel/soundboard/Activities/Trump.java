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

public class Trump extends AppCompatActivity {

    private Button jail, china, datingIvanka, fakeNews, fireAndFury,
            buildAGreatWall, makeAmericaGreatAgain, smallLoan, youreFired;
    private MediaPlayer mediaPlayer;
    private boolean isMediaPlayerRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trump);
        initializeComponents();
        setButtonListeners();
        initializeAdBanner();
    }

    public void initializeComponents() {
        jail = findViewById(R.id.button_becauseyoudbeinjail);
        china = findViewById(R.id.button_china);
        datingIvanka = findViewById(R.id.button_datingIvanka);
        fakeNews = findViewById(R.id.button_fakenews);
        fireAndFury = findViewById(R.id.button_fireandfury);
        buildAGreatWall = findViewById(R.id.button_greatwall);
        makeAmericaGreatAgain = findViewById(R.id.button_makeamericagreatagain);
        smallLoan = findViewById(R.id.button_smallloan);
        youreFired = findViewById(R.id.button_yourefired);
    }

    public void setButtonListeners() {
        jail.setOnClickListener(new ButtonListener());
        china.setOnClickListener(new ButtonListener());
        datingIvanka.setOnClickListener(new ButtonListener());
        fakeNews.setOnClickListener(new ButtonListener());
        fireAndFury.setOnClickListener(new ButtonListener());
        buildAGreatWall.setOnClickListener(new ButtonListener());
        makeAmericaGreatAgain.setOnClickListener(new ButtonListener());
        smallLoan.setOnClickListener(new ButtonListener());
        youreFired.setOnClickListener(new ButtonListener());
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


    private class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (v.equals(jail)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.becauseyoudbeinjail);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(china)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.china);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(datingIvanka)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.datingdaughter);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(fakeNews)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.fakenews);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(fireAndFury)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.fireandfury);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(buildAGreatWall)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.greatgreatwall);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(makeAmericaGreatAgain)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.makeamericagreatagain);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(smallLoan)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.smallloanofamilliondollars);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(youreFired)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.yourefired);
                mediaPlayer.start();
                isMediaPlayerRunning = true;
            }
        }
    }
}
