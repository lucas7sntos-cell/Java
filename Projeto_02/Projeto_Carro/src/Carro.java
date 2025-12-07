
  public class Carro {
    private boolean ligado = false;
    private int velocidade = 0;
    private int marcha = 0;

    public void ligar(){
        if (ligado){
            System.out.println("o carro ja esta ligado");
        }else {
            ligado = true;
            System.out.println("Carro ligado");
        }
    }
    public void desligar(){
        if (!ligado) {
            System.out.println("o carro ja esta desligado.");
            
        } else if (marcha == 0 && velocidade == 0) {
            ligado = false;
            System.out.println("carro desligado");
        } else {
            System.out.println("so é possivel desligar com marcha 0 e velocidade 0");
        }

     }
     public void acelerar (){
        if (!ligado) {
            System.out.println(" o carro ja esta desligado");
            return;
        }

        if (marcha == 0) {
            System.out.println("não é possivel acelerar em ponto morto");
            return;
         }
         if (velocidade < 120){
            velocidade++;
            System.out.println("acelerando... Velocidade atual." + velocidade + "km/h");
            validarMarchaVelocidade();
        }else {
            System.out.println("Velocidade maxima atingida");
        }
    }
    public void frear(){
        if (!ligado) {
            System.out.println("O carro está desligado!");
            return;
        }
        if (velocidade > 0) {
            velocidade--;
            System.out.println("Reduzindo velocidade: " + velocidade + " km/h");
        } else {
            System.out.println("O carro já está parado.");
        }
    }
    public void virar (String direção) {
        if (!ligado){
            System.out.println("o carro ja esta desligado");
            return;
        }
        if (velocidade >=1 && velocidade <=40){
           System.out.println("virando para: " + direção + ".");
            } else {
                System.out.println("para virar, sua velocidade precisa estar entre 1km e 40km.");
            }

        }
        public void trocarMarcha(int novaMarcha) {
            if (!ligado){
                System.out.println("o carro ja esta desligado.");
                return;
            }
            if (novaMarcha < 0 || novaMarcha > 6) {
                System.out.println("Marcha invalida.");
                return;

            }
            if (Math.abs(novaMarcha - marcha) != 1){
                System.out.println("não é permitido pular marchas");
                return;
                
            }
            marcha = novaMarcha;
            System.out.println("Marcha alterada para: " + marcha);
            validarMarchaVelocidade();
        }
        private void validarMarchaVelocidade(){
            if(
            (marcha == 1 && (velocidade > 20)) ||
            (marcha == 2 && (velocidade < 21   || (velocidade > 40)) ||
            (marcha == 3 && (velocidade < 41   || velocidade > 60)) ||
            (marcha == 4 && (velocidade < 61   || (velocidade > 80)) ||
            (marcha == 5 && (velocidade < 81   || (velocidade > 100))|| 
            (marcha == 6 && (velocidade < 101  || (velocidade > 120)) 
          ))))) {
            System.out.println("⚠ Marcha incorreta para essa velocidade!");
          }
     }
     public void mostrarStatus() {
        System.out.println("\n--- STATUS DO CARRO ---");
        System.out.println("Ligado: " + (ligado ? "Sim" : "Não"));
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Marcha: " + marcha);
        System.out.println("------------------------\n");
        }
    }
        
    



