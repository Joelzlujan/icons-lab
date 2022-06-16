package com.alkemy.icon.icons.repository;

import com.alkemy.icon.icons.entity.ContinentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinenteRepository extends JpaRepository<ContinentEntity, Long> {

}
