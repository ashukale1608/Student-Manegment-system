// package studentManegment.example.withh2.helper;

// import java.io.File;
// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Paths;
// import java.nio.file.StandardCopyOption;

// import org.springframework.core.io.ClassPathResource;
// import org.springframework.stereotype.Component;
// import org.springframework.web.multipart.MultipartFile;

// @Component
// public class FileUploadHelper {
    
//     // public final String UPLOAD_FILE_DIR="C:\\Users\\ashu\\Desktop\\ashu\\spring boot\\studentManegment\\src\\main\\resources\\static\\image";
//     public final String UPLOAD_FILE_DIR= new ClassPathResource("static/image/").getFile().getAbsolutePath();

//     // public final String UPLOAD_FILE_DIR = new ClassPathResource("static/image/").getURL().getPath();


//     public FileUploadHelper()throws IOException{
//     }

//     public boolean uploadFile(MultipartFile multipartFile){
//         boolean f=false;
//         try {

//             //if


//             // InputStream inputStreamIs = multipartFile.getInputStream(); 
//             // byte data[] = new byte[inputStreamIs.available()];  
//             // inputStreamIs.read(data);
            
//             // FileOutputStream fileOutputStream = new FileOutputStream(UPLOAD_FILE_DIR+File.separator+multipartFile.getOriginalFilename());
//             // fileOutputStream.write(data);


//             // fileOutputStream.flush();
//             // fileOutputStream.close();

//             //else
//             Files.copy(multipartFile.getInputStream(),Paths.get(UPLOAD_FILE_DIR+ File.separator + multipartFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);

//             f=true;

//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         return f;
//     }
// }
