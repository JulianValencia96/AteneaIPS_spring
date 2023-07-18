package com.ateneaips.ateneaips.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ateneaips.ateneaips.entity.Medico;

@RepositoryRestResource(collectionResourceRel = "medicos", path="medicos")
    @CrossOrigin(origins = "http://localhost:3000")
public interface MedicoRepository extends PagingAndSortingRepository<Medico, Long>, CrudRepository<Medico, Long>{

}
