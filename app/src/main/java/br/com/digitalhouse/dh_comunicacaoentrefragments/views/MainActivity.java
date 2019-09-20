package br.com.digitalhouse.dh_comunicacaoentrefragments.views;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.digitalhouse.dh_comunicacaoentrefragments.R;
import br.com.digitalhouse.dh_comunicacaoentrefragments.interfaces.Comunicador;
import br.com.digitalhouse.dh_comunicacaoentrefragments.model.SistemaOperacional;

public class MainActivity extends AppCompatActivity implements Comunicador {
    public static final String SO_KEY = "SO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        replaceFragment(R.id.container2, new PrimeiroFragment());
    }

    @Override
    public void receberMensagem(SistemaOperacional sistemaOperacional) {
        setBundleToFragment(sistemaOperacional, SO_KEY);
    }

    private void replaceFragment(int container, Fragment fragment){}
    FragmentManager manager = getSupportFragmentManager();
    FragmentTransaction transaction = manager.beginTransaction();
    transaction.replace(container, fragment);
    transaction.commit();

    private void setBundleToFragment(SistemaOperacional so, String CHAVE){
        Bundle bundle = new Bundle();
        bundle.putParcelable(CHAVE, so);

        Fragment segundoFragment = new SegundoFragment();
        segundoFragment.setArguments(bundle);

        replaceFragment(R.id.container1, segundoFragment);
    }

}
