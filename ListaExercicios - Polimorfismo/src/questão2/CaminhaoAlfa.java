package questão2;

public class CaminhaoAlfa extends Caminhao{
	private int currentPeso;
	public CaminhaoAlfa(int qtdEquipamentos) {
		super(qtdEquipamentos);
		this.currentPeso= 0;
	}
	
	@Override
	public void inserePluviometro(Pluviometro x) {
		if(currentPeso<=5000) {
			currentPeso+= x.getPeso();
			System.out.printf("Pluviometro de %s e peso %Kg foi inserido no caminhão", x.getTipo(), x.getPeso());
		}else System.out.println("Caminhão atingiu a carga máxima(5000Kg)!");
	}
}
