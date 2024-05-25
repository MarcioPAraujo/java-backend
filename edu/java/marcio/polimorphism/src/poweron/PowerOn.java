package poweron;

import devices.IPhone.IPhone;
import devices.internet.NavegadorInternet;
import devices.music.ReprodutorMusical;
import devices.phone.Telefone;

public class PowerOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPhone iphone = new IPhone();
		
		ReprodutorMusical reprodutor = iphone;
		Telefone telefone = iphone;
		NavegadorInternet navegador = iphone;
		
		reprodutor.Tocar();
		reprodutor.Pausar();
		reprodutor.SelecionarMusica("Johann Sebastian Bach - Orchestral Suite No. 3 D-dur (BWV 1068)");
		
		navegador.adicionarNovaAba();
		navegador.atualizarPagina();
		navegador.exibirpagina("https://www.youtube.com/watch?v=eUtCC5VPwBs&list=RDeUtCC5VPwBs&start_radio=1");
		
		telefone.atender();
		telefone.ligar("123456789");
		telefone.iniciarCorreioVoz();
	}

}
