package esamePO.springboot.service;
import java.io.IOException;
import java.util.ArrayList;
import esamePO.springboot.model.Edicola;
import esamePO.springboot.model.Response;
/**
 * E' l'interfaccia che rappresenta i metodi che saranno poi implementati nella classe del implements 
 * @author denis bernovschi
 * @version 1.0
 *
 */
public interface EdicolaService {
	Response devStdData() throws IOException;
	Edicola getEdicolaByCodice(String codice);
	Edicola getEdicolaById(int codice);
	ArrayList <Edicola> getEdicole ();
	Response countEdicolaByVariable (String variable, String value) throws IOException;
	Response maxEdicolaByVariable (String variable) throws IOException;
	Response minEdicolaByVariable (String variable) throws IOException;
	Response getMetaData(); 
	Response avgEdicolaByVariable (String variable) throws IOException;
	Response sumData(String data , String value);
}
