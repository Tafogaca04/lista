package Lista_execicio_23_10;

public class PrincipalBrinquedos {
	public static void main(String[]args) {
	
	
	Brinquedos car = new Brinquedos("Preto ", "Carrinho de controle remoto", "20km", "Carro do Batman");
	System.out.println("----Carro-----");
	System.out.println("Cor: "+ car.getCor());
	System.out.println("Tipo: "+ car.getTipo());
	System.out.println("Velocidade: "+ car.getVelocidade());
	System.out.println("Nome: "+ car.getNome());
	System.out.println("\n ");
	
	Brinquedos Moto = new Brinquedos("Preto com vermelho", "Mini Moto Infantil Elétrica (Triciclo)", "15km", "Motinha Harley");
	System.out.println("----Moto----");
	System.out.println("Cor: "+ Moto.getCor());
	System.out.println("Tipo: "+ Moto.getTipo());
	System.out.println("Velocidade: "+ Moto.getVelocidade());
	System.out.println("Nome: "+ Moto.getNome());
	System.out.println("\n ");
	
	
	Brinquedos Navio = new Brinquedos("Branco com vermelho", "Barco de controle remoto", "15-20km", "Barco RC");
	System.out.println("----Navio----");
	System.out.println("Cor: "+ Navio.getCor());
	System.out.println("Tipo: "+ Navio.getTipo());
	System.out.println("Velocidade: "+ Navio.getVelocidade());
	System.out.println("Nome: "+ Navio.getNome());
	System.out.println("\n ");
	}
}
