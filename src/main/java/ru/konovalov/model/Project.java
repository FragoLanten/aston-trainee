package ru.konovalov.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Project {

    private Long id;

    private String projectName;

    private Integer cost;
}
