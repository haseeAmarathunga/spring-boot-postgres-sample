package com.hasee.postgres.repository;

import com.hasee.postgres.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITestRepository extends JpaRepository<Test, Long>
{
}
