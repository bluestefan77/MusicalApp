package com.example.stefano.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class sanremo2017Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanremo2017);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Francesco Gabbani", "Occidentali’s Karma"));
        songs.add(new Song("Fiorella Mannoia", "Che sia benedetta"));
        songs.add(new Song("Ermal Meta", "Vietato morire"));
        songs.add(new Song("Michele Bravi", "Il Diario Degli Errori"));
        songs.add(new Song("Elodie", "Tutta Colpa Mia"));
        songs.add(new Song("Bianca Atzei", "Ora esisti solo tu"));
        songs.add(new Song("Fabrizio Moro", "Portami via"));
        songs.add(new Song("Sergio Sylvestre", "Con Te"));
        songs.add(new Song("Paola Turci", "Fatti bella per te"));
        songs.add(new Song("Samuel", "Vedrai"));
        songs.add(new Song("Marco Masini", "Spostato di un secondo"));
        songs.add(new Song("Chiara", "Nessun posto è casa mia"));
        songs.add(new Song("Alessio Bernabei", "Nel mezzo di un applauso"));
        songs.add(new Song("Gigi D’Alessio", "La prima stella"));
        songs.add(new Song("Michele Zarrillo", "Mani Nelle Mani"));
        songs.add(new Song("Giusy Ferreri", "Fa talmente male"));
        songs.add(new Song("Lodovica Comello", "Il cielo non mi basta"));
        songs.add(new Song("Ron", "L’ottava meraviglia"));
        songs.add(new Song("Clementino", "Ragazzi fuori"));
        songs.add(new Song("Nesli e Alice Paba", "Do retta a te"));

        MusicAdapter adapter = new MusicAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
