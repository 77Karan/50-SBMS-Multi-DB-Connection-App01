package in.ashokit.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.book.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>
{
	

}
