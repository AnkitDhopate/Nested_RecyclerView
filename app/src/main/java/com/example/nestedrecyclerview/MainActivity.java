package com.example.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.nestedrecyclerview.adapter.MasterAdapter;
import com.example.nestedrecyclerview.model.ItemModel;
import com.example.nestedrecyclerview.model.MasterModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView master_recycler_view ;
    private MasterAdapter masterAdapter ;
    private ArrayList<MasterModel> masterModelList ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        master_recycler_view = findViewById(R.id.master_recycler_view);
        masterModelList = new ArrayList<>();
        ArrayList<ItemModel> english = new ArrayList<>();
        ArrayList<ItemModel> hindi = new ArrayList<>();
        ArrayList<ItemModel> marathi = new ArrayList<>();
        ArrayList<ItemModel> telugu = new ArrayList<>();
        ArrayList<ItemModel> spanish = new ArrayList<>();

        master_recycler_view.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        master_recycler_view.setLayoutManager(linearLayoutManager);

        english.add(new ItemModel(R.drawable.apollo_13, "Apollo 13"));
        english.add(new ItemModel(R.drawable.dark_knight, "Dark Knight"));
        english.add(new ItemModel(R.drawable.forest_gump, "forest_gump"));
        english.add(new ItemModel(R.drawable.invisible_guest, "invisible_guest"));
        english.add(new ItemModel(R.drawable.shutter_island, "shutter_island"));
        english.add(new ItemModel(R.drawable.the_bar, "the_bar"));
        masterModelList.add(new MasterModel("English Movies", english));


        hindi.add(new ItemModel(R.drawable.yaari_dosti, "yaari_dosti"));
        hindi.add(new ItemModel(R.drawable.angreji, "angreji"));
        hindi.add(new ItemModel(R.drawable.baaghi, "baaghi"));
        hindi.add(new ItemModel(R.drawable.coolie, "coolie"));
        hindi.add(new ItemModel(R.drawable.hasina, "hasina"));
        hindi.add(new ItemModel(R.drawable.loveaajkal, "loveaajkal"));
        masterModelList.add(new MasterModel("Hindi Movies", hindi));


        marathi.add(new ItemModel(R.drawable.bonus, "bonus"));
        marathi.add(new ItemModel(R.drawable.gf, "gf"));
        marathi.add(new ItemModel(R.drawable.hirkani, "hirkani"));
        marathi.add(new ItemModel(R.drawable.jogwa, "jogwa"));
        marathi.add(new ItemModel(R.drawable.maharshi, "maharshi"));
        marathi.add(new ItemModel(R.drawable.natsamrat, "natsamrat"));
        masterModelList.add(new MasterModel("Marathi Movies", marathi));

        masterModelList.add(new MasterModel(R.drawable.banner_1));

        telugu.add(new ItemModel(R.drawable.awe, "awe"));
        telugu.add(new ItemModel(R.drawable.it, "it"));
        telugu.add(new ItemModel(R.drawable.nikkevarru, "nikkevarru"));
        telugu.add(new ItemModel(R.drawable.opiri, "opiri"));
        telugu.add(new ItemModel(R.drawable.prawaas, "prawaas"));
        telugu.add(new ItemModel(R.drawable.veronika, "veronika"));
        masterModelList.add(new MasterModel("Telugu Movies", telugu));

        spanish.add(new ItemModel(R.drawable.ww1984, "ww1984"));
        spanish.add(new ItemModel(R.drawable.sherlock, "sherlock"));
        spanish.add(new ItemModel(R.drawable.sanju, "sanju"));
        spanish.add(new ItemModel(R.drawable.mirage, "mirage"));
        spanish.add(new ItemModel(R.drawable.labyrinth, "labyrinth"));
        spanish.add(new ItemModel(R.drawable.extraction, "extraction"));
        masterModelList.add(new MasterModel("Spanish Movies", spanish));

        masterModelList.add(new MasterModel(R.drawable.banner_2));

        masterAdapter = new MasterAdapter(masterModelList, this);
        master_recycler_view.setAdapter(masterAdapter);

    }
}