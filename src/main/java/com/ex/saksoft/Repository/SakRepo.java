package com.ex.saksoft.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ex.saksoft.Model.SakModel;

public interface SakRepo extends JpaRepository<SakModel,Integer> {

	SakModel findByFirstName(String firstName);
}
