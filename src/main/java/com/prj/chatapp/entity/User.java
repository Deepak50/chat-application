package com.prj.chatapp.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "User")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
	    @Id
	    private String userId;
	    private String email;
	    private String password;
	    private boolean active;
	    private String roles;
	    private String profilePic;
	    @OneToMany(mappedBy = "toUser")
	    private Set<Chat> chats = new HashSet<>();
	    @ManyToMany(mappedBy = "users")
	    private Set<Grp> grps = new HashSet<>();
	    private Date joinedDate;
}
