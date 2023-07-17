package com.ateneaips.ateneaips.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ateneaips.ateneaips.entity.Especialidad;

@RepositoryRestResource(collectionResourceRel = "especialidades", path="especialidades")
    @CrossOrigin(origins = "http://localhost:3000")
public interface EspecialidadRepository extends PagingAndSortingRepository<Especialidad, Long>, CrudRepository<Especialidad, Long>{

}
