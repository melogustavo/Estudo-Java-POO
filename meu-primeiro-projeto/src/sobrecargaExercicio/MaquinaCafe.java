package sobrecargaExercicio;

public class MaquinaCafe {

	int acucarDisponivel;
	
	void fazerCafe() {
		fazerCafe(10);
	}
	
	//sobrecarga do m�todo fazerCafe
	void fazerCafe(int quantidadeAcucar) {
		if(acucarDisponivel < quantidadeAcucar) {
			System.out.println("N�o h� a�ucar suficiente para fazer seu caf�.");
		}else {
			acucarDisponivel -= quantidadeAcucar;
			System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de a�ucar.");
		}
	}
	

}
