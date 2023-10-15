package com.prj.chatapp.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "Grp")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Grp {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String grpId;
	private String grpName;
	private String grpDesc;
	private String grpPic;
	
	@ManyToMany
	@JoinTable(name = "user_grp", joinColumns = @JoinColumn(name = "grp_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private Set<User> users;
	
	@OneToMany(mappedBy = "grp")
	private Set<GrpChat> grpChats;
}
