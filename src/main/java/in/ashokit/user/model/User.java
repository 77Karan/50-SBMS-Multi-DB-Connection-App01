package in.ashokit.user.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="USER_TB")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User 
{
	@Id
	private Integer id;
	
	private String userName;
	

}
