package br.com.digitalhouse.dh_comunicacaoentrefragments.views;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import br.com.digitalhouse.dh_comunicacaoentrefragments.R;
import br.com.digitalhouse.dh_comunicacaoentrefragments.interfaces.Comunicador;
import br.com.digitalhouse.dh_comunicacaoentrefragments.model.SistemaOperacional;


/**
 * A simple {@link Fragment} subclass.
 */
public class PrimeiroFragment extends Fragment {
    private Button btnAndroid;
    private Button btnIOS;
    private Comunicador comunicador;

    public PrimeiroFragment() {
        // Required empty public constructor
    }

    public void onAttach(@NonNull Context context){
        super.onAttach(context);

        try {
            comunicador = (Comunicador) context;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_primeiro, container, false);

        initViews(view);

        btnAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SistemaOperacional android = new SistemaOperacional(R.drawable.androidmascote, "Android Cupcake 1.5 lançado em 2000");
                comunicador.receberMensagem(android);
            }
        });

        btnIOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SistemaOperacional ios = new SistemaOperacional(R.drawable.iosicon, "IOS 7 lançado publicamente dia 18/09/2013");
                comunicador.receberMensagem(ios);
            }
        });

        return view;

    }

    public void initViews(View view){
        btnAndroid = view.findViewById(R.id.buttonAndroid);
        btnIOS = view.findViewById(R.id.buttonIOS);
    }

}
