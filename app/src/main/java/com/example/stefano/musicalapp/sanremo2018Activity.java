package com.example.stefano.musicalapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class sanremo2018Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanremo2018);

        // Create a list of songs
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Ermal Meta e Fabrizio Moro", "Non mi avete fatto niente"));
        songs.add(new Song("Lo Stato Sociale", "Una vita in vacanza"));
        songs.add(new Song("Annalisa", "Il mondo prima di te"));
        songs.add(new Song("Ron", "Almeno pensami"));
        songs.add(new Song("Ornella Vanoni, Bungaro e Pacifico", "Imparare ad amarsi"));
        songs.add(new Song("Max Gazzè", "La leggenda di Cristalda e Pizzomunno"));
        songs.add(new Song("Luca Barbarossa", "Passame er sale"));
        songs.add(new Song("Diodato e Roy Paci", "Adesso"));
        songs.add(new Song("The Kolors", "Frida (mai, mai, mai)"));
        songs.add(new Song("Giovanni Caccamo", "Eterno"));
        songs.add(new Song("Le Vibrazioni ", "Così sbagliato"));
        songs.add(new Song("Enzo Avitabile e Peppe Servillo", "Il coraggio di ogni giorno"));
        songs.add(new Song("Renzo Rubino", "Custodire"));
        songs.add(new Song("Noemi", "Non smettere mai di cercarmi"));
        songs.add(new Song("Red Canzian", "Ognuno ha il suo racconto"));
        songs.add(new Song("Decibel", "Lettera dal Duca"));
        songs.add(new Song("Nina Zilli", "Senza appartenere"));
        songs.add(new Song("Roby Facchinetti e Riccardo Fogli", "Il segreto del tempo"));
        songs.add(new Song("Mario Biondi", "Rivederti"));
        songs.add(new Song("Elio e le storie tese", "Arrivedorci"));

        MusicAdapter adapter = new MusicAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

