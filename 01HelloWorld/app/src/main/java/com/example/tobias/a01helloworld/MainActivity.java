package com.example.tobias.a01helloworld;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toolbar;

/*
1) Erzeugen eines Textes mit einem Bild daneben.
2) Logging Activity (Dokument 5 - Kapitel 4)
 */
public class MainActivity extends AppCompatActivity {

    // (1) (4.1; App Prozess beendet) Activity wird erstellt; Lebenszyklus beginnt
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // führt die XML-Datei aus, die das Design der Activity beschreibt
        setContentView(R.layout.activity_main);
    }

    // (2) Activity ist kurz davor sichtbar zu werden
    @Override
    protected void onStart() {
        Log.d("myTag", "onStart is clicked");
        super.onStart();
    }

    // (6; user navigiert zur Activity)
    // Activity wird neu gestartet; nächstes wird "onStart()" aufgerufen
    @Override
    protected void onRestart() {
        Log.d("myTag", "onRestart is clicked");
        super.onRestart();
    }

    // (3) (4.1; user kehrt zurück zur Activity) Activity ist sichtbar; im Fokus des Benutzer
    @Override
    protected void onResume() {
        Log.d("myTag", "onResume is clicked");
        super.onResume();
    }

    // (4) andere Activity erhält den Fokus; Activity pausiert
    @Override
    protected void onPause() {
        Log.d("myTag", "onPause is clicked");
        super.onPause();
    }

    // (5)  Activity ist nicht mehr sichtbar; wird gestoppt
    @Override
    protected void onStop() {
        Log.d("myTag", "onStop is clicked");
        super.onStop();
    }

    // (7; Activity wird vom System zerstört) Activity wird zerstört; Lebenszyklus beendet
    @Override
    protected void onDestroy() {
        Log.d("myTag", "onDestroy is clicked");
        super.onDestroy();
    }
}
