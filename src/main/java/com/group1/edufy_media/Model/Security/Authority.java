package com.group1.edufy_media.Model.Security;

import jakarta.persistence.*;

@Entity
@Table(name = "authorities")
public class Authority {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int role_ID;

  @ManyToOne
  @JoinColumn(name = "username")
  private User user;

  @Column(name = "authority", length = 50, nullable = false)
  private String authority;

  public Authority() {
  }

  public Authority(int role_ID, User user, String authority) {
    this.role_ID = role_ID;
    this.user = user;
    this.authority = authority;
  }

  public int getRole_ID() {
    return role_ID;
  }

  public void setRole_ID(int auth_ID) {
    this.role_ID = auth_ID;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User username) {
    this.user = username;
  }

  public String getAuthority() {
    return authority;
  }

  public void setAuthority(String authority) {
    this.authority = authority;
  }
}
