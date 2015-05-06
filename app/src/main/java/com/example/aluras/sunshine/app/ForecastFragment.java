package com.example.aluras.sunshine.app;

/**
 * Created by sn1007071 on 04/05/2015.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public  class ForecastFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;

    public ForecastFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.forecastfragment, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.action_refresh){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Hoje - Sol - 28º/21º");
        dados.add("Amanhã - Sol - 27º/19º");
        dados.add("Quarta - Nublado - 25º/19º");
        dados.add("Quinta - Nublado - 25º/19º");
        dados.add("Sexta - Chuva - 21º/16º");
        dados.add("Sábado - Chuva - 20º/15º");
        dados.add("Hoje - Sol - 28º/21º");
        dados.add("Amanhã - Sol - 27º/19º");
        dados.add("Quarta - Nublado - 25º/19º");
        dados.add("Quinta - Nublado - 25º/19º");
        dados.add("Sexta - Chuva - 21º/16º");
        dados.add("Sábado - Chuva - 20º/15º");
        dados.add("Hoje - Sol - 28º/21º");
        dados.add("Amanhã - Sol - 27º/19º");
        dados.add("Quarta - Nublado - 25º/19º");
        dados.add("Quinta - Nublado - 25º/19º");
        dados.add("Sexta - Chuva - 21º/16º");
        dados.add("Sábado - Chuva - 20º/15º");

        mForecastAdapter = new ArrayAdapter<String>(this.getActivity(),R.layout.list_item_forecast,R.id.list_item_forecast_textview,dados);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }

}