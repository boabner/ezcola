package com.mentoria.arquitetura.escola.infrastructure.adapters.persistence;

import com.mentoria.arquitetura.escola.infrastructure.adapters.documents.AlunoDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends MongoRepository<AlunoDocument, Object> {

}
