package mx.com.mtlsa.billing.service.impl;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import mx.com.mtlsa.billing.dto.response.txt.ProcesoGuardadoDTO;
import mx.com.mtlsa.billing.service.ProcesosService;
import mx.com.mtlsa.billing.utils.SFTPSend;

@Stateless
public class ProcesosImpl  implements  ProcesosService , Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3028902256693162358L;
	

	@Override
	public ProcesoGuardadoDTO guardarSftpToRutaFacturas() {
		ProcesoGuardadoDTO pGuardaDTO = new ProcesoGuardadoDTO();
		
		//1 saco la lista de la ruta
		
		try {
			
			
			
		 List<String> listNameFilesRuta = new ArrayList<String>();	
		
		 File carpeta = new File("\\\\faewapo01\\Export\\Ekomercio\\");
         
		 String[] listado = carpeta.list();
         if (listado == null || listado.length == 0) {
             System.out.println("No hay elementos dentro de la carpeta actual");
           
         }
         
         else {
             for (int i=0; i< listado.length; i++) {
                 System.out.println(listado[i]);
                 listNameFilesRuta.add(listado[i]);
             }
         }
         
       //2 saco la lista de la ruta
         
        
         pGuardaDTO.setArchivosAgregados(SFTPSend.saveRutaFacturas(listNameFilesRuta));
         pGuardaDTO.setResultado("Correcto");
         pGuardaDTO.setRutaDestino("\\\\faewapo01\\Export\\Ekomercio\\");
         pGuardaDTO.setUrl("saveSftpToRutaFacturas");
         
         
		}catch(Exception e) {
			System.out.println("Erorr "+e);
		}
		
		
		
		
		
		
		
		
		
		return pGuardaDTO;
	}

	@Override
	public ProcesoGuardadoDTO guardarSftpToRutaNomina() {
		ProcesoGuardadoDTO pGuardaDTO = new ProcesoGuardadoDTO();
		
		return pGuardaDTO;
		
	}

	@Override
	public ProcesoGuardadoDTO guardarSftpToRutaFacturasError() {
		ProcesoGuardadoDTO pGuardaDTO = new ProcesoGuardadoDTO();
		
		return pGuardaDTO;
		
	}

	@Override
	public ProcesoGuardadoDTO guardarSftpToRutaNominaError() {
		ProcesoGuardadoDTO pGuardaDTO = new ProcesoGuardadoDTO();
		
		return pGuardaDTO;
		
	}
	
	

}
