package com.douglas.budgeting.infrastructure.persistence.repository;

import com.douglas.budgeting.domain.Category;
import com.douglas.budgeting.infrastructure.persistence.entity.TransactionEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface TransactionEntityRepository
        extends CrudRepository<TransactionEntity, UUID> {

    List<TransactionEntity> findAllByCategory(Category category);
}