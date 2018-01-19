package library.dto.write;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String street;
    private String city;
    private String email;
}
