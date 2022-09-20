package AulaEnum2;
import java.util.Scanner;

public class VendasCarro {
	
	public static void main(String[] args) {
		
		Scanner Vendedor = new Scanner(System.in);
		
		System.out.println("Olá o que você gostaria de ver os carros disponiveis ? ");
		
				for(Carros uf : Carros.values() ) {
					System.out.println(" ");
					System.out.println(uf.getCodCarro() + " - : " + uf.getNomeCarro() + " ||  Numero de Portas " + uf.getNumeroPortas() + " || Combustivel " +  uf.getCombustivelCarro() + " || Marca : " + uf.getMarcaCarro() );
				}
				
				
				System.out.println("       ");
				System.out.println("Selecione um carro : ");
					int escolhaCarro = Vendedor.nextInt();
				
					if(escolhaCarro == 1 ) {
						Carros ufSelecionado = Carros.SEDAN;
						System.out.println("Você deseja comprar o : " + ufSelecionado.getNomeCarro());
					}
					if(escolhaCarro == 2) {
						Carros ufSelecionado = Carros.SUV;
						System.out.println("Você deseja comprar o : " + ufSelecionado.getNomeCarro());
					}
					if(escolhaCarro == 3) {
						Carros ufSelecionado = Carros.HATCH;
						System.out.println("Você deseja comprar o : " + ufSelecionado.getNomeCarro());
					}
					if(escolhaCarro == 4) {
						Carros ufSelecionado = Carros.CONVERSIVEL;
						System.out.println("Você deseja comprar o : " + ufSelecionado.getNomeCarro());
					}else {
						System.out.println("Selecione um Cod Disponivel");
					}
	}
}
