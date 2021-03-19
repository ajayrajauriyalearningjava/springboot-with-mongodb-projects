package com.ajay.springbootmongodb.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "todos")
public class TodoDTO {

	@Id
	private String id;
	@NotNull(message = "todo can not be null")
	private String todo;
	@NotNull(message = "description can not be null")
	private String description;
	@NotNull(message = "completed can not be null")
	private Boolean completed;
	private Date createAt;
	private Date updatedAt;
}
