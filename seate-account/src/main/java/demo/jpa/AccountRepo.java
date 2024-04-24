package demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.Account;

public interface AccountRepo extends JpaRepository<Account, Long> {

}
