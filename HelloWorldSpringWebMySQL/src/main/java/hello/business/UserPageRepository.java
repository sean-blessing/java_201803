package hello.business;

import org.springframework.data.repository.PagingAndSortingRepository;

//This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//CRUD refers Create, Read, Update, Delete
public interface UserPageRepository extends PagingAndSortingRepository<User, Integer> {
	User findByEmail(String email);
}
