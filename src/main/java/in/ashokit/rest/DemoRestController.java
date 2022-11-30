package in.ashokit.rest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.book.model.Book;
import in.ashokit.book.repository.BookRepository;
import in.ashokit.user.model.User;
import in.ashokit.user.repository.UserRepository;

@RestController
public class DemoRestController 
{
	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/addData")
	public String addData2DB()
	{
		userRepository.saveAll(Stream.of(new User(1234,"Shiva"),new User(1235,"Sathya"))
				.collect(Collectors.toList()));
		
		bookRepository.saveAll(Stream.of(new Book(104,"HTML"),new Book(103,"Angular"))
				.collect(Collectors.toList()));
		
		return "Data Added Sucessfully";
	}
	
	
	@GetMapping("/getUsers")
	public List<User> getUsers()
	{
		return userRepository.findAll();
	}
	
	@GetMapping("/getBooks")
	public List<Book> getBooks()
	{
		return bookRepository.findAll();
	}

}
