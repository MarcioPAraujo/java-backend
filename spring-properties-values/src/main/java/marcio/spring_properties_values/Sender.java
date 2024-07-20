package marcio.spring_properties_values;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "sender")
/* tthis annotation is saying that the attributes of this object can be filled   with datas from 'application.properties' file
 * the prefix is defined in the 'application.properties' file
 */
public class Sender {
    private String name;
    private String email;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
