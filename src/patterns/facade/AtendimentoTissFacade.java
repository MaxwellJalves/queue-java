package patterns.facade;

import enums.TiposDeGuiaTiss;
import model.Pessoa;
import br.com.tiss.casodeuso.AtendimentoHospitalar;

public class AtendimentoTissFacade {
    private final String ENCAMINHAR_PARA_O_FINANCEIRO = " Realizado encaminhamento para o contas a pagar, assim que o processamento for concluido entraremos em contato.";
    private TiposDeGuiaTiss tiss;
    private Pessoa pessoa;


    public AtendimentoTissFacade() {
        this.pessoa = new Pessoa();
    }

    public void realizarAtentimento(String retorno,String usuario) {
        var atendimento = new AtendimentoHospitalar();

        this.pessoa.setNome(usuario);

        if (retorno.contains(TiposDeGuiaTiss.GC.toString())) {
            System.out.println("Usuario :".concat(this.pessoa.getNome()));
            System.out.println(atendimento.obterTipoAtendimento(TiposDeGuiaTiss.GC,"O tempo médio de espera para a consulta é de 30 minutos."));
        }
        if (retorno.contains(TiposDeGuiaTiss.GHI_TISS.toString())) {
            System.out.println(atendimento.obterTipoAtendimento(TiposDeGuiaTiss.GHI_TISS,ENCAMINHAR_PARA_O_FINANCEIRO));
        }
        if (retorno.contains(TiposDeGuiaTiss.GA_TISS.toString())) {
            System.out.println(atendimento.obterTipoAtendimento(TiposDeGuiaTiss.GA_TISS,ENCAMINHAR_PARA_O_FINANCEIRO));
        }
        if (retorno.contains(TiposDeGuiaTiss.GOD.toString())) {
            System.out.println(atendimento.obterTipoAtendimento(TiposDeGuiaTiss.GOD,ENCAMINHAR_PARA_O_FINANCEIRO));
        }
        if (retorno.contains(TiposDeGuiaTiss.GRI.toString())) {
            System.out.println(atendimento.obterTipoAtendimento(TiposDeGuiaTiss.GRI," Aguarde a liberação do médico."));
        }
        if (retorno.contains(TiposDeGuiaTiss.GSP.toString())) {
            System.out.println(atendimento.obterTipoAtendimento(TiposDeGuiaTiss.GSP,ENCAMINHAR_PARA_O_FINANCEIRO));
        }


    }

}
