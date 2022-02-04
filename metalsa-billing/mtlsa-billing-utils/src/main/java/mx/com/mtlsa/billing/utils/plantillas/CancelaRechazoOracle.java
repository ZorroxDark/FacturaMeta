package mx.com.mtlsa.billing.utils.plantillas;

public class CancelaRechazoOracle {
	
	public String plantillaRechazoOracle(String razonSocial , String uuid, String emailComprador) {
		StringBuilder template = new StringBuilder();
		
		template.append("<div role='region' tabindex='-1' aria-label='Cuerpo del mensaje' class='Vzh05neKQu87GUy5UviOc QMubUjbS-BOly_BTHEZj7 allowTextSelection'> ");
		template.append("            <div>");
		template.append("               <style type='text/css' style='display:none'>");
		template.append("                  <!-- ");
		template.append("                     .rps_2229 p");
		template.append("                     	{margin-top:0;");
		template.append("                     	margin-bottom:0}");
		template.append("                     -->");
		template.append("               </style>");
		template.append("               <div class='rps_2229'> ");
		template.append("                  <div dir='ltr'> ");
		template.append("                     <div>  ");              
		template.append("                        <div lang='es-419'>");
		template.append("                           <div class='x_x_WordSection1'>");
		template.append("                              <table class='x_x_MsoNormalTable' border='0' cellspacing='0' cellpadding='0' width='100%' style='width:100.0%; border-collapse:collapse'> ");
		template.append("                                 <tbody>");
		template.append("                                    <tr>");
		template.append("                                       <td valign='top' style='padding:1.5pt 0cm 20.25pt 0cm'>");
		template.append("                                          <p class='x_x_MsoNormal' style='margin:0cm 0cm 0.0001pt; font-size:10pt; font-family:Calibri,sans-serif'><b><span style='font-size:18.0pt; font-family:Roboto; color:#C3CED9'><img data-imagetype='External' src='https://cloud.metalsa.com/IFP/resources/img/logo_color.png' width='200' height='53' id='x_x__x0000_i1025' style='width:2.0833in; height:.5486in'></span></b></p>");
		template.append("                                       </td>");
		template.append("                                    </tr>");
		template.append("                                 </tbody>");
		template.append("                              </table>");
		template.append("                              <p class='x_x_MsoNormal' style='margin:0cm 0cm 0.0001pt; font-size:10pt; font-family:Calibri,sans-serif'><span style='display:none'>&nbsp;</span></p>");
		template.append("                              <table class='x_x_MsoNormalTable' border='0' cellspacing='0' cellpadding='0' width='100%' style='width:100.0%; background:#FAFAFA; border-collapse:collapse; border-spacing:0'>");
		template.append("                                 <tbody>");
		template.append("                                    <tr>");
		template.append("                                       <td valign='top' style='padding:0cm 0cm 0cm 0cm'>");
		template.append("                                          <div>");
		template.append("                                             <div>");
		template.append("                                                <p class='x_x_MsoNormal' style='margin:0cm 0cm 0.0001pt; font-size:10pt; font-family:Calibri,sans-serif; line-height:15.0pt'><span style='font-size:15.0pt'>&nbsp;</span></p>");
		template.append("                                             </div>");
		template.append("                                          </div>");
		template.append("                                          <table class='x_x_MsoNormalTable' border='0' cellspacing='0' cellpadding='0' width='100%' style='width:100.0%; border-collapse:collapse; border-spacing:0'>");
		template.append("                                             <tbody>");
		template.append("                                                <tr>");
		template.append("                                                   <td valign='top' style='padding:0cm 15.0pt 0cm 15.0pt; word-break:break-word; word-wrap:break-word'></td>");
		template.append("                                                </tr>");
		template.append("                                             </tbody>");
		template.append("                                          </table>");
		template.append("                                          <p class='x_x_MsoNormal' style='margin:0cm 0cm 0.0001pt; font-size:10pt; font-family:Calibri,sans-serif'><span style='font-size:11.0pt; display:none'>&nbsp;</span></p>");
		template.append("                                          <table class='x_x_MsoNormalTable' border='0' cellspacing='0' cellpadding='0' width='100%' style='width:100.0%; border-collapse:collapse; border-spacing:0'>");
		template.append("                                             <tbody>");
		template.append("                                                <tr>");
		template.append("                                                   <td valign='top' style='padding:0cm 15.0pt 0cm 15.0pt; word-break:break-word; word-wrap:break-word'>");
		template.append("                                                      <div>");
		template.append("                                                         <p class='x_x_MsoNormal' style='margin:0cm 0cm 0.0001pt; font-size:10pt; font-family:Calibri,sans-serif'><span style='font-size:12.0pt; font-family:&quot;Arial&quot;,sans-serif'>&nbsp;<span style='color:black'>Se rechazo la solicitud de cancelación del proveedor <b>");
		template.append(razonSocial);
		template.append("</b> del CFDI con UUID <b>");
		template.append(uuid);
		template.append("</b>, este CFDI se encuentra en proceso de trámite.</span></span></p>");
		template.append("                                                      </div>");
		template.append("                                                   </td>");
		template.append("                                                </tr>");
		template.append("                                             </tbody>");
		template.append("                                          </table>");
		template.append("                                          <p class='x_x_MsoNormal' style='margin:0cm 0cm 0.0001pt; font-size:10pt; font-family:Calibri,sans-serif'><span style='font-size:12.0pt; font-family:&quot;Arial&quot;,sans-serif; display:none'>&nbsp;</span></p>");
		template.append("                                          <table class='x_x_MsoNormalTable' border='0' cellspacing='0' cellpadding='0' width='100%' style='width:100.0%; border-collapse:collapse; border-spacing:0'>");
		template.append("                                             <tbody>");
		template.append("                                                <tr style='height:3.0pt'>");
		template.append("                                                   <td valign='top' style='padding:0cm 15.0pt 0cm 15.0pt; height:3.0pt; word-break:break-word; word-wrap:break-word'>");
		template.append("                                                      <div>");
		template.append("                                                         <p class='x_x_MsoNormal' style='margin:0cm 0cm 0.0001pt; font-size:10pt; font-family:Calibri,sans-serif'><span style='font-size:12.0pt; font-family:&quot;Arial&quot;,sans-serif'>&nbsp;</span></p>");
		template.append("                                                         <ul type='disc' style='margin-bottom:0cm; margin-top:0cm'>");
		template.append("                                                            <li class='x_x_MsoListParagraph' style='margin:0cm 0cm 0.0001pt 36pt; font-size:10pt; font-family:Calibri,sans-serif; color:black; margin-left:0cm'><span style='font-size:12.0pt; font-family:&quot;Arial&quot;,sans-serif'>Para solicitar la cancelación requiere solicitarlo con su comprador <b>");
		template.append(emailComprador);
		template.append("</b></span></li>");
		template.append("                                                         </ul>");
		template.append("                                                      </div>");
		template.append("                                                   </td>");
		template.append("                                                </tr>");
		template.append("                                             </tbody>");
		template.append("                                          </table>");
		template.append("                                          <div>");
		template.append("                                             <p class='x_x_MsoNormal' style='margin:0cm 0cm 0.0001pt; font-size:10pt; font-family:Calibri,sans-serif; line-height:15.0pt'><span style='font-size:12.0pt; font-family:&quot;Arial&quot;,sans-serif; color:black'><img data-imagetype='External' src='https://cloud.metalsa.com/IFP/tk?kp=931575c5-27c8-4d20-9c9e-13216c8ed4cf' width='1' height='1' id='x_x__x0000_i1026' style='width:.0069in; height:.0069in'></span><span style='font-size:15.0pt'></span></p>");
		template.append("                                          </div>");
		template.append("                                       </td>");
		template.append("                                    </tr>");
		template.append("                                </tbody>");
		template.append("                              </table>");
		template.append("                             </div>");
		template.append("                        </div>");
		template.append("                     </div>");
		template.append("                  </div>");
		template.append("               </div>");
		template.append("            </div>");
		template.append("</div>");
	    
		return template.toString();
		
		
	}


}
