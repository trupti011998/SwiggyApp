package com.example.SwiggyProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SwiggyProject.Model.Host;

@Repository
public interface HostRepository extends JpaRepository<Host,Long>{

}
