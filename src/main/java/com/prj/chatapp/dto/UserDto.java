package com.prj.chatapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	private String userId;
	private String password;
	private Boolean active;
	private String roles;
	private String test;
}
