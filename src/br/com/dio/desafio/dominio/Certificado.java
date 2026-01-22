package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Certificado{
    private final String nomeDev;
    private final String nomeBootCamp;
    private final LocalDate dataEmissao;

    public Certificado(String nomeDev, String nomeBootCamp, LocalDate dataEmissao){
        this.nomeDev = nomeDev;
        this.nomeBootCamp = nomeBootCamp;
        this.dataEmissao = LocalDate.now();
    }

    public String getNomeDev(){
        return nomeDev;
    }

    public String getNomeBootCamp(){
        return nomeBootCamp;
    }

    public LocalDate geteDataEmissao(){
        return dataEmissao;
    }

    @Override
    public String toString(){

        return """
                    CERTIFICADO 
            ---------------------------
                    Dev: %s
                    Bootcamp: %s
                    Data de emissão: %s
            ---------------------------
       """.formatted(nomeDev, nomeBootCamp, dataEmissao);
    }
}