package br.com.digitalhouse.dh_comunicacaoentrefragments.interfaces;

import android.content.Context;
import android.support.annotation.NonNull;

import br.com.digitalhouse.dh_comunicacaoentrefragments.model.SistemaOperacional;

public interface Comunicador {

    public void receberMensagem(SistemaOperacional sistemaOperacional);

}
