package com.suren.springdocker.service;

import com.suren.springdocker.entity.Errors;
import com.suren.springdocker.repository.ErrorsRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ErrorsService {

    @Autowired
    private ErrorsRepository errorsRepository;

    public List<Errors> getAllErrors() {
        return errorsRepository.findAll();
    }

    public void saveError(Errors error) {
        errorsRepository.save(error);
    }

    @Transactional
    public void deleteErrorById(Long id) {
        Optional<Errors> optionalError = errorsRepository.findById(id);
        if (optionalError.isPresent()) {
            Errors errorToDelete = optionalError.get();
            errorsRepository.delete(errorToDelete);
        } else {
            throw new RuntimeException("Error not found with id: " + id);
        }
    }

}
