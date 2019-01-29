package soundboard.laskamarcel.soundboard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import soundboard.laskamarcel.soundboard.Activities.*;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class Sound_Board extends AppCompatActivity {

    private Button mlg, music, vines, dank_memes, other, trump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound__board);
        initializeComponents();
        setButtonListeners();
        initializeAdBanner();
    }

    public void initializeComponents(){
        mlg = findViewById(R.id.buttonMLG);
        music = findViewById(R.id.buttonMUSIC);
        vines = findViewById(R.id.buttonVINES);
        dank_memes = findViewById(R.id.buttonMEMES);
        other = findViewById(R.id.buttonOTHER);
        trump = findViewById(R.id.buttonDONALDTRUMP);
    }

    public void setButtonListeners(){
        mlg.setOnClickListener(new Listener());
        music.setOnClickListener(new Listener());
        vines.setOnClickListener(new Listener());
        dank_memes.setOnClickListener(new Listener());
        other.setOnClickListener(new Listener());
        trump.setOnClickListener(new Listener());
    }

    public void initializeAdBanner(){
        MobileAds.initialize(this, "ca-app-pub-9597544663912601~5019259712");
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        // MY AD
        // adView.setAdUnitId("ca-app-pub-9597544663912601/6641255158");
        // TEST AD
        adView.setAdUnitId("ca-app-pub-9597544663912601/6641255158");
        adView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

    }

    private class Listener implements View.OnClickListener {

        public void onClick(View v) {
            if (v.equals(mlg)) {
                Intent startMLG = new Intent(Sound_Board.this, MLG.class);
                startActivity(startMLG);

            } else if (v.equals(music)) {
                Intent startMusic = new Intent(Sound_Board.this, Music.class);
                startActivity(startMusic);

            } else if (v.equals(dank_memes)) {
                Intent startDankMemes = new Intent(Sound_Board.this, DankMemes.class);
                startActivity(startDankMemes);

            } else if (v.equals(other)) {
                Intent startOther = new Intent(Sound_Board.this, Other.class);
                startActivity(startOther);

            } else if (v.equals(vines)) {
                Intent startVines = new Intent(Sound_Board.this, Vines.class);
                startActivity(startVines);

            } else if (v.equals(trump)) {
                Intent startTrump = new Intent(Sound_Board.this, Trump.class);
                startActivity(startTrump);
            }
        }
    }
}
