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

public class DankMemes extends AppCompatActivity {

    private Button aintnobodygottimeforthat, aliaintro, arrowtotheknee, bitchwhatthefuck, bruh,
            cashmeoutside, deeznuts, dillydilly, doyouknowdawae, englandismycity, funfunfunkazoo,
            heythatsprettygood, heyvsauce, idontgiveafuck, ihavecrippling, imlegallyblind, imrickharrison,
            ivefallenandcantgetup, johncena, justdoit, keemstarfuckthefans, keemstarintro, keemstartruth,
            ladiesandgentlemenwegothim, lemmesmash, minecraftdamage, minecraftvillager, mynameisjeff,
            mynameispewdiepie, nani, nootnoot, ohohretardalert, omgwhothehellcares, triggered, shrekhellothere, skrattarduintro,
            somebodytouchmaspaghet, thatwaslegitness, twentyoneyoustupid, wastedgtav, wegotabadassoverhere,
            wheresmymoneybitch, whyyoualwayslyin, yeahboiii, yodelingkid, youneedtoshutthefuckup;

    private MediaPlayer mediaPlayer;
    private boolean isMediaPlayerRunning = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dank_memes);
        initializeComponents();
        setListeners();
        initializeAdBanner();
    }

    public void initializeComponents() {
        aintnobodygottimeforthat = findViewById(R.id.button_aintnobodygottimeforthat);
        aliaintro = findViewById(R.id.button_aliaintro);
        arrowtotheknee = findViewById(R.id.button_arrowintheknee);
        bitchwhatthefuck = findViewById(R.id.button_bitchwhatthefuck);
        bruh = findViewById(R.id.button_bruh);
        cashmeoutside = findViewById(R.id.button_cashmeoutside);
        deeznuts = findViewById(R.id.button_deeznuts);
        dillydilly = findViewById(R.id.button_dillydilly);
        doyouknowdawae = findViewById(R.id.button_doyouknowtheway);
        englandismycity = findViewById(R.id.button_englandismycity);
        funfunfunkazoo = findViewById(R.id.button_funfunfunkazoiikid);
        heythatsprettygood = findViewById(R.id.button_heythatsprettygood);
        heyvsauce = findViewById(R.id.button_heyvsauce);
        idontgiveafuck = findViewById(R.id.button_idontgiveafuck);
        ihavecrippling = findViewById(R.id.button_ihavecripplingdepression);
        imlegallyblind = findViewById(R.id.button_imlegallyblind);
        imrickharrison = findViewById(R.id.button_imrickharrison);
        ivefallenandcantgetup = findViewById(R.id.button_ivefallenandicantgetup);
        johncena = findViewById(R.id.button_johncena);
        justdoit = findViewById(R.id.button_justdoit);
        keemstarfuckthefans = findViewById(R.id.button_keemstarfuckthefans);
        keemstarintro = findViewById(R.id.button_keemstarintro);
        keemstartruth = findViewById(R.id.button_keemstartruth);
        ladiesandgentlemenwegothim = findViewById(R.id.button_ladiesandgentlemenwegothim);
        lemmesmash = findViewById(R.id.button_lemmesmash);
        minecraftdamage = findViewById(R.id.button_minecraftdamage);
        minecraftvillager = findViewById(R.id.button_minecraftvillager);
        mynameisjeff = findViewById(R.id.button_mynameisjeff);
        mynameispewdiepie = findViewById(R.id.button_mynameispewdiepie);
        nani = findViewById(R.id.button_nani);
        nootnoot = findViewById(R.id.button_nootnoot);
        ohohretardalert = findViewById(R.id.button_retardalert);
        omgwhothehellcares = findViewById(R.id.button_omgwhothehellcares);
        shrekhellothere = findViewById(R.id.button_shrekhellothere);
        skrattarduintro = findViewById(R.id.button_skrattarduforlorardu);
        somebodytouchmaspaghet = findViewById(R.id.button_somebodytouchmaspaghet);
        thatwaslegitness = findViewById(R.id.button_thatwaslegitness);
        twentyoneyoustupid = findViewById(R.id.button_twentyoneyoustupid);
        wastedgtav = findViewById(R.id.button_wasted);
        wegotabadassoverhere = findViewById(R.id.button_wegotabadassoverhere);
        wheresmymoneybitch = findViewById(R.id.button_wheresmymoneybitch);
        whyyoualwayslyin = findViewById(R.id.button_whyyoualwayslyin);
        yeahboiii = findViewById(R.id.button_yeahboiii);
        triggered = findViewById(R.id.button_triggered);
        yodelingkid = findViewById(R.id.button_yodelingkid);
        youneedtoshutthefuckup = findViewById(R.id.button_youneedtoshutthefuckup);
    }

    public void setListeners() {
        aintnobodygottimeforthat.setOnClickListener(new ButtonListener());
        aliaintro.setOnClickListener(new ButtonListener());
        arrowtotheknee.setOnClickListener(new ButtonListener());
        bitchwhatthefuck.setOnClickListener(new ButtonListener());
        bruh.setOnClickListener(new ButtonListener());
        cashmeoutside.setOnClickListener(new ButtonListener());
        heyvsauce.setOnClickListener(new ButtonListener());
        idontgiveafuck.setOnClickListener(new ButtonListener());
        heythatsprettygood.setOnClickListener(new ButtonListener());
        ihavecrippling.setOnClickListener(new ButtonListener());
        deeznuts.setOnClickListener(new ButtonListener());
        dillydilly.setOnClickListener(new ButtonListener());
        doyouknowdawae.setOnClickListener(new ButtonListener());
        englandismycity.setOnClickListener(new ButtonListener());
        funfunfunkazoo.setOnClickListener(new ButtonListener());
        ivefallenandcantgetup.setOnClickListener(new ButtonListener());
        johncena.setOnClickListener(new ButtonListener());
        justdoit.setOnClickListener(new ButtonListener());
        keemstartruth.setOnClickListener(new ButtonListener());
        keemstarintro.setOnClickListener(new ButtonListener());
        keemstarfuckthefans.setOnClickListener(new ButtonListener());
        imlegallyblind.setOnClickListener(new ButtonListener());
        imrickharrison.setOnClickListener(new ButtonListener());
        ladiesandgentlemenwegothim.setOnClickListener(new ButtonListener());
        lemmesmash.setOnClickListener(new ButtonListener());
        minecraftvillager.setOnClickListener(new ButtonListener());
        minecraftdamage.setOnClickListener(new ButtonListener());
        mynameispewdiepie.setOnClickListener(new ButtonListener());
        mynameisjeff.setOnClickListener(new ButtonListener());
        nani.setOnClickListener(new ButtonListener());
        nootnoot.setOnClickListener(new ButtonListener());
        ohohretardalert.setOnClickListener(new ButtonListener());
        omgwhothehellcares.setOnClickListener(new ButtonListener());
        shrekhellothere.setOnClickListener(new ButtonListener());
        skrattarduintro.setOnClickListener(new ButtonListener());
        somebodytouchmaspaghet.setOnClickListener(new ButtonListener());
        thatwaslegitness.setOnClickListener(new ButtonListener());
        triggered.setOnClickListener(new ButtonListener());
        twentyoneyoustupid.setOnClickListener(new ButtonListener());
        wastedgtav.setOnClickListener(new ButtonListener());
        wegotabadassoverhere.setOnClickListener(new ButtonListener());
        wheresmymoneybitch.setOnClickListener(new ButtonListener());
        whyyoualwayslyin.setOnClickListener(new ButtonListener());
        yeahboiii.setOnClickListener(new ButtonListener());
        yodelingkid.setOnClickListener(new ButtonListener());
        youneedtoshutthefuckup.setOnClickListener(new ButtonListener());
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
            if (v.equals(aintnobodygottimeforthat)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.aintnobodygottimeforthat);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;
                }

                else if (v.equals(aliaintro)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.aliaintroearrape);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(arrowtotheknee)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.arrowtotheknee);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(bitchwhatthefuck)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bitchwhatthefuck);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(bruh)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bruh);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(cashmeoutside)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.cashmeoutside);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(deeznuts)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.deeznuts);
                    mediaPlayer.start();

            } else if (v.equals(dillydilly)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dillydilly);
                    mediaPlayer.start();

            } else if (v.equals(doyouknowdawae)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dojuknowthewae);
                    mediaPlayer.start();


            } else if (v.equals(englandismycity)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.englandcity);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(funfunfunkazoo)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.funfunfunkazookid);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(heythatsprettygood)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.heythatsprettygood);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(heyvsauce)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.heyvsaucemichalehere);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(idontgiveafuck)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.idontgiveafuck);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(ihavecrippling)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ihavecripplingdepression);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;


            } else if (v.equals(imlegallyblind)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.imlegallyblind);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;


            } else if (v.equals(imrickharrison)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.imrickharrison);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(ivefallenandcantgetup)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ivefallenandcantgetup);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;


            } else if (v.equals(johncena)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.hisnameisjohncenaaaaa);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;


            } else if (v.equals(justdoit)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.justdoit);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(keemstarfuckthefans)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.keemstarfuckthefans);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(keemstarintro)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.keemstarintro);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(keemstartruth)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.keemstartruty);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(ladiesandgentlemenwegothim)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ladiesandgetnlemenwegotim);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(lemmesmash)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lemesmash);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(minecraftdamage)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.minecraftdamage);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(minecraftvillager)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.minecraftvillager);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(mynameisjeff)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.mynameisjeff);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(mynameispewdiepie)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.mynameispewdiepie);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(nani)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.nani);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(nootnoot)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.nootnoot);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(ohohretardalert)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.ohohretrdalert);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(omgwhothehellcares)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.omgwhothehellcares);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(shrekhellothere)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.shrekohhellothere);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(skrattarduintro)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.skrattarduintro);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(somebodytouchmaspaghet)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.somebodytouchmajspaghetti);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(thatwaslegitness)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.thatwaslegitness);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(twentyoneyoustupid)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.twentyoneyoustupid);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(wastedgtav)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wastedgtav);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(wegotabadassoverhere)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wegotabadassoverhere);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(wheresmymoneybitch)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.wheresmymoneybitchbreakingbad);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(whyyoualwayslyin)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.whyyoualwayslyin);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(yeahboiii)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.yeahboi);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(yodelingkid)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.yodelingkid);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(youneedtoshutthefuckup)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.youneedtostfu);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;

            } else if (v.equals(triggered)) {
                    stopAndRelease();
                    mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.triggered);
                    mediaPlayer.start();
                    isMediaPlayerRunning = true;
            }
        }
    }

}
