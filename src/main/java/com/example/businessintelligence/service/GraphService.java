package com.example.businessintelligence.service;

import com.example.businessintelligence.entity.CustomerNode;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: GraphService
 * @Description: TODO
 * @Author: Tangt
 * @Date: 2022/5/13 20:19
 * @Version: v1.0
 */
@Service
public interface GraphService {
    void deleteNodeById(Long id);
    void deleteNodeByName(String name);
    void delete();
    void addNode(String name,Integer age,String nameTo,String remark);
    void updateNode(Long id,String name,Integer age);
    Iterable<CustomerNode>  queryNodes();
    CustomerNode findByName(String name);
    List<CustomerNode> queryNodes(String name);
}
