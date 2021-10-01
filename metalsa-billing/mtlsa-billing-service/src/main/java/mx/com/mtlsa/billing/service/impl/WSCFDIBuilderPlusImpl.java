package mx.com.mtlsa.billing.service.impl;

import java.io.Serializable;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.JSONObject;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

import mx.com.mtlsa.billing.client.edixcfdisecure.WSCFDBuilderPlus;
import mx.com.mtlsa.billing.client.edixcfdisecure.WSCFDBuilderPlusSoap;
import mx.com.mtlsa.billing.dto.ReceiveCFDRequest;
import mx.com.mtlsa.billing.dto.ReceiveCFDResponse;
import mx.com.mtlsa.billing.service.WSCFDIBuilderPlusService;



public class WSCFDIBuilderPlusImpl implements WSCFDIBuilderPlusService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public ReceiveCFDResponse getReceiveCFD(ReceiveCFDRequest request) {
		// TODO Auto-generated method stub

		ReceiveCFDResponse receiveCFD = new ReceiveCFDResponse();

		try {

			WSCFDBuilderPlusSoap wSCFDBuilderPlusSoap = new WSCFDBuilderPlus().getWSCFDBuilderPlusSoap();
			
			String  respuesta = "";
			respuesta = wSCFDBuilderPlusSoap.receiveCFD(request.getUsuario(), request.getPsswd(), request.getXmlFirmado());

			System.out.println(respuesta);
			
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			InputSource src = new InputSource();
			src.setCharacterStream(new StringReader(respuesta));

			Document doc = builder.parse(src);
			
			receiveCFD.setErrorCode(doc.getElementsByTagName("ErrorCode").item(0).getTextContent());
			receiveCFD.setErrorMessage(doc.getElementsByTagName("ErrorMessage").item(0).getTextContent());
			receiveCFD.setErrorDateTime(doc.getElementsByTagName("ErrorDateTime").item(0).getTextContent());
			
			
		
			
			

		} catch (Exception e) {
			System.out.println("Error " + e);
		}

		return receiveCFD;

	}

}
