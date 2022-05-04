package com.santander.devweek.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santander.devweek.banklineapi.model.Correntistas;

public interface CorrentistaRepository extends JpaRepository<Correntistas, Integer>{

}
