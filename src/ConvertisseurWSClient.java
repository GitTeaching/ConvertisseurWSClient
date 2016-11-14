import org.soa.ws.tp3.ConvertisseurDinarEuro;
import org.soa.ws.tp3.ConvertisseurImplService;


public class ConvertisseurWSClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertisseurImplService service = new ConvertisseurImplService();
		ConvertisseurDinarEuro convertisseur = service.getConvertisseurImplPort();
		System.out.println(convertisseur.getDinarFromEuro(100));
	}

}

