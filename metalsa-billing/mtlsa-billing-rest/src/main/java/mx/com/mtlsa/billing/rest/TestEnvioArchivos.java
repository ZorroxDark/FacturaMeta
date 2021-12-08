package mx.com.mtlsa.billing.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.axis.encoding.Base64;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.jersey.multipart.FormDataParam;


@Path("/")
public class TestEnvioArchivos {
	
	
	@POST
	@Path("/by/up")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response up(
                   @FormDataParam("someparameter") String param,
                   @FormDataParam("inputfile") File inputfile
                       )
    {
        System.out.println(param);

 		String output = "File uploaded via Jersey based RESTFul Webservice to: ";
 		


 		
 		File file = inputfile;
 		
		  
	    String base64File = "";
        try (FileInputStream imageInFile = new FileInputStream(file)) {
            // Reading a file from file system
            byte fileData[] = new byte[(int) file.length()];
            imageInFile.read(fileData);
            base64File = Base64.encode(fileData);
        } catch (FileNotFoundException e) {
            System.out.println("File not found" + e);
        } catch (IOException ioe) {
            System.out.println("Exception while reading the file " + ioe);
        }
       
        System.out.println("Hola");
        System.out.println(base64File.toString());
 		
 		
 		
 		return Response.status(200).entity(output).build();
    }
	
	
	
	
	 	@POST
	 	@Path("/by/up1")
	    @Consumes(MediaType.MULTIPART_FORM_DATA)
	    public Response upload(InputStream inputfile, @QueryParam("foo") String foo) {
	        // Read file contents from the InputStream and do whatever you need
	 		
	 		String output = "File uploaded via Jersey based RESTFul Webservice to: ";
	 		
	 		
	 		
	 		return Response.status(200).entity(output).build();
	    }
	
	
//	@POST
//	@Path("/upload")
//	@Consumes(MediaType.MULTIPART_FORM_DATA)
//	public Response uploadFile(
//		@FormDataParam("file") InputStream uploadedInputStream,
//		@FormDataParam("file") FormDataContentDisposition fileDetail) {
//	     //Your local disk path where you want to store the file
//	    String uploadedFileLocation = "C://uploadedFiles/" + fileDetail.getFileName();
//	    System.out.println(uploadedFileLocation);
//	    // save it
//	    File  objFile=new File(uploadedFileLocation);
//	    if(objFile.exists())
//	    {
//	        objFile.delete();
//
//	    }
//
//	    saveToFile(uploadedInputStream, uploadedFileLocation);
//
//	    String output = "File uploaded via Jersey based RESTFul Webservice to: " + uploadedFileLocation;
//
//	    return Response.status(200).entity(output).build();
//
//	}
//	private void saveToFile(InputStream uploadedInputStream,
//	        String uploadedFileLocation) {
//
//	    try {
//	        OutputStream out = null;
//	        int read = 0;
//	        byte[] bytes = new byte[1024];
//
//	        out = new FileOutputStream(new File(uploadedFileLocation));
//	        while ((read = uploadedInputStream.read(bytes)) != -1) {
//	            out.write(bytes, 0, read);
//	        }
//	        out.flush();
//	        out.close();
//	    } catch (IOException e) {
//
//	        e.printStackTrace();
//	    }
//
//	}
	
	
//	@POST
//	@Path("/upload")
//	@Consumes("multipart/form-data")
//	public Response uploadFile(MultipartFormDataInput input) throws IOException
//	{
//	    File local;
//	    final String UPLOADED_FILE_PATH = filesRoot; // Check applicationContext-Server.properties file
//
//	    //Get API input data
//	    Map<String, List<InputPart>> uploadForm = input.getFormDataMap();
//
//	    //The file name
//	    String fileName;
//	    String pathFileName = "";
//
//
//	    //Get file data to save
//	    List<InputPart> inputParts = uploadForm.get("attachment");
//
//	    try
//	    {
//	        for (InputPart inputPart : inputParts)
//	        {
//	            //Use this header for extra processing if required
//	            MultivaluedMap<String, String> header = inputPart.getHeaders();
//	            fileName = getFileName(header);
//	            String tmp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//	            pathFileName = "images/upload/" + tmp + '_' + fileName + ".png";
//	            fileName = UPLOADED_FILE_PATH + pathFileName;
//
//	            // convert the uploaded file to input stream
//	            InputStream inputStream = inputPart.getBody(InputStream.class, null);
//
//	            byte[] bytes = IOUtils.toByteArray(inputStream);
//	            // constructs upload file path
//
//	            writeFile(bytes, fileName);
//	            // NOTE : The Target picture boundary is 800x600. Should be specified somewhere else ?
//	            BufferedImage scaledP = getScaledPicture(fileName, 800, 600, RenderingHints.VALUE_INTERPOLATION_BILINEAR, false);
//	            ByteArrayOutputStream os = new ByteArrayOutputStream();
//	            ImageIO.write(scaledP, "png", os);
//	            local = new File(fileName);
//	            ImageIO.write(scaledP, "png", local);
//	        }
//	    }
//	    catch (Exception e)
//	    {
//	        e.printStackTrace();
//	        return Response.serverError().build();
//	    }
//	    return Response.status(201).entity(pathFileName).build();
//
//	}

}
