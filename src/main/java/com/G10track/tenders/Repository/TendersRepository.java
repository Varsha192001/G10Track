package com.G10track.tenders.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.G10track.tenders.Entity.Tenders;

public interface TendersRepository extends MongoRepository<Tenders, Long>{

}
