package devices.phone;

public class AparelhoTelefonico implements Telefone {

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		System.out.println("classe aparelhoTelefonico atendeu");
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("classe aparelhoTelefonico iniciou corrêio de voz");
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("classe aparelhoTelefonico ligou para"+numero);
	}

}
