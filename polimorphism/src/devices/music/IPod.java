package devices.music;

public class IPod implements ReprodutorMusical {

	@Override
	public void Tocar() {
		// TODO Auto-generated method stub
		System.out.println("classe IPod estátocando");
	}

	@Override
	public void Pausar() {
		// TODO Auto-generated method stub
		System.out.println("classe IPod pausou a música");
	}

	@Override
	public void SelecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("classe IPod selecionou a música"+musica);
	}

}
