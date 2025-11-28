package com.arvato.devbook_be.image;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/images")
public class ImageController {
    private  ImageService imageService;

    public ImageController(ImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<byte[]> getImageById(@PathVariable Long id){
        Image image = imageService.findById(id);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION)
                .contentType(MediaType.parseMediaType(image.getContentType()))
                .body(image.getContent());
    }

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Image> uploadImage(@RequestParam MultipartFile multipartFile){
        try{
            Image image = new Image(multipartFile.getBytes(), multipartFile.getContentType());
            imageService.save(image);
            return ResponseEntity.ok(image);
        }catch (Exception ex){
            return ResponseEntity.badRequest().build();
        }
    }
}
