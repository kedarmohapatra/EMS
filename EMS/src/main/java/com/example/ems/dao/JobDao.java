
package com.example.ems.dao;

import java.util.List;

import com.example.ems.domain.Job;

public interface JobDao {

	Job get(String id);

	List<Job> getAll();
}
