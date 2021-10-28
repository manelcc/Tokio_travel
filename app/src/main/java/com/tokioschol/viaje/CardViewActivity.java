package com.tokioschol.viaje;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;



import com.tokioschol.viaje.databinding.ActivityCardViewBinding;

public class CardViewActivity extends AppCompatActivity {
    private static final String TAG = "CardViewActivity";

    private ActivityCardViewBinding bindView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //1 Hay que mirar como se llama el layout. = activity_card_view
        bindView = ActivityCardViewBinding.inflate(getLayoutInflater());
        setContentView(bindView.getRoot());

        makeCard();
        setListeners();
    }

    private void makeCard() {
        bindView.card.cardviewCardImg.setImageResource(R.drawable.img_default_card);
        bindView.card.cardviewCardTitle.setText(getString(R.string.cardTitle));
        bindView.card.cardviewCardSubTitle.setText(getString(R.string.cardSubTitle));
    }

    private void setListeners() {
        bindView.card.cardviewCardBtn.setOnClickListener(view -> {
            Log.i(TAG, "hemos pulsado el boton");
            //TODO: Ahora vamos a otra pantall
        });
    }


}