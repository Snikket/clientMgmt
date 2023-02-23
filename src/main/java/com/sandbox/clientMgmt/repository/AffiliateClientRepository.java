package com.sandbox.clientMgmt.repository;

import com.sandbox.clientMgmt.entity.AffiliateClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AffiliateClientRepository extends JpaRepository<AffiliateClient,String> { }