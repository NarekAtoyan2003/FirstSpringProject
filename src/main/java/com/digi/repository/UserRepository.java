package com.digi.repository;

import com.digi.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository/*annotation-i mijocov asum enq - run aneluc sarqi UserRepository-i bean, heto @autoWired annotation ov kancum enq es
sarqac bean y*/
public interface UserRepository extends JpaRepository<User,Integer> {


    List<User> getByName(String name);
    List<User> getByAgeBetween(int minAge, int maxAge);


}
