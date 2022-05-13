package com.example.businessintelligence.entity;

import lombok.*;
import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;
import org.springframework.data.neo4j.core.schema.*;

import java.sql.Date;

/**
 * @ClassName: CustomerRelation
 * @Description: TODO
 * @Author: Tangt
 * @Date: 2022/5/13 20:15
 * @Version: v1.0
 */
@RelationshipEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRelation {
    @Id
    @GeneratedValue
    private Long id;
    private Date createTime;
    private String remark;

    @StartNode
    private CustomerNode customerFrom;

    @EndNode
    private CustomerNode customerTo;

    public CustomerRelation(CustomerNode customerFrom,CustomerNode customerTo,String remark){
        this.customerFrom=customerFrom;
        this.customerTo=customerTo;
        this.remark=remark;
    }
}
