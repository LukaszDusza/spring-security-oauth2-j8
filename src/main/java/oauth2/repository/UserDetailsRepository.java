package oauth2.repository;

import oauth2.model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserDetailsRepository extends JpaRepository<UserInfo, Integer> {


    UserInfo findByUserName(String userName);


}
