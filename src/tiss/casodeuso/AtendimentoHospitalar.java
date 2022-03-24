package tiss.casodeuso;

import enums.TiposDeGuiaTiss;

import java.util.HashMap;
import java.util.Map;

public class AtendimentoHospitalar {


    public String obterTipoAtendimento(TiposDeGuiaTiss tipo, String texto) {
        Map<TiposDeGuiaTiss, String> atendimenton1 = new HashMap<>();

        atendimenton1.put(TiposDeGuiaTiss.GC, TiposDeGuiaTiss.GC.getValue());
        atendimenton1.put(TiposDeGuiaTiss.GOD, TiposDeGuiaTiss.GOD.getValue());
        atendimenton1.put(TiposDeGuiaTiss.GA_TISS, TiposDeGuiaTiss.GA_TISS.getValue());
        atendimenton1.put(TiposDeGuiaTiss.GHI_TISS, TiposDeGuiaTiss.GHI_TISS.getValue());
        atendimenton1.put(TiposDeGuiaTiss.GSP, TiposDeGuiaTiss.GSP.getValue());
        atendimenton1.put(TiposDeGuiaTiss.GRI, TiposDeGuiaTiss.GRI.getValue());

        for (Map.Entry<TiposDeGuiaTiss, String> opcao : atendimenton1.entrySet()) {

            if (opcao.getKey().toString().contains(tipo.toString())) {
                return String.format("[ %s ] Nº 102030 , %s  \n", opcao.getValue(), texto);
            }
        }
        return null;
    }


}
