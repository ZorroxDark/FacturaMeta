package mx.com.mtlsa.billing.utils.plantillas;

import java.util.ArrayList;
import java.util.List;

public class CancelaAceptado {
	
	
	public String plantillaAceptadoMetalsa(List<String>  listUid) {
		 
		StringBuilder template = new StringBuilder();
		
		template.append("<div role='region' tabindex='-1' aria-label='Cuerpo del mensaje' class='Vzh05neKQu87GUy5UviOc QMubUjbS-BOly_BTHEZj7 allowTextSelection'> ");
		template.append("   <div>");
		template.append("      <style>");
		template.append("         <!--");
		template.append("            @font-face");
		template.append("            	{font-family:'Cambria Math'}");
		template.append("            @font-face");
		template.append("            	{font-family:Calibri");
		template.append("           @font-");
		template.append("            	{font-family:Roboto}");
		template.append("           .rps_2229 p.x_MsoNormal, .rps_2229 li.x_MsoNormal, .rps_2229 div.x_MsoNormal");
		template.append("            	{margin:0cm;");
		template.append("            	margin-bottom:.0001pt");
		template.append("            	font-size:10.0pt;");
		template.append("            	font-family:'Calibri',sans-serif}");
		template.append("            .rps_2229 a:link, .rps_2229 span.x_MsoHyperlink");
		template.append("            	{color:blue;");
		template.append("            	text-decoration:underline}");
		template.append("            .rps_2229 a:visited, .rps_2229 span.x_MsoHyperlinkFollowed");
		template.append("            	{color:purple;");
		template.append("            	text-decoration:underline}");
		template.append("            .rps_2229 p.x_MsoListParagraph, .rps_2229 li.x_MsoListParagraph, .rps_2229 div.x_MsoListParagraph");
		template.append("            	{margin-top:0cm;");
		template.append("            	margin-right:0cm;");
		template.append("            	margin-bottom:0cm;");
		template.append("            	margin-left:36.0pt;");
		template.append("            	margin-bottom:.0001pt;");
		template.append("            	font-size:10.0pt;");
		template.append("            	font-family:'Calibri',sans-serif}");
		template.append("            .rps_2229 p.x_msonormal0, .rps_2229 li.x_msonormal0, .rps_2229 div.x_msonormal0");
		template.append("            	{margin-right:0cm;");
		template.append("            	margin-left:0cm;");
		template.append("            	font-size:10.0pt;");
		template.append("            	font-family:'Calibri',sans-serif}");
		template.append("            .rps_2229 span.x_EmailStyle19");
		template.append("            	{font-family:'Arial',sans-serif;");
		template.append("            	color:black;");
		template.append("           	font-weight:normal;");
		template.append("            	font-style:normal;");
		template.append("            	text-decoration:none none}");
		template.append("            .rps_2229 span.x_EmailStyle20");
		template.append("            	{font-family:'Arial',sans-serif;");
		template.append("            	color:black;");
		template.append("            	font-weight:normal;");
		template.append("            	font-style:normal;");
		template.append("            	text-decoration:none none}");
		template.append("            .rps_2229 .x_MsoChpDefault");
		template.append("            	{font-size:10.0pt}");
		template.append("            @page WordSection1");
		template.append("            	{margin:72.0pt 72.0pt 72.0pt 72.0pt}");
		template.append("            .rps_2229 div.x_WordSection1");
		template.append("            	{}");
		template.append("            -->");
		template.append("      </style>");
		template.append("      <div class='rps_2229'>");
		template.append("         <div lang='es-419' link='blue' vlink='purple'>");
		template.append("            <div class='x_WordSection1'>");
		template.append("               <table class='x_MsoNormalTable' border='0' cellspacing='0' cellpadding='0' width='100%' style='width:100.0%; border-collapse:collapse'>");
		template.append("                  <tbody>");
		template.append("                     <tr>");
		template.append("                        <td valign='top' style='padding:1.5pt 0cm 20.25pt 0cm'>");
		template.append("                           <p class='x_MsoNormal'><b><span style='font-size:18.0pt; font-family:Roboto; color:#C3CED9'><img data-imagetype='AttachmentByCid' originalsrc='cid:image001.png@01D81135.93AE4440' data-custom='AAMkAGVkMTdiMGE5LTBmNTEtNDAzOC04OTZjLTU3YWVmYTQzMDNiOQBGAAAAAABoHSPBEvNCRLztzV%2B6gQnnBwD8Z%2Bw2ylUxQIZ0eXwtiXKCAAAAAAEMAAD8Z%2Bw2ylUxQIZ0eXwtiXKCAAB6vMj%2FAAABEgAQAMuXScwzo%2F5GrjHE%2FW9xQuY%3D' naturalheight='0' naturalwidth='0' src='https://attachments.office.net/owa/miguel.velazquez%40contractor.metalsa.com/service.svc/s/GetAttachmentThumbnail?id=AAMkAGVkMTdiMGE5LTBmNTEtNDAzOC04OTZjLTU3YWVmYTQzMDNiOQBGAAAAAABoHSPBEvNCRLztzV%2B6gQnnBwD8Z%2Bw2ylUxQIZ0eXwtiXKCAAAAAAEMAAD8Z%2Bw2ylUxQIZ0eXwtiXKCAAB6vMj%2FAAABEgAQAMuXScwzo%2F5GrjHE%2FW9xQuY%3D&amp;thumbnailType=2&amp;token=eyJhbGciOiJSUzI1NiIsImtpZCI6IkZBRDY1NDI2MkM2QUYyOTYxQUExRThDQUI3OEZGMUIyNzBFNzA3RTkiLCJ0eXAiOiJKV1QiLCJ4NXQiOiItdFpVSml4cThwWWFvZWpLdDRfeHNuRG5CLWsifQ.eyJvcmlnaW4iOiJodHRwczovL291dGxvb2sub2ZmaWNlLmNvbSIsInVjIjoiMjRhOGNiNTI1MTRlNDMyOGJkYThiMGM5MTJiY2JlMTYiLCJzaWduaW5fc3RhdGUiOiJbXCJkdmNfbW5nZFwiLFwiZHZjX2NtcFwiLFwiZHZjX2RtamRcIixcImttc2lcIl0iLCJ2ZXIiOiJFeGNoYW5nZS5DYWxsYmFjay5WMSIsImFwcGN0eHNlbmRlciI6Ik93YURvd25sb2FkQDgwZjNlYTdkLTBlMjktNDU5MS05ZjYwLWJjNTIwMWE5MTQ5OSIsImlzc3JpbmciOiJXVyIsImFwcGN0eCI6IntcIm1zZXhjaHByb3RcIjpcIm93YVwiLFwicHVpZFwiOlwiMTE1MzgwMTExOTgzNzA5OTQ5MlwiLFwic2NvcGVcIjpcIk93YURvd25sb2FkXCIsXCJvaWRcIjpcIjJjNWY0NzZiLTJiNWItNDQyZi05ODljLTBjMzIzZTJiZjVmN1wiLFwicHJpbWFyeXNpZFwiOlwiUy0xLTUtMjEtNDMwNDEwNTg4LTYwNDAyMzM0OS0yMDcxNDcxMTM0LTQzOTUyNDk3XCJ9IiwibmJmIjoxNjQzNzM5NTM4LCJleHAiOjE2NDM3NDAxMzgsImlzcyI6IjAwMDAwMDAyLTAwMDAtMGZmMS1jZTAwLTAwMDAwMDAwMDAwMEA4MGYzZWE3ZC0wZTI5LTQ1OTEtOWY2MC1iYzUyMDFhOTE0OTkiLCJhdWQiOiIwMDAwMDAwMi0wMDAwLTBmZjEtY2UwMC0wMDAwMDAwMDAwMDAvYXR0YWNobWVudHMub2ZmaWNlLm5ldEA4MGYzZWE3ZC0wZTI5LTQ1OTEtOWY2MC1iYzUyMDFhOTE0OTkiLCJoYXBwIjoib3dhIn0.OkrFCN54CjtO0t_unIm4TDBN0UEAzhSPZt_wXN9mVO1mCJ-VOi4_Us_afwarRcM6wxNb9HfriuSubMsjDLdxjxh0MQlPeFm7iBBxiipouNkMb1Dbvb7X4EnJ4DCkjNlQnikUZKIkVbiSQ2UOfsTuVuLADSZEW3Knt_8bmU7I-BhnSHUJ8KSIscS8suthsgXgc4gIXsNXwvNwO5f3pvrE-KGiAsAq2x4c1KG7srdl4S6_iet6CJB8CKnaihGh8te-FOxVAyyHKriRIYpjkJDet8M6h46pCOubf-cGR5CgNiJOySZFTEt1MDAAjvZIU9xtx0mIr6BWAV3Aj0bRZPIiwg&amp;X-OWA-CANARY=ss06TZQr9EmCFu4Q3uGFbKBVpHCv5dkYz54hZPgT5pjJ_YVJWwGm48rmvgbQ_RFq_TsW0puWoDs.&amp;owa=outlook.office.com&amp;scriptVer=20220121003.04&amp;animation=true' width='200' height='53' id='x__x0000_i1026' alt='https://cloud.metalsa.com/IFP/resources/img/logo_color.png' style='width: 2.0833in; height: 0.5486in; cursor: pointer; min-height: auto; min-width: auto;' crossorigin='use-credentials' class='_17IHdLFIYqNWcRRfHpU3up'></span></b><b><span style='font-size:18.0pt; font-family:Roboto; color:#C3CED9'></span></b></p>");
		template.append("                        </td>");
		template.append("                     </tr>");
		template.append("                  </tbody>");
		template.append("               </table>");
		template.append("               <p class='x_MsoNormal'><span style='display:none'>&nbsp;</span></p>");
		template.append("               <table class='x_MsoNormalTable' border='0' cellspacing='0' cellpadding='0' width='100%' style='width:100.0%; background:#FAFAFA; border-collapse:collapse; border-spacing:0'>");
		template.append("                  <tbody>");
		template.append("                     <tr>");
		template.append("                        <td valign='top' style='padding:0cm 0cm 0cm 0cm'>");
		template.append("                           <div>");
		template.append("                              <div>");
		template.append("                                 <p class='x_MsoNormal' style='line-height:15.0pt'><span style='font-size:15.0pt'>&nbsp;</span></p>");
		template.append("                              </div>");
		template.append("                           </div>");
		template.append("                           <table class='x_MsoNormalTable' border='0' cellspacing='0' cellpadding='0' width='100%' style='width:100.0%; border-collapse:collapse; border-spacing:0'>");
		template.append("                              <tbody>");
		template.append("                                 <tr>");
		template.append("                                    <td valign='top' style='padding:0cm 15.0pt 0cm 15.0pt; word-break:break-word; word-wrap:break-word'></td>");
		template.append("                                 </tr>");
		template.append("                              </tbody>");
		template.append("                           </table>");
		template.append("                           <p class='x_MsoNormal'><span style='font-size:11.0pt; display:none'>&nbsp;</span></p>");
		template.append("                           <table class='x_MsoNormalTable' border='0' cellspacing='0' cellpadding='0' width='100%' style='width:100.0%; border-collapse:collapse; border-spacing:0'>");
		template.append("                              <tbody>");
		template.append("                                 <tr>");
		template.append("                                    <td valign='top' style='padding:0cm 15.0pt 0cm 15.0pt; word-break:break-word; word-wrap:break-word'>");
		template.append("                                       <div>");                                                                                                                                                       
		template.append("                                          <p class='x_MsoNormal' style=''><span style='font-size:12.0pt; font-family:&quot;Arial&quot;,sans-serif'>&nbsp;<span style='color:black'>Se <b>ACEPTARON</b> las solicitudes de cancelación de los siguientes CFDI con UUID <b><br>");
		
		for(String uid:listUid) {
			template.append("&nbsp; &nbsp; &nbsp;&nbsp;");
			template.append(uid);
			template.append("<br>");
			
		}
		template.append("											</b></span></span></p>");
		template.append("                                       </div>");
		template.append("                                    </td>");
		template.append("                                 </tr>");
		template.append("                              </tbody>");
		template.append("                           </table>");
		template.append("                           <p class='x_MsoNormal'><span style='font-size:12.0pt; font-family:&quot;Arial&quot;,sans-serif; display:none'>&nbsp;</span></p>");
		template.append("                           <table class='x_MsoNormalTable' border='0' cellspacing='0' cellpadding='0' width='100%' style='width:100.0%; border-collapse:collapse; border-spacing:0'>");
		template.append("                              <tbody>");
		template.append("                                 <tr style='height:3.0pt'>");
		template.append("                                    <td valign='top' style='padding:0cm 15.0pt 0cm 15.0pt; height:3.0pt; word-break:break-word; word-wrap:break-word'>");
		template.append("                                       <div>");
		template.append("                                          <p class='x_MsoNormal' style=''><span style='font-size:12.0pt; font-family:&quot;Arial&quot;,sans-serif; color:black'>&nbsp;</span></p>");
		template.append("                                       </div>");
		template.append("                                    </td>");
		template.append("                                 </tr>");
		template.append("                              </tbody>");
		template.append("                           </table>");
		template.append("                           <div>");
		template.append("                              <p class='x_MsoNormal' style='line-height:15.0pt'><span style='font-size:15.0pt'></span></p>");
		template.append("                           </div>");
		template.append("                        </td>");
		template.append("                     </tr>");
		template.append("                  </tbody>");
		template.append("               </table>");
		template.append("             </div>");
		template.append("         </div>");
		template.append("      </div>");
		template.append("   </div>");
		template.append(" </div>");
		

		
		
	    
		return template.toString();
		
	}

	
	public String plantillaAceptadoProeza(List<String>  listUid) {
		 
		StringBuilder template = new StringBuilder();
		
		template.append("<div role='region' tabindex='-1' aria-label='Cuerpo del mensaje' class='Vzh05neKQu87GUy5UviOc QMubUjbS-BOly_BTHEZj7 allowTextSelection'> ");
		template.append("   <div>");
		template.append("      <style>");
		template.append("         <!--");
		template.append("            @font-face");
		template.append("            	{font-family:'Cambria Math'}");
		template.append("            @font-face");
		template.append("            	{font-family:Calibri");
		template.append("           @font-");
		template.append("            	{font-family:Roboto}");
		template.append("           .rps_2229 p.x_MsoNormal, .rps_2229 li.x_MsoNormal, .rps_2229 div.x_MsoNormal");
		template.append("            	{margin:0cm;");
		template.append("            	margin-bottom:.0001pt");
		template.append("            	font-size:10.0pt;");
		template.append("            	font-family:'Calibri',sans-serif}");
		template.append("            .rps_2229 a:link, .rps_2229 span.x_MsoHyperlink");
		template.append("            	{color:blue;");
		template.append("            	text-decoration:underline}");
		template.append("            .rps_2229 a:visited, .rps_2229 span.x_MsoHyperlinkFollowed");
		template.append("            	{color:purple;");
		template.append("            	text-decoration:underline}");
		template.append("            .rps_2229 p.x_MsoListParagraph, .rps_2229 li.x_MsoListParagraph, .rps_2229 div.x_MsoListParagraph");
		template.append("            	{margin-top:0cm;");
		template.append("            	margin-right:0cm;");
		template.append("            	margin-bottom:0cm;");
		template.append("            	margin-left:36.0pt;");
		template.append("            	margin-bottom:.0001pt;");
		template.append("            	font-size:10.0pt;");
		template.append("            	font-family:'Calibri',sans-serif}");
		template.append("            .rps_2229 p.x_msonormal0, .rps_2229 li.x_msonormal0, .rps_2229 div.x_msonormal0");
		template.append("            	{margin-right:0cm;");
		template.append("            	margin-left:0cm;");
		template.append("            	font-size:10.0pt;");
		template.append("            	font-family:'Calibri',sans-serif}");
		template.append("            .rps_2229 span.x_EmailStyle19");
		template.append("            	{font-family:'Arial',sans-serif;");
		template.append("            	color:black;");
		template.append("           	font-weight:normal;");
		template.append("            	font-style:normal;");
		template.append("            	text-decoration:none none}");
		template.append("            .rps_2229 span.x_EmailStyle20");
		template.append("            	{font-family:'Arial',sans-serif;");
		template.append("            	color:black;");
		template.append("            	font-weight:normal;");
		template.append("            	font-style:normal;");
		template.append("            	text-decoration:none none}");
		template.append("            .rps_2229 .x_MsoChpDefault");
		template.append("            	{font-size:10.0pt}");
		template.append("            @page WordSection1");
		template.append("            	{margin:72.0pt 72.0pt 72.0pt 72.0pt}");
		template.append("            .rps_2229 div.x_WordSection1");
		template.append("            	{}");
		template.append("            -->");
		template.append("      </style>");
		template.append("      <div class='rps_2229'>");
		template.append("         <div lang='es-419' link='blue' vlink='purple'>");
		template.append("            <div class='x_WordSection1'>");
		template.append("               <table class='x_MsoNormalTable' border='0' cellspacing='0' cellpadding='0' width='100%' style='width:100.0%; border-collapse:collapse'>");
		template.append("                  <tbody>");
		template.append("  <tr> ");
		template.append("   <td valign='top' style='padding:1.5pt 0cm 20.25pt 0cm'> ");
		template.append(" 	<p class='x_MsoNormal'><b><span style='font-size:18.0pt; font-family:Roboto; color:#C3CED9'><img data-imagetype='External' src='https://policycenter.proeza.com.mx/BuzonProeza/resources/img/LogoProeza.png' width='200' height='53' id='x__x0000_i1025' style='width:2.0833in; height:.5486in'></span></b></p> ");
		template.append("  </td> ");
		template.append(" </tr> ");
		//template.append("                     <tr>");
		//template.append("                        <td valign='top' style='padding:1.5pt 0cm 20.25pt 0cm'>");
		//template.append("                           <p class='x_MsoNormal'><b><span style='font-size:18.0pt; font-family:Roboto; color:#C3CED9'><img data-imagetype='AttachmentByCid' originalsrc='cid:image001.png@01D81135.93AE4440' data-custom='AAMkAGVkMTdiMGE5LTBmNTEtNDAzOC04OTZjLTU3YWVmYTQzMDNiOQBGAAAAAABoHSPBEvNCRLztzV%2B6gQnnBwD8Z%2Bw2ylUxQIZ0eXwtiXKCAAAAAAEMAAD8Z%2Bw2ylUxQIZ0eXwtiXKCAAB6vMj%2FAAABEgAQAMuXScwzo%2F5GrjHE%2FW9xQuY%3D' naturalheight='0' naturalwidth='0' src='https://attachments.office.net/owa/miguel.velazquez%40contractor.metalsa.com/service.svc/s/GetAttachmentThumbnail?id=AAMkAGVkMTdiMGE5LTBmNTEtNDAzOC04OTZjLTU3YWVmYTQzMDNiOQBGAAAAAABoHSPBEvNCRLztzV%2B6gQnnBwD8Z%2Bw2ylUxQIZ0eXwtiXKCAAAAAAEMAAD8Z%2Bw2ylUxQIZ0eXwtiXKCAAB6vMj%2FAAABEgAQAMuXScwzo%2F5GrjHE%2FW9xQuY%3D&amp;thumbnailType=2&amp;token=eyJhbGciOiJSUzI1NiIsImtpZCI6IkZBRDY1NDI2MkM2QUYyOTYxQUExRThDQUI3OEZGMUIyNzBFNzA3RTkiLCJ0eXAiOiJKV1QiLCJ4NXQiOiItdFpVSml4cThwWWFvZWpLdDRfeHNuRG5CLWsifQ.eyJvcmlnaW4iOiJodHRwczovL291dGxvb2sub2ZmaWNlLmNvbSIsInVjIjoiMjRhOGNiNTI1MTRlNDMyOGJkYThiMGM5MTJiY2JlMTYiLCJzaWduaW5fc3RhdGUiOiJbXCJkdmNfbW5nZFwiLFwiZHZjX2NtcFwiLFwiZHZjX2RtamRcIixcImttc2lcIl0iLCJ2ZXIiOiJFeGNoYW5nZS5DYWxsYmFjay5WMSIsImFwcGN0eHNlbmRlciI6Ik93YURvd25sb2FkQDgwZjNlYTdkLTBlMjktNDU5MS05ZjYwLWJjNTIwMWE5MTQ5OSIsImlzc3JpbmciOiJXVyIsImFwcGN0eCI6IntcIm1zZXhjaHByb3RcIjpcIm93YVwiLFwicHVpZFwiOlwiMTE1MzgwMTExOTgzNzA5OTQ5MlwiLFwic2NvcGVcIjpcIk93YURvd25sb2FkXCIsXCJvaWRcIjpcIjJjNWY0NzZiLTJiNWItNDQyZi05ODljLTBjMzIzZTJiZjVmN1wiLFwicHJpbWFyeXNpZFwiOlwiUy0xLTUtMjEtNDMwNDEwNTg4LTYwNDAyMzM0OS0yMDcxNDcxMTM0LTQzOTUyNDk3XCJ9IiwibmJmIjoxNjQzNzM5NTM4LCJleHAiOjE2NDM3NDAxMzgsImlzcyI6IjAwMDAwMDAyLTAwMDAtMGZmMS1jZTAwLTAwMDAwMDAwMDAwMEA4MGYzZWE3ZC0wZTI5LTQ1OTEtOWY2MC1iYzUyMDFhOTE0OTkiLCJhdWQiOiIwMDAwMDAwMi0wMDAwLTBmZjEtY2UwMC0wMDAwMDAwMDAwMDAvYXR0YWNobWVudHMub2ZmaWNlLm5ldEA4MGYzZWE3ZC0wZTI5LTQ1OTEtOWY2MC1iYzUyMDFhOTE0OTkiLCJoYXBwIjoib3dhIn0.OkrFCN54CjtO0t_unIm4TDBN0UEAzhSPZt_wXN9mVO1mCJ-VOi4_Us_afwarRcM6wxNb9HfriuSubMsjDLdxjxh0MQlPeFm7iBBxiipouNkMb1Dbvb7X4EnJ4DCkjNlQnikUZKIkVbiSQ2UOfsTuVuLADSZEW3Knt_8bmU7I-BhnSHUJ8KSIscS8suthsgXgc4gIXsNXwvNwO5f3pvrE-KGiAsAq2x4c1KG7srdl4S6_iet6CJB8CKnaihGh8te-FOxVAyyHKriRIYpjkJDet8M6h46pCOubf-cGR5CgNiJOySZFTEt1MDAAjvZIU9xtx0mIr6BWAV3Aj0bRZPIiwg&amp;X-OWA-CANARY=ss06TZQr9EmCFu4Q3uGFbKBVpHCv5dkYz54hZPgT5pjJ_YVJWwGm48rmvgbQ_RFq_TsW0puWoDs.&amp;owa=outlook.office.com&amp;scriptVer=20220121003.04&amp;animation=true' width='200' height='53' id='x__x0000_i1026' alt='https://cloud.metalsa.com/IFP/resources/img/logo_color.png' style='width: 2.0833in; height: 0.5486in; cursor: pointer; min-height: auto; min-width: auto;' crossorigin='use-credentials' class='_17IHdLFIYqNWcRRfHpU3up'></span></b><b><span style='font-size:18.0pt; font-family:Roboto; color:#C3CED9'></span></b></p>");
		//template.append("                        </td>");
		//template.append("                     </tr>");
		template.append("                  </tbody>");
		template.append("               </table>");
		template.append("               <p class='x_MsoNormal'><span style='display:none'>&nbsp;</span></p>");
		template.append("               <table class='x_MsoNormalTable' border='0' cellspacing='0' cellpadding='0' width='100%' style='width:100.0%; background:#FAFAFA; border-collapse:collapse; border-spacing:0'>");
		template.append("                  <tbody>");
		template.append("                     <tr>");
		template.append("                        <td valign='top' style='padding:0cm 0cm 0cm 0cm'>");
		template.append("                           <div>");
		template.append("                              <div>");
		template.append("                                 <p class='x_MsoNormal' style='line-height:15.0pt'><span style='font-size:15.0pt'>&nbsp;</span></p>");
		template.append("                              </div>");
		template.append("                           </div>");
		template.append("                           <table class='x_MsoNormalTable' border='0' cellspacing='0' cellpadding='0' width='100%' style='width:100.0%; border-collapse:collapse; border-spacing:0'>");
		template.append("                              <tbody>");
		template.append("                                 <tr>");
		template.append("                                    <td valign='top' style='padding:0cm 15.0pt 0cm 15.0pt; word-break:break-word; word-wrap:break-word'></td>");
		template.append("                                 </tr>");
		template.append("                              </tbody>");
		template.append("                           </table>");
		template.append("                           <p class='x_MsoNormal'><span style='font-size:11.0pt; display:none'>&nbsp;</span></p>");
		template.append("                           <table class='x_MsoNormalTable' border='0' cellspacing='0' cellpadding='0' width='100%' style='width:100.0%; border-collapse:collapse; border-spacing:0'>");
		template.append("                              <tbody>");
		template.append("                                 <tr>");
		template.append("                                    <td valign='top' style='padding:0cm 15.0pt 0cm 15.0pt; word-break:break-word; word-wrap:break-word'>");
		template.append("                                       <div>");                                                                                                                                                       
		template.append("                                          <p class='x_MsoNormal' style=''><span style='font-size:12.0pt; font-family:&quot;Arial&quot;,sans-serif'>&nbsp;<span style='color:black'>Se <b>ACEPTARON</b> las solicitudes de cancelación de los siguientes CFDI con UUID <b><br>");
		
		for(String uid:listUid) {
			template.append("&nbsp; &nbsp; &nbsp;&nbsp;");
			template.append(uid);
			template.append("<br>");
			
		}
		template.append("											</b></span></span></p>");
		template.append("                                       </div>");
		template.append("                                    </td>");
		template.append("                                 </tr>");
		template.append("                              </tbody>");
		template.append("                           </table>");
		template.append("                           <p class='x_MsoNormal'><span style='font-size:12.0pt; font-family:&quot;Arial&quot;,sans-serif; display:none'>&nbsp;</span></p>");
		template.append("                           <table class='x_MsoNormalTable' border='0' cellspacing='0' cellpadding='0' width='100%' style='width:100.0%; border-collapse:collapse; border-spacing:0'>");
		template.append("                              <tbody>");
		template.append("                                 <tr style='height:3.0pt'>");
		template.append("                                    <td valign='top' style='padding:0cm 15.0pt 0cm 15.0pt; height:3.0pt; word-break:break-word; word-wrap:break-word'>");
		template.append("                                       <div>");
		template.append("                                          <p class='x_MsoNormal' style=''><span style='font-size:12.0pt; font-family:&quot;Arial&quot;,sans-serif; color:black'>&nbsp;</span></p>");
		template.append("                                       </div>");
		template.append("                                    </td>");
		template.append("                                 </tr>");
		template.append("                              </tbody>");
		template.append("                           </table>");
		template.append("                           <div>");
		template.append("                              <p class='x_MsoNormal' style='line-height:15.0pt'><span style='font-size:15.0pt'></span></p>");
		template.append("                           </div>");
		template.append("                        </td>");
		template.append("                     </tr>");
		template.append("                  </tbody>");
		template.append("               </table>");
		template.append("             </div>");
		template.append("         </div>");
		template.append("      </div>");
		template.append("   </div>");
		template.append(" </div>");
		

		
		
	    
		return template.toString();
		
	}

}
