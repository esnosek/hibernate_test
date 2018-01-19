package library.dto.write;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MagazineDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private String title;
    private Integer publisherId;
    private List<Integer> ids;

}