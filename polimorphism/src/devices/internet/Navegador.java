package devices.internet;

public class Navegador implements NavegadorInternet{

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("classe Navegador atualizoua a pagina");
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("classe Navegador adicionou nova aba");
	}

	@Override
	public void exibirpagina(String url) {
		// TODO Auto-generated method stub
		System.out.println("classe navegador exibe a pagina"+url);
	}

}
