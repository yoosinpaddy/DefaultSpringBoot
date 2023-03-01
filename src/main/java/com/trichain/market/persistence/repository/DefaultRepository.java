package com.trichain.market.persistence.repository;


import com.trichain.market.entities.DefaultTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DefaultRepository extends JpaRepository<DefaultTable, String> {
   Optional<DefaultTable> findById(final String id);
}
