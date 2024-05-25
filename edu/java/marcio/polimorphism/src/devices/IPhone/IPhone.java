package devices.IPhone;

import devices.internet.NavegadorInternet;
import devices.music.ReprodutorMusical;
import devices.phone.Telefone;

public class IPhone implements ReprodutorMusical, Telefone, NavegadorInternet {

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("classe IPhone atualizoua a pagina");
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("classe IPhone adicionou nova aba");
	}

	@Override
	public void exibirpagina(String url) {
		// TODO Auto-generated method stub
		System.out.println("classe IPhone exibe a página"+url);
	}

	
	
	
	
	
	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("classe IPhone atendeu");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("classe IPhone iniciou correio de voz");
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("classe IPhone ligou para"+numero);
	}

	
	
	
	
	
	
	@Override
	public void Tocar() {
		// TODO Auto-generated method stub
		System.out.println("classe IPhone estátocando");
	}

	@Override
	public void Pausar() {
		// TODO Auto-generated method stub
		System.out.println("classe IPhone pausou a música");
	}

	@Override
	public void SelecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("classe IPhone selecionou a música"+musica);
	}

}
