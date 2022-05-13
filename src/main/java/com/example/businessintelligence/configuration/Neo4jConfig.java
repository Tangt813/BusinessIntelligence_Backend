//package com.example.businessintelligence.configuration;
//
//import org.neo4j.driver.internal.SessionFactory;
//import org.springframework.beans.factory.ObjectProvider;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.boot.autoconfigure.transaction.TransactionManagerCustomizers;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.neo4j.core.transaction.Neo4jTransactionManager;
//
///**
// * @ClassName: Neo4jConfig
// * @Description: TODO
// * @Author: Tangt
// * @Date: 2022/5/13 12:47
// * @Version: v1.0
// */
//
////@Configuration
////public class Neo4jConfig {
////
////    private String neo4jUri="neo4j://150.158.47.16:7687";
////
////    private String neo4jUsername="neo4j";
////
////    private String neo4jPassword="123456";
////
////    @Bean
////    public Session getSession(){
////        Driver driver = GraphDatabase.driver(neo4jUri, AuthTokens.basic(neo4jUsername, neo4jPassword));
////        SessionConfig sessionConfig = SessionConfig.defaultConfig();
////        return driver.session(sessionConfig);
////    }
////
////    @Bean
////    public Driver neo4jDriver() {
////        return GraphDatabase.driver(neo4jUri, AuthTokens.basic(neo4jUsername,neo4jPassword));
////    }
////}
//
//@Configuration
//public class Neo4jConfig {
//    @ConditionalOnMissingBean
//    @Bean
//    //spingboot.data里需要transactionManager名字的实例
//    public Neo4jTransactionManager transactionManager(SessionFactory sessionFactory, ObjectProvider<TransactionManagerCustomizers> transactionManagerCustomizers) {
//        Neo4jTransactionManager transactionManager = new Neo4jTransactionManager(sessionFactory);
//        transactionManagerCustomizers.ifAvailable((customizers) -> {
//            customizers.customize(transactionManager);
//        });
//        return transactionManager;
//    }
//}