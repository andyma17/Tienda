
package com.practica01.service;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


public interface FirebaseStorageService {
    
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    //BucketName es el <id del proyecto> +.appspot.com
    final String BucketName = "practica01-91dd1.appspot.com";//se ve en la pagina de Firebase

    final String rutaSuperiorStorage = "practica01";//nombre del proyecto

    final String rutaJsonFile = "firebase";//folder donde esat el archivo json

    final String archivoJsonFile = "practica01-91dd1-firebase-adminsdk-2es0g-6b18594abd";//cambia de persona a persona
    
    
    
}
