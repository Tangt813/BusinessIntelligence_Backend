package com.example.businessintelligence.service.serviceImpl;

import com.example.businessintelligence.entity.CustomerNode;
import com.example.businessintelligence.entity.CustomerRelation;
import com.example.businessintelligence.service.GraphService;
import com.example.businessintelligence.repository.CustomerRelationRepository;
import com.example.businessintelligence.repository.CustomerNodeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * @ClassName: GraphServiceImpl
 * @Description: TODO
 * @Author: Tangt
 * @Date: 2022/5/13 20:20
 * @Version: v1.0
 */
@Service
public class GraphServiceImpl implements GraphService {

    @Resource
    private CustomerRelationRepository customerRelationRepository;

    @Resource
    private CustomerNodeRepository customerRepository;

    @Override
    public void deleteNodeById(Long id) {
        customerRepository.deleteById(id);
    }

    @Override
    public void deleteNodeByName(String name) {
        customerRepository.deleteByName(name);
    }

    @Override
    public void delete() {
        customerRepository.deleteAll();
    }

    @Override
    public void addNode(String name, Integer age,String nameTo,String remark) {
        CustomerNode customerNode=new CustomerNode();
        customerNode.setName(name);
        customerNode.setAge(age);
        customerRepository.save(customerNode);

        CustomerNode customerNodeTo=customerRepository.findByName(nameTo);
        if(customerNodeTo !=null){
            CustomerRelation customerRelation=new CustomerRelation(customerNode,customerNodeTo,remark);
            customerRelationRepository.save(customerRelation);
        }
        //此处应该返回提示信息
    }

    /**
     * 根据ID修改节点的值
     * @param id
     * @param name
     * @param age
     */
    @Override
    public void updateNode(Long id,String name, Integer age) {
        CustomerNode customerNode=customerRepository.findNodeById(id);
        customerNode.setName(name);
        customerNode.setAge(age);
        customerRepository.save(customerNode);
    }

    @Override
    public Iterable<CustomerNode> queryNodes() {
        return customerRepository.findAll();
    }

    @Override
    public CustomerNode findByName(String name) {
        return customerRepository.findByName(name);
    }

    @Override
    public List<CustomerNode> queryNodes(String name) {
        return customerRepository.findRelationByCustomerNode(name);
    }
}

