
public class Hanoi {
	
	public static void resolverTorres( int discos, int agujaOrigen,
			int agujaDestino, int agujaTemporal ) {
		if(discos == 1) {
			System.out.println(agujaOrigen + "-->" +agujaDestino);
			return;
		}else {
		resolverTorres(discos-1, agujaOrigen, agujaTemporal, agujaDestino);
		}
		System.out.println( agujaOrigen + "-->" + agujaDestino );
		
		resolverTorres(discos-1, agujaTemporal, agujaDestino, agujaOrigen);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int agujaInicial = 1;
		int agujaTemporal = 2;
		int agujaFinal = 3; 
		int TotalDiscos= 3;
		resolverTorres(TotalDiscos, agujaInicial, agujaFinal, agujaTemporal);

	}

}
