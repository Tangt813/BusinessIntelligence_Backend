package com.example.businessintelligence.repository;

import com.example.businessintelligence.entity.CustomerRelation;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: CustomerRelationRepository
 * @Description: TODO
 * @Author: Tangt
 * @Date: 2022/5/13 20:17
 * @Version: v1.0
 */
@Repository
public interface CustomerRelationRepository extends Neo4jRepository<CustomerRelation,Long> {
}
