package datn.udpm.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import datn.udpm.entity.Capacity;

public interface CapacityRespository extends JpaRepository<Capacity,Integer> {

}
