package com.prj.chatapp.entity;

import java.util.Date;

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
@Table(name = "GrpChat")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GrpChat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String grpChatId;
	
	@ManyToOne
	@JoinColumn(name = "from_user_id")
	private User fromUser;
	
	@ManyToOne
	@JoinColumn(name = "grp_id")
	private Grp grp;
	
	private String chatDesc;
	private Date sentTime;
	private Date deliveredTime;
	private Date seenTime;
}
