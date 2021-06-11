package app;

import java.time.LocalDate;

public class Epasse {

    private final long Codigo;    
    private double Saldo;
    private double precoViagem;
    private final LocalDateTime Emissao;
    private LocalDate Carregamento;
    private LocalDate Validade;
    private final static long ultCodigo;


   static{
       if(long.ValueOf(ultCodigo)== null)
        ultCodigo=0;
   }

   //construtor
    public Epasse(double Saldo,double PrecoViagem)
    {

    }

    public Epasse(double PrecoViagem)
    {

    }

    public Epasse(double Saldo, double PrecoViagem,LocalDate dataCarrega, LocalDate dataValida)
    {

    }

    public Epass(double Saldo, LocalDate dataCarrega)
    {

    }

    //geters and seters
    public long getCodigo() 
    {
        return Codigo;
    }

    public double getSaldo()
    {
        return Saldo;
    }

    public void setSaldo(double saldo) 
    {
        Saldo = saldo;
    }

    public double getPrecoViagem() 
    {
        return precoViagem;
    }

    public void setPrecoViagem(double precoViagem) 
    {
        this.precoViagem = precoViagem;
    }

    public LocalDate getCarregamento() 
    {
        return Carregamento;
    }

    public void setCarregamento(LocalDate carregamento) 
    {
        Carregamento = carregamento;
    }

    public LocalDate getValidade()
    {
        return Validade;
    }

    public void setValidade(LocalDate validade)
    {
        Validade = validade;
    }

    //metodos
    public String ToString()
    {

    }

    public boolean Equals(Epass)
    {

    }
    
}
