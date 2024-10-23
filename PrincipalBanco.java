package Lista_execicio_23_10;

public class PrincipalBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ContaBancaria cliente = new ContaBancaria("1222",9500.00);
			Cliente Contadocliente = new Cliente ("Paola", cliente);
			System.out.println("Nome: " + Contadocliente.getNome() + "\nConta: " + cliente.getNumero() + "\nSALDO: " +cliente.getSaldo());
			}
			
	}

