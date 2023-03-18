package com.develhope.Hybernate.repository;

import com.develhope.Hybernate.entity.Classes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<Classes, Integer> {

}

