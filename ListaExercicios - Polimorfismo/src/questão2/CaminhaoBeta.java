package questão2;
import java.util.ArrayList;
import java.util.List;

public class CaminhaoBeta extends Caminhao{
	List <String> tiposInseridos;
	public CaminhaoBeta(int qtdEquipamentos) {
		super(qtdEquipamentos);
		tiposInseridos= new ArrayList<String>();
	}

	@Override
	public void inserePluviometro(Pluviometro x) {
		if(!tiposInseridos.contains(x.getTipo())) {
			tiposInseridos.add(x.getTipo());
			System.out.println("Pluviometro inserido no caminhão");
		}else System.out.println("Caminhão já tem um pluviometro desse tipo");
		
	}
}
