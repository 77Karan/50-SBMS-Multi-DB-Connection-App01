package in.ashokit.book.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="BOOK_TB")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book 
{
	@Id
	private  Integer id;
	
	private String name;

}
