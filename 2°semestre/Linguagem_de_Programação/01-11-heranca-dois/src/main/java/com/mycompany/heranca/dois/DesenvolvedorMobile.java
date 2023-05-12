package com.mycompany.heranca.dois;

/**
 *
 * @author gabri
 */
public class DesenvolvedorMobile extends Desenvolvedor {
    private Integer qtdHoraTrabalhadasMobile;
    private Double valorHoraTrabalhadasMobile;
    
    public DesenvolvedorMobile (String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada,
        Integer qtdHoraTrabalhadasMobile, Double valorHoraTrabalhadasMobile){
        super (nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHoraTrabalhadasMobile = qtdHoraTrabalhadasMobile;
        this.valorHoraTrabalhadasMobile = valorHoraTrabalhadasMobile;
    }

    @Override
    public Double getSalario() {
        return (valorHoraTrabalhadasMobile * qtdHoraTrabalhadasMobile); 
    }
    
    

    public Integer getQtdHoraTrabalhadasMobile() {
        return qtdHoraTrabalhadasMobile;
    }

    public void setQtdHoraTrabalhadasMobile(Integer qtdHoraTrabalhadasMobile) {
        this.qtdHoraTrabalhadasMobile = qtdHoraTrabalhadasMobile;
    }

    public Double getValorHoraTrabalhadasMobile() {
        return valorHoraTrabalhadasMobile;
    }

    public void setValorHoraTrabalhadasMobile(Double valorHoraTrabalhadasMobile) {
        this.valorHoraTrabalhadasMobile = valorHoraTrabalhadasMobile;
    }

    @Override
    public String toString() {
                return String.format("Seu nome; %s\n Suas horas: %d\n Seus valores: %.1f, Horas trabalhadas: %d\n "
                + "Seus valores: %.1f\n", 
                this.nome, this.qtdHorasTrabalhadas, this.valorHoraTrabalhada, this.qtdHoraTrabalhadasMobile, 
                this.valorHoraTrabalhadasMobile);
    }
    
    
}
