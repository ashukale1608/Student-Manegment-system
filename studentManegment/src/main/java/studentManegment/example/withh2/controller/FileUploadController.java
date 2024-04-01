// package studentManegment.example.withh2.controller;

// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.multipart.MultipartFile;
// import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

// import studentManegment.example.withh2.helper.FileUploadHelper;

// @RestController
// public class FileUploadController {

//     private final FileUploadHelper fileUploadHelper;

//     public FileUploadController(FileUploadHelper fileUploadHelper) {
//         this.fileUploadHelper = fileUploadHelper;
//     }

//     @PostMapping("/uploadFile")
//     public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
//         if(file.isEmpty()){
//             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request must content file");
//         }else if(!file.getContentType().equals("image/jpeg")){
//             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Only JPEG and IMAGE");
//         }else{
//            try{
//             boolean f = fileUploadHelper.uploadFile(file);
//             if(f){
//                 return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/").path(file.getOriginalFilename()).toUriString());
//             }else{
//                 return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Faild");
//             }
//            }catch(Exception e){
//             e.printStackTrace();
//             return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Faild");

//            }
           
//         }
//     }
// }