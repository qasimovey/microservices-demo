package az.company.event.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @Author QasimovEY on 13.05.21
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Event {

    private String uuid;
    private String message;
    private String source;
    private String operationId;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private String generationTime;

}
