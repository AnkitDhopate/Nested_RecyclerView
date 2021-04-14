package com.example.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.nestedrecyclerview.adapter.MasterAdapter;
import com.example.nestedrecyclerview.model.ChannelModel;
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

        ArrayList<ChannelModel> channelModelList = new ArrayList<>();

        master_recycler_view.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        master_recycler_view.setLayoutManager(linearLayoutManager);

        english.add(new ItemModel(R.drawable.apollo_13, "Apollo 13"));
        english.add(new ItemModel(R.drawable.dark_knight, "Dark Knight"));
        english.add(new ItemModel(R.drawable.forest_gump, "forest_gump"));
        english.add(new ItemModel(R.drawable.shutter_island, "shutter_island"));
        english.add(new ItemModel(R.drawable.extraction, "extraction"));
        english.add(new ItemModel(R.drawable.tenet, "tenet"));
        english.add(new ItemModel(R.drawable.shawshank, "shawshank"));
        english.add(new ItemModel(R.drawable.avatar, "avatar"));
        english.add(new ItemModel(R.drawable.ford_vs_ferrari, "ford_vs_ferrari"));
        english.add(new ItemModel(R.drawable.joker, "joker"));
        english.add(new ItemModel(R.drawable.the_new_mutants, "the_new_mutants"));
        english.add(new ItemModel(R.drawable.the_persuit_of_happiness, "the_persuit_of_happiness"));
        english.add(new ItemModel(R.drawable.ww1984, "ww1984"));
        english.add(new ItemModel(R.drawable.sherlock, "sherlock"));
        masterModelList.add(new MasterModel("English Movies", english));


        hindi.add(new ItemModel(R.drawable.angreji, "angreji"));
        hindi.add(new ItemModel(R.drawable.baaghi, "baaghi"));
        hindi.add(new ItemModel(R.drawable.coolie, "coolie"));
        hindi.add(new ItemModel(R.drawable.hasina, "hasina"));
        hindi.add(new ItemModel(R.drawable.loveaajkal, "loveaajkal"));
        hindi.add(new ItemModel(R.drawable.bahubali, "bahubali"));
        hindi.add(new ItemModel(R.drawable.sanju, "sanju"));
        masterModelList.add(new MasterModel("Hindi Movies", hindi));

        channelModelList.add(new ChannelModel("set_max", R.drawable.set_max));
        channelModelList.add(new ChannelModel("movies_now", R.drawable.movies_now));
        channelModelList.add(new ChannelModel("star_plus", R.drawable.star_plus));
        channelModelList.add(new ChannelModel("star_utsav", R.drawable.star_utsav));
        channelModelList.add(new ChannelModel("t_series", R.drawable.t_series));
        channelModelList.add(new ChannelModel("b4u", R.drawable.b4u));
        channelModelList.add(new ChannelModel("cineplex", R.drawable.cineplex));
        channelModelList.add(new ChannelModel("utv", R.drawable.utv));

        masterModelList.add(new MasterModel(channelModelList, "Channels")) ;

        marathi.add(new ItemModel(R.drawable.bonus, "bonus"));
        marathi.add(new ItemModel(R.drawable.gf, "gf"));
        marathi.add(new ItemModel(R.drawable.hirkani, "hirkani"));
        marathi.add(new ItemModel(R.drawable.jogwa, "jogwa"));
        marathi.add(new ItemModel(R.drawable.natsamrat, "natsamrat"));
        marathi.add(new ItemModel(R.drawable.baban, "baban"));
        marathi.add(new ItemModel(R.drawable.bucket_list, "bucket_list"));
        marathi.add(new ItemModel(R.drawable.dombivli, "dombivli"));
        marathi.add(new ItemModel(R.drawable.double_seat, "double_seat"));
        marathi.add(new ItemModel(R.drawable.killa, "killa"));
        marathi.add(new ItemModel(R.drawable.mauli, "mauli"));
        marathi.add(new ItemModel(R.drawable.muramba, "muramba"));
        marathi.add(new ItemModel(R.drawable.prawaas, "prawaas"));
        masterModelList.add(new MasterModel("Marathi Movies", marathi));

        masterModelList.add(new MasterModel(R.drawable.banner_1));

        telugu.add(new ItemModel(R.drawable.awe, "awe"));
        telugu.add(new ItemModel(R.drawable.it, "it"));
        telugu.add(new ItemModel(R.drawable.nikkevarru, "nikkevarru"));
        telugu.add(new ItemModel(R.drawable.opiri, "opiri"));
        telugu.add(new ItemModel(R.drawable.veronika, "veronika"));
        telugu.add(new ItemModel(R.drawable.akshara, "akshara"));
        telugu.add(new ItemModel(R.drawable.arjun_reddy, "arjun_reddy"));
        telugu.add(new ItemModel(R.drawable.bahubali, "bahubali"));
        telugu.add(new ItemModel(R.drawable.chalo, "chalo"));
        telugu.add(new ItemModel(R.drawable.jaanu, "jaanu"));
        telugu.add(new ItemModel(R.drawable.jersey, "jersey"));
        telugu.add(new ItemModel(R.drawable.middle_class, "middle_class"));
        telugu.add(new ItemModel(R.drawable.rangasthalam, "rangasthalam"));
        telugu.add(new ItemModel(R.drawable.rx100, "rx100"));
        masterModelList.add(new MasterModel("Telugu Movies", telugu));

        spanish.add(new ItemModel(R.drawable.invisible_guest, "invisible_guest"));
        spanish.add(new ItemModel(R.drawable.adu, "adu"));
        spanish.add(new ItemModel(R.drawable.babel, "babel"));
        spanish.add(new ItemModel(R.drawable.roma, "roma"));
        spanish.add(new ItemModel(R.drawable.platform, "platform"));
        spanish.add(new ItemModel(R.drawable.labyrinth, "labyrinth"));
        spanish.add(new ItemModel(R.drawable.mirage, "mirage"));
        spanish.add(new ItemModel(R.drawable.the_bar, "the_bar"));
        masterModelList.add(new MasterModel("Spanish Movies", spanish));

        masterModelList.add(new MasterModel(R.drawable.banner_2));

        masterAdapter = new MasterAdapter(masterModelList, this);
        master_recycler_view.setAdapter(masterAdapter);

    }
}