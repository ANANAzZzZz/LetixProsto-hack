package suai.vladislav.letixprosto.models;

import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document(collection = "user")
public class User {
    @Id
    private String _id;
    private String username;
    private String password;
    private String name;
    private String lastName;
}
