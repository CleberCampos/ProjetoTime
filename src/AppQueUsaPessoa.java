import java.util.Scanner;

public class AppQueUsaPessoa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String txtNome, txtEmail, txtSalario;
		
		txtNome = teclado.nextLine();
		txtEmail = teclado.nextLine();
		txtSalario = teclado.nextLine();
		
		
		Pessoa p = new Pessoa(txtNome, txtEmail, Float.parseFloat(txtSalario));
	
		System.out.println(p.getEmail());
		System.out.println(p.getNome());
		System.out.println(p.getSalario());
		
		
		teclado.close();
	}

}
