package com.hao.m.respository;

import com.hao.m.domain.ZhUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<ZhUserEntity, Integer> {

}
