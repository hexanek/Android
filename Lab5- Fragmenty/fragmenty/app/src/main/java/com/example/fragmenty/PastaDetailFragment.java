package com.example.fragmenty;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PastaDetailFragment extends Fragment {
    private long pizzaId;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            pizzaId = savedInstanceState.getLong("pizzaId");
        }

        FragmentTransaction ft = getChildFragmentManager().beginTransaction();
        PastaDetailsP2Fragment pastaDetailsP2Fragment = new PastaDetailsP2Fragment();
        ft.replace(R.id.pizzaDetails2_container, pastaDetailsP2Fragment);
        ft.addToBackStack(null);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        ft.commit();

        return inflater.inflate(R.layout.fragment_pasta_detail, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            Pasta pasta = Pasta.PASTAS[(int) pizzaId];

            TextView title = view.findViewById(R.id.textTitle);
            title.setText(pasta.getName());

            TextView description = view.findViewById(R.id.textDescription);
            description.setText(pasta.getDescription());

            ImageView imageView = view.findViewById(R.id.photo);
            imageView.setImageResource(pasta.getImageResourceId());

            TextView price = view.findViewById(R.id.price);
            price.setText(pasta.getPrice()+"zł");
        }


    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("pizzaId", pizzaId);
    }

    public void setPizzaId(long id) {
        this.pizzaId = id;
    }
}
