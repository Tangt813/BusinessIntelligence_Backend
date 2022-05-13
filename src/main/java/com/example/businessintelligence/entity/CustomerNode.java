package com.example.businessintelligence.entity;

/**
 * @ClassName: CustomerNode
 * @Description: TODO
 * @Author: Tangt
 * @Date: 2022/5/13 20:13
 * @Version: v1.0
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

@NodeEntity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerNode {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer age;
}
