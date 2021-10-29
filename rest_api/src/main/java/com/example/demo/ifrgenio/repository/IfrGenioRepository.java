package com.example.demo.ifrgenio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

import com.example.demo.member.domain.Member;

@Repository
public interface IfrGenioRepository extends JpaRepository<Member,Long>, QuerydslPredicateExecutor<Member>{
//	List<Member> findAll();
		
}