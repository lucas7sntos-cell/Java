
public class ContaBancaria {
    private double Saldo;
    private double LimiteChequeEspecial;
    private double ChequeEspecialUsado = 0;

public ContaBancaria(double depositoinicial) {
    this.Saldo = depositoinicial;
    if (depositoinicial <=500) {
        this.LimiteChequeEspecial = 50;

    } else {
        this.LimiteChequeEspecial = depositoinicial * 0.5;
    }
}

public double consultarSaldo(){
    return Saldo;
    
}
public double consultarChequeEspecial(){
    return LimiteChequeEspecial - ChequeEspecialUsado;
}
public void depositar(double valor) {
    if (ChequeEspecialUsado > 0) {
        double taxa = ChequeEspecialUsado * 0.2;
        double totalDevido = ChequeEspecialUsado + taxa;
        
        if (valor >= totalDevido){
            valor -= totalDevido;
            ChequeEspecialUsado = 0;
        }else {
            ChequeEspecialUsado -= valor / 1.2;
            valor = 0;
        }
    }
    Saldo +=valor;
    System.out.println("Depósito realizado !");

}
public boolean Sacar (double valor ) {
    double totalDisponivel = Saldo + (LimiteChequeEspecial - ChequeEspecialUsado);
    if (valor <=totalDisponivel) {
        if (valor <= Saldo) {
            Saldo -= valor;
    } else {
        double restante = valor - Saldo;
        Saldo = 0;
        ChequeEspecialUsado += restante;
    }
    System.out.println("Saque realizado !");
    return true;
} else {
    System.out.println("Saldo insuficiente !");
    return false;
}
}
public boolean pagarBoleto(double valor){
    System.out.println("Boleto pago!");
    return Sacar(valor);
}
public boolean usandoChequeEspeacial(){
    return ChequeEspecialUsado > 0;
}
}


