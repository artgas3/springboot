package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepositry extends JpaRepository<DemoEntity, Integer> {

}
