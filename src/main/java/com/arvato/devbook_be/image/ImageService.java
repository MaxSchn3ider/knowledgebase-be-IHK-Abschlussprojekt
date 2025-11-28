package com.arvato.devbook_be.image;

import com.arvato.devbook_be.common.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ImageService {
    private final ImageRepository imageRepository;

    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    public Image findById(Long id) {
        return imageRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Image with id " + id + " not found"));
    }

    public Image save(Image image){
        return imageRepository.save(image);
    }
}
