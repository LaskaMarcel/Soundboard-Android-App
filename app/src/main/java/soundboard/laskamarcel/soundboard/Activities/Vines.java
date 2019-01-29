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

public class Vines extends AppCompatActivity {

    private Button breakfast, damndaniel, hagayyy, heneedsomemilk, iamtheone, itswednesday, itwasatthismoment,
            jellybeansup, okafricanman, reallynigga, runningmanchallenge, skrrrskrrr, thisniggagay, trymebitch,
            whatarethose, whyareyourunning, yassscrackkid;
    private MediaPlayer mediaPlayer;
    private boolean isMediaPlayerRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vines);
        initializeComponents();
        setListeners();
        initializeAdBanner();
    }

    public void initializeComponents() {
        breakfast = findViewById(R.id.button_breakfast);
        damndaniel = findViewById(R.id.button_damndaniel);
        hagayyy = findViewById(R.id.button_hagaaay);
        heneedsomemilk = findViewById(R.id.button_heneedsomemilk);
        iamtheone = findViewById(R.id.button_iamtheone);
        itswednesday = findViewById(R.id.button_itswednesdaymydudes);
        itwasatthismoment = findViewById(R.id.button_itwasatthismomentheknew);
        jellybeansup = findViewById(R.id.button_jellybeansupmyass);
        okafricanman = findViewById(R.id.button_okafricanman);
        reallynigga = findViewById(R.id.button_reallynigga);
        runningmanchallenge = findViewById(R.id.button_runningmanchallenge);
        skrrrskrrr = findViewById(R.id.button_skrrrskrrr);
        thisniggagay = findViewById(R.id.button_thisniggagay);
        trymebitch = findViewById(R.id.button_trymebitch);
        whatarethose = findViewById(R.id.button_whatarethose);
        whyareyourunning = findViewById(R.id.button_whyareyourunning);
        yassscrackkid = findViewById(R.id.button_yaaaascrackkid);
    }

    public void setListeners() {
        breakfast.setOnClickListener(new ButtonListener());
        damndaniel.setOnClickListener(new ButtonListener());
        hagayyy.setOnClickListener(new ButtonListener());
        heneedsomemilk.setOnClickListener(new ButtonListener());
        iamtheone.setOnClickListener(new ButtonListener());
        itswednesday.setOnClickListener(new ButtonListener());
        itwasatthismoment.setOnClickListener(new ButtonListener());
        jellybeansup.setOnClickListener(new ButtonListener());
        okafricanman.setOnClickListener(new ButtonListener());
        reallynigga.setOnClickListener(new ButtonListener());
        runningmanchallenge.setOnClickListener(new ButtonListener());
        skrrrskrrr.setOnClickListener(new ButtonListener());
        thisniggagay.setOnClickListener(new ButtonListener());
        trymebitch.setOnClickListener(new ButtonListener());
        whatarethose.setOnClickListener(new ButtonListener());
        whyareyourunning.setOnClickListener(new ButtonListener());
        yassscrackkid.setOnClickListener(new ButtonListener());
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
            if (v.equals(breakfast)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.breakfast);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(damndaniel)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.damndaniel);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(hagayyy)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.hagayyy);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(heneedsomemilk)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.heneedsomemilk);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(iamtheone)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.iamtheone);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(itswednesday)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.itiswednesdaymydudes);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(itwasatthismoment)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.itwasatthismoment);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(jellybeansup)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.jellyebansuppmyass);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(okafricanman)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.okafricanman);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(reallynigga)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.reallynigga);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(runningmanchallenge)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.runningman);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(skrrrskrrr)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.skrrrskrrr);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(thisniggagay)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.thisniggagay);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(trymebitch)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.trymebitch);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(whatarethose)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.whatarethooose);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(whyareyourunning)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.whyareyourunning);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(yassscrackkid)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.yasssscrackkid);
                mediaPlayer.start();
                isMediaPlayerRunning = true;
            }
        }
    }
}
