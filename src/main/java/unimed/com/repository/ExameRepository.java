package unimed.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import unimed.com.model.Exame;

@Repository
public interface ExameRepository extends JpaRepository<Exame,Long>{
	

}
