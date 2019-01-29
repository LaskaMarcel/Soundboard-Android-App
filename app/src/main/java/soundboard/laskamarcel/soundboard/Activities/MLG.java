package soundboard.laskamarcel.soundboard.Activities;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.security.PrivateKey;

import soundboard.laskamarcel.soundboard.R;

public class MLG extends AppCompatActivity {

    private Button twentyCentury, damnSon, dedodatedWam, doYouHonestlyThink, fuckHerRight,
            gottaGoFast, hitmark, disortedViolin, illuminatiConfirmed, mlgHorns, momGetTheCamera,
            ohBabyATriple, ohOhOhMyGod, sadViolin, smokeWeedEveryday, getNoscoped, leeroy, nuke, bombPlant;

    private MediaPlayer mediaPlayer;
    private boolean isMediaPlayerRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mlg);
        initializeComponents();
        setButtonListeners();
        initializeAdBanner();
    }

    public void initializeComponents() {
        twentyCentury = findViewById(R.id.button_20thCentury);
        damnSon = findViewById(R.id.button_DamnSon);
        dedodatedWam = findViewById(R.id.button_DetotatedWam);
        doYouHonestlyThink = findViewById(R.id.button_DoYouHonestlyThink);
        fuckHerRight = findViewById(R.id.button_FuckHerRightInThePussy);
        gottaGoFast = findViewById(R.id.button_GottaGoFast);
        hitmark = findViewById(R.id.button_Hitmark);
        disortedViolin = findViewById(R.id.button_DisortedSadViolin);
        illuminatiConfirmed = findViewById(R.id.button_IlluminatiConfirmed);
        mlgHorns = findViewById(R.id.button_MLGHorns);
        momGetTheCamera = findViewById(R.id.button_MoMGetTheCamera);
        ohBabyATriple = findViewById(R.id.button_OhBabyATriple);
        ohOhOhMyGod = findViewById(R.id.button_OhOhOhMyGod);
        sadViolin = findViewById(R.id.button_SadViolin);
        smokeWeedEveryday = findViewById(R.id.button_SmokeWeedEveryday);
        getNoscoped = findViewById(R.id.button_GetNoscoped);
        leeroy = findViewById(R.id.button_leeroyJenkins);
        nuke = findViewById(R.id.button_TacticalNuke);
        bombPlant = findViewById(R.id.button_bombhasbeenplanted);

    }

    public void setButtonListeners() {
        twentyCentury.setOnClickListener(new ButtonListener());
        damnSon.setOnClickListener(new ButtonListener());
        dedodatedWam.setOnClickListener(new ButtonListener());
        doYouHonestlyThink.setOnClickListener(new ButtonListener());
        fuckHerRight.setOnClickListener(new ButtonListener());
        gottaGoFast.setOnClickListener(new ButtonListener());
        hitmark.setOnClickListener(new ButtonListener());
        disortedViolin.setOnClickListener(new ButtonListener());
        illuminatiConfirmed.setOnClickListener(new ButtonListener());
        mlgHorns.setOnClickListener(new ButtonListener());
        momGetTheCamera.setOnClickListener(new ButtonListener());
        ohBabyATriple.setOnClickListener(new ButtonListener());
        ohOhOhMyGod.setOnClickListener(new ButtonListener());
        sadViolin.setOnClickListener(new ButtonListener());
        smokeWeedEveryday.setOnClickListener(new ButtonListener());
        getNoscoped.setOnClickListener(new ButtonListener());
        leeroy.setOnClickListener(new ButtonListener());
        nuke.setOnClickListener(new ButtonListener());
        bombPlant.setOnClickListener(new ButtonListener());
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
        public void onClick(View v) {
            if (v.equals(twentyCentury)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.twentycentury);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(damnSon)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.damnson);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(dedodatedWam)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dedotatedwam);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(doYouHonestlyThink)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.doyouhonesltyhink);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(fuckHerRight)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.rightinthe);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(gottaGoFast)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.gottagofast);
                mediaPlayer.start();
                isMediaPlayerRunning = true;
            } else if (v.equals(hitmark)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.hitmark);
                mediaPlayer.start();
                isMediaPlayerRunning = true;


            } else if (v.equals(disortedViolin)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.disortedviolin);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(illuminatiConfirmed)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.illuminaticonfirmed);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(mlgHorns)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.mlghorns);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(momGetTheCamera)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.momgetthacamera);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(ohBabyATriple)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ohbabyatriple);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(ohOhOhMyGod)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ohohohmygod);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(sadViolin)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sadviolin);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(smokeWeedEveryday)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.smokeweedeveriday);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(getNoscoped)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.getnoscoped);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(leeroy)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.leeroy);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(nuke)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.tacticalnuke);
                mediaPlayer.start();
                isMediaPlayerRunning = true;

            } else if (v.equals(bombPlant)) {
                stopAndRelease();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bombhasbeenplanted);
                mediaPlayer.start();
                isMediaPlayerRunning = true;
            }
        }
    }
}
