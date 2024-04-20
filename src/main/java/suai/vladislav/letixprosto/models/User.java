package suai.vladislav.letixprosto.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "user")
@Data
public class User {
    @Id
    private String _id;
    private String username;
    private String password;
    private String name;
    private String lastname;
}
