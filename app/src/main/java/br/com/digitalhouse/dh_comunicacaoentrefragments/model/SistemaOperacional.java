package br.com.digitalhouse.dh_comunicacaoentrefragments.model;

import android.os.Parcel;
import android.os.Parcelable;

public class SistemaOperacional implements Parcelable {

    private String nome;
    private int imagem;

    public SistemaOperacional(){
    }

    public SistemaOperacional(int imagem, String nome){
        this.imagem = imagem;
        this.nome = nome;

    }

    protected SistemaOperacional(Parcel in) {
        nome = in.readString();
        imagem = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeInt(imagem);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<SistemaOperacional> CREATOR = new Creator<SistemaOperacional>() {
        @Override
        public SistemaOperacional createFromParcel(Parcel in) {
            return new SistemaOperacional(in);
        }

        @Override
        public SistemaOperacional[] newArray(int size) {
            return new SistemaOperacional[size];
        }
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}

