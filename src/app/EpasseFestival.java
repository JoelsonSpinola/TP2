package app;

public class EpasseFestival {
   private double SaldoPagamento;
   private String NomeEvento;

//getters and seters
public double getSaldoPagamento() {
    return SaldoPagamento;
}
public void setSaldoPagamento(double saldoPagamento) {
    SaldoPagamento = saldoPagamento;
}
public String getNomeEvento() {
    return NomeEvento;
}
public void setNomeEvento(String nomeEvento) {
    NomeEvento = nomeEvento;
}
public EpasseFestival(double saldoPagamento, String nomeEvento) {
    SaldoPagamento = saldoPagamento;
    NomeEvento = nomeEvento;
}
public EpasseFestival(String nomeEvento) {
    NomeEvento = nomeEvento;
}

public EpasseFestival(EpasseFestival outro)
{
    this.NomeEvento=outro.NomeEvento;
    this.SaldoPagamento=outro.SaldoPagamento;
}

   
}
