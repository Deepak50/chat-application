package com.prj.chatapp.entity;

import java.sql.Clob;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Chat")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Chat {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String chatId;
	
	@ManyToOne
	@JoinColumn(name = "from_user_id")
	private User fromUser;
	
	@ManyToOne
	@JoinColumn(name = "to_user_id")
	private User toUser;
	private Clob chatDesc;
	private Date sentTime;
	private Date deliveredTime;
	private Date seenTime;
}
