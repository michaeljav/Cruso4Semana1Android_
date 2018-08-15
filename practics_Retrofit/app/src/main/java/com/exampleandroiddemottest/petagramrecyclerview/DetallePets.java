package com.exampleandroiddemottest.petagramrecyclerview;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

public class DetallePets extends CreateMenuOpctions {


    private RecyclerView recyclerViewsegundaPantalla;

    private static final String KEY_EXTRA_URL = "url";
    private static final String KEY_EXTRA_LIKE = "like";

    private ImageView  imgFotoDetalle;
    private TextView  tvLikesDetalle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_pets);


        Bundle extras=  getIntent().getExtras();
        String url = extras.getString(KEY_EXTRA_URL);
        int likes = extras.getInt(KEY_EXTRA_LIKE);

            imgFotoDetalle = findViewById(R.id.imgPhotoMainDetalle);

            tvLikesDetalle = findViewById(R.id.tvlikesDetalle);

            tvLikesDetalle.setText(String.valueOf(likes));

       // Toast.makeText(this,"Pulsaste un action view",Toast.LENGTH_SHORT).show();
//        Toolbar toolbar = findViewById(R.id.miActionBar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//
//        recyclerViewsegundaPantalla = findViewById(R.id.rvPetDetalles);
//
//        //Forma en mostrar  el en el recycler;
//        LinearLayoutManager llm = new LinearLayoutManager(this);
//        llm.setOrientation(LinearLayoutManager.VERTICAL);
//        recyclerViewsegundaPantalla.setLayoutManager(llm);
//
//
//        llenarRecycler llenarRecycler = new llenarRecycler();
//        ArrayList<Mascota> pets=llenarRecycler.inicializarListadePets();
//        llenarRecycler.inicializarAdactador(pets,this,recyclerViewsegundaPantalla);







    }




}
