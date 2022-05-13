package com.example.businessintelligence.repository;

import com.example.businessintelligence.entity.CustomerNode;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName: CustomerNodeRepository
 * @Description: TODO
 * @Author: Tangt
 * @Date: 2022/5/13 20:18
 * @Version: v1.0
 */
@Repository
public interface CustomerNodeRepository extends Neo4jRepository<CustomerNode,Long> {
    CustomerNode findByName(String name);
    void deleteByName(String name);
    /**
     * 根据节点名称查找关系
     * @param name
     * @return
     */
    @Query("MATCH c=(cf:CustomerNode)-[r:CustomerRelation]->(ct:CustomerNode) WHERE ct.name=$name OR cf.name=$name RETURN cf")
    List<CustomerNode> findRelationByCustomerNode(String name);

    @Query("MATCH c=(cf:CustomerNode) WHERE cf.id=$id RETURN cf")
    CustomerNode findNodeById(Long id);
}
