package tk.hadeslee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tk.hadeslee.domain.User;

/**
 * Project: spring-boot-hello-world
 * FileName: UserRepository
 * Date: 2016-01-21
 * Time: 오후 3:06
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
