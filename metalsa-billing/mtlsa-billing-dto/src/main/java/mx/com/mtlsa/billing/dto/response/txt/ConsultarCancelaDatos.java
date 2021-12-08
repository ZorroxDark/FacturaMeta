package mx.com.mtlsa.billing.dto.response.txt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ConsultarCancelaDatos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4272685465761326851L;
	
	
	
	
	List<CancelacionResponse> cancelacionDTO = new ArrayList<CancelacionResponse>(); 
	
	
	
	
	public ConsultarCancelaDatos() {
		
	}

	public List<CancelacionResponse> getCancelacionDTO() {
		return cancelacionDTO;
	}

	public void setCancelacionDTO(List<CancelacionResponse> cancelacionDTO) {
		this.cancelacionDTO = cancelacionDTO;
	}

	@Override
	public String toString() {
		return "ConsultarCancelaDatos [cancelacionDTO=" + cancelacionDTO + "]";
	}
	
	

}
